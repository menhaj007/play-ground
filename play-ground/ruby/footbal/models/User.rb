class User
    attr_reader :name, :email

    @@all = []
    def initialize(name, email)
        @name = name
        @email = email
        @@all << self
    end
    

end
