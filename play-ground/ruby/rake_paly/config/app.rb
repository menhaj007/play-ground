require 'active_record'
ActiveRecord::Base.establish_connection(
    :adapter => "sqlite3",
    :database => "db/data.sqlite"
)
require './lib/files.rb'

# add one ., not ../