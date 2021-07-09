require './Like.rb'
require './Tweet.rb'
require './User.rb'

# puts "hello world"

john = User.new("John")
likedByJohn = Like.new(true)
likedATweet = Tweet.new("hello word", john, likedByJohn)
puts likedATweet
