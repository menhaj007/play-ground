class Song
    attr_accessor :artist, :name, :genre

    def initialize(name, genre)
        @name = name
        @genre = genre
        @artists = []
    end

    def add_artist(artist)
        @artists << artist
    end

    def artists
        @artists
    end
end
