class App
    attr_reader :name, :url
    @@all = []

    def initialize(name, url)
        @name= name
        @url = url
        @@all << self
    end

    def apps
        my_accts = Account.all.select {|acct| acct.user == self}
        my_accts.map {|acct| acct.app}
    end
end