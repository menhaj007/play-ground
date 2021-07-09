require 'pry'
require './config/app.rb'
require './models/student.rb'

puts "Running sql"

James = Student.new("Jaan Agaha", "Gul Ahamd")


sql = <<-SQL
  CREATE TABLE IF NOT EXISTS students (
  id INTEGER PRIMARY KEY,
  firstname TEXT,
  lastname TEXT
  )
SQL

# Remember, the previous step has to run first so that `connection` is set!
ActiveRecord::Base.connection.execute(sql)

sql2 = <<-SQL
insert into students(firstname, lastname) values("James", "Tony")
SQL
ActiveRecord::Base.connection.execute(sql2)

sql3 = <<-SQL
    select * from students
SQL
puts ActiveRecord::Base.connection.execute(sql3)



# puts "Finish SQL"



Pry.start