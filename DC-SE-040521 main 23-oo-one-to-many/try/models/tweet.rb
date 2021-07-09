class Tweet
    attr_reader :message
    attr_accessor :user

    @@all = []
    def initialize(message, user)
        @message = message
        @user = user
        @@all << self

    end

    def message
        return @message
    end
    def user
        @User
    end
    def self.all
      @@all
    end


end
