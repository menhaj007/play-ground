class Song 
  attr_accessor :title, :released, :singer
  
  @@allSongs = []
  
  def initialize(title, released, singer)
    @title = title
    @released = released
    @singer = singer
    
    @@allSongs << self
  end
  

  def self.all
    @@allSongs
  end

    
end