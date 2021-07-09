require 'pry'

require_relative './customer.rb'
require_relative './table'
require_relative './waiter'

# puts "Hello world"
bill = Customer.new("Bill")
kat = Customer.new("Kat")
rachel = Customer.new("Rachel")

jenny = Waiter.new(1,"Jenny")
tim = Waiter.new(2, "Tim")
sam = Waiter.new(3, "Sam")

# (number, name, customer, waiter)
table1 = Table.new(1, "Pizza", bill, jenny)
table2 = Table.new(2, "Palaw", kat, tim)
table3 = Table.new(3, "Nodles", bill,sam)



binding.pry
