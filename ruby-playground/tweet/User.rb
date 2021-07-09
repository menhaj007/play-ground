class User 

  @@all = []

  attr_reader :username
  
  def initialize(attributes = {})
    @username = attributes[:username]
    @@all << self
  end

  def post_tweet(message)
    Tweet.new(message, self)
  end

  def tweets
    Tweet.all.select { |tweet| tweet.user == self }
  end

  def likes 
    Like.all.select { |like| like.user == self }
  end

  def liked_tweets
    likes.map { |like| like.tweet }
  end
  
  def self.all 
    @@all 
  end

end
