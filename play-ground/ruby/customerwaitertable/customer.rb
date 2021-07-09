class Customer
  attr_accessor :name, :table

  @@all = []
  
  def initialize(name)
    @name = name
    @@all << self
  end

  def self.all
    return @@all
  end

  def table
    Table.all.select { |table|
      table.customer == self
    }
  end
  def waiters
    waiters = table.map{|tab| tab.waiter}
    waiters.map {|waiter| waiter.name}.uniq
  end
  
end
