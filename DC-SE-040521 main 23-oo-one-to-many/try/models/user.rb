class User
    attr_reader :name
    attr_accessor :bio

    @@all = []
    def initialize(name, bio)
        @name = name
        @bio = bio
        @@all << self
    end

    def username
        @name
    end
    def bio
        @bio
    end

    def tweets
      Tweet.all.select { |tweet|
        tweet.user == self
      }
    end

end
