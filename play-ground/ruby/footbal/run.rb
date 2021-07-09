require "pry"

require_relative "./models/player.rb"
require_relative "./models/team.rb"

player1 = Player.new("Menhajuddin", 1)
player2 = Player.new("John", 2)
player3 = Player.new("Samad", 3)
player4 = Player.new("Kim", 4)

a = Team.new("DC_Heros", "DC")
b = Team.new("Texas Heros", "TX")

player1.team = a
player2.team = b
player3.team = a
player4.team = a



binding.pry