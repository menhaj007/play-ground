class Tweet
  attr_accessor :message
  attr_reader :user

  @@all_tweets = []

  def initialize(message, user)
    @message = message
    @user = user
    @@all_tweets << self
  end

  def self.all
    @@all_tweets
  end

  def username
    # user.username
    # @user.username
    self.user.username
  end

end
