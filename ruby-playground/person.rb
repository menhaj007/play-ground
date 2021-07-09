class Person
    attr_accessor :name
    @@all = []
    def self.all
      @@all
    end
  
    def self.create(name)
      person = self.new
      person.name = name
      @@all << person
    end
  
    def self.print_all
      self.all.each{|person| puts "#{person.name}"}
    end
  end
  
  Person.create("Ada Lovelace")
  Person.create("Grace Hopper")
  
  Person.print_all 
  








# class Person
#     attr_accessor :name
#     @@all = []
    
#     def self.all
#       @@all
#     end
  
#     def self.create(name)
#       person = self.new
#       person.name = name
#       @@all << person
#     end
#   end
  
#   Person.create("Ada Lovelace")
#   Person.create("Grace Hopper")
  
#   # Printing each person
#   Person.all.each do |person|
#     puts "#{person.name}"
#   end 