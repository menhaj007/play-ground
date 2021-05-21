require "./book.rb"
require "./author.rb"

afghanistan = Book.new("War in Afghanistan")
khalid = Author.new("Khalid")
afghanistan.author = khalid

puts afghanistan.author.name