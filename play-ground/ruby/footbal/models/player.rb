class Player
    attr_accessor :team
    attr_reader :name, :position
    @@all = []

    def initialize(name, position)
        @name = name
        @position = position
        @@all << self
    end

    def self.all
        @@all
    end

end