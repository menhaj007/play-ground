class Account
    attr_reader :usr, :app
    attr_accessor :username, :password
    @@all = []

    def initialize(user, app, username, password)
        @user = user
        @app = app
        @username = username
        @password = password
        @@all << self
    end
end