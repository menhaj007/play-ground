class User

  attr_reader :username
  attr_accessor :bio

  def initialize(username, bio)
    @username = username
    @bio = bio
  end

  def tweets
    Tweet.all.select { |tweet| tweet.user == self}
  end

  def post_tweet(message)
    Tweet.new(message, self)
  end

  def self.print_tweets
    Tweet.all.map { |tweet| tweet.message }
  end



end
