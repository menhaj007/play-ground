class Table
  attr_accessor :number, :name, :customer, :waiter
  
  @@all = []

  def initialize(number, name, customer, waiter)
    @number = number
    @name = name
    @customer = customer
    @waiter = waiter

    @@all << self
  end
 
  def self.all
    @@all
  end
  
end