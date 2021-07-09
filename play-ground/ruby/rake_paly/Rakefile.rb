require 'pry'
namespace :db do
    task :migrate => :app do
        sql = <<-SQL
        CREATE TABLE IF NOT EXISTS users(
            id INTEGER PRIMARY KEY,
            fullname TEXT
        )
        SQL
        ActiveRecord::Base.connection.execute(sql)
    end
    task :insert => :app do
        require './db/insert.rb'
    end
    task :read => :app do
        require './db/read.rb'
    end
end
namespace :users do
    task :column_names => :app do
        puts User.column_names
    end
end
task :console => :app do
    Pry.start
end

task :app do
    require_relative './config/app.rb'
end

# task :userFile do
#     require_relative './lib/user.rb'
# end

# task :console => :app do
#     pry.start
# end