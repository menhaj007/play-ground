require "./artist.rb"
require "./song.rb"

kiki = Song.new("In My Feelings", "hip-hop")
hotline = Song.new("Hotline Bling", "pop")
# drake = Artist.new("Drake")

# kiki.artist = drake

# puts kiki.artist.name

drake = Artist.new("Drake")
drake.add_song(kiki)
drake.add_song(hotline)

puts kiki.artist.name
# drake.songs
# drake.add_song("In My Feelings")
# drake.add_song("Hotline Bling")
# drake.all
# puts drake.songs

# drake.songs.collect do |song|
#     puts song.genre
# end
# kiki.add_artist(drake)

# puts kiki.artists[0].name