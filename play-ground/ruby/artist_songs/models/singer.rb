class Singer 
  attr_accessor :name, :bio
  
  def initialize(name, bio)
    @name = name
    @bio = bio
  end
  
  def allSongs
    Song.all.select { |song|
      song.singer == self
    }
  end
  def title
    allSongs.map {|song|
      song.title
    }
  end
  
  def printName
    p @name
  end
    
end

# aSinger = Singer.new("James", "Body");
# aSinger.printName;
