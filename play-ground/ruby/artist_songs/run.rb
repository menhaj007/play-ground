require 'pry'

require_relative './models/singer'
require_relative './models/song'

# puts "Hello world from Artist and Song practice."

michale = Singer.new("Michale", "American Pop star");
beyonce = Singer.new("Beyonce", "American-African start")
zahir = Singer.new("Ahamd Zaher", "Afghanistan's only and best pop star");
#
earth = Song.new("Shaken", "1990", michale);
halo = Song.new("Halo", "2019", beyonce);
jan = Song.new("Jane many", "1985", zahir);
qalb = Song.new("Qalb-e-Many", "1335", zahir);
sanam = Song.new("sanam sanam", "1855", zahir);
jane = Song.new("Qalb-e-Jama", "1385", zahir);
jigar = Song.new("qurban", "1975", zahir);




binding.pry