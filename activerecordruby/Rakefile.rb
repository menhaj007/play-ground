# require 'pry'

# desc 'From rake to the terminal'
# task :hello do 
#     puts "hello world"
# end
# desc 'Hola from spain'
# task :hola do
#     puts "Hola Amigo"
# end

# binding.pry

namespace :greeting do
    desc 'From rake to the terminal'
    task :hello do 
        puts "hello world"
    end
    desc 'Hola from spain'
    task :hola do
        puts "Hola Amigo"
    end
end