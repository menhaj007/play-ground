require "./artist"
require "./song"

# lil_nas_x = Artist.new("Lil Nas X")
# old_town_road = Song.new("Old Town Road", "hip-hop")

# old_town_road.artist = lil_nas_x
# puts old_town_road.artist.name

lil_nas_x = Artist.new("Lil Nas X")
rick = Artist.new("Rick Astley")

old_town_road = Song.new("Old Town Road","hip-hop")
never_gonna_give_you_up = Song.new("Never Gonna Give You Up","pop")

old_town_road.artist = lil_nas_x
never_gonna_give_you_up.artist = rick

# puts Song.all.first.name #=> "Old Town Road"
# puts Song.all.first.genre #=> "hip-hop"
# puts Song.all.first.artist #=> #<Artist:0x00007ff1d90dbf38 @name="Lil Nas X", @songs=[]>
# puts Song.all.first.artist.name #=> "Lil Nas X"


# puts Song.all.last.name #=> "Never Gonna Give You Up"
# puts Song.all.last.genre #=> "pop"
# puts Song.all.last.artist #=> #<Artist:0x00007ff1d90dbf38 @name="Rick Astley", @songs=[]>
# puts Song.all.last.artist.name #=> "Rick Astley" 

puts Song.all.select {|song| song.artist == lil_nas_x}