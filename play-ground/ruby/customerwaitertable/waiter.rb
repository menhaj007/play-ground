class Waiter
  attr_accessor :name, :wid
 
  @@all = []

  def initialize(wid, name)
    @name = name
    @wid = wid
    
    @@all<< self
  end

  def self.all
    @@all
  end

  def allTables
    Table.all.select |table|
      table.waiter == self
  end
  
  def customers
    customers = allTables.map {|table| table.customer }
    customers.map {|customer| customer.name}.uniq
  end
  
end
