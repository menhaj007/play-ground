class Student < ActiveRecord::Base
    attr_accessor :firstname, :lastname

    @@all = []

    def initialize(firstname, lastname)
        @firstname = firstname
        @lastname = lastname
        @@all << self
    end

    def self.all
        @@all
    end

end