require "pry"
require "./tweet.rb"
require "./user.rb"


# user
lulu = User.new("Lulu", "Biogropahy of Lulu is slakdjf lask jflasdjfl.")
genie = User.new("Genie", "Biogrpahj laksdj flasdj flaskjdflksj fsdf.")

# tweet

tweet1 = Tweet.new("Bad feather day. #molting season", lulu)
tweet2 = Tweet.new("I'm having a great day! The water is nice and warm", lulu)
tweet3 = Tweet.new("I'm freeee!!!!!!", genie)






binding.pry
