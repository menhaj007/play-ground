class Animal
    attr_accessor :name
    
    def initialize(newAnimal)
        @name = newAnimal
    end

    def species
      puts @name
    end
  
    def say_species
      puts "Hi! I'm a #{species}"
    end
    
end 

# maru = Animal.new
# maru.say_species

frederick = Animal.new("bull")
frederick.species