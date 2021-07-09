class Team
    attr_reader :name, :city
    @@all = []

    def initialize(name, city)
        @name = name
        @city = city
        @@all << self
    end

    def players
        Player.all.select { |player| 
            player.team == self
        }
    end
end