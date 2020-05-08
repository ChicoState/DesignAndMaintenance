require_relative 'game_mobile'
require_relative 'game_pc'

def display_game
  @iterator.each { |game| puts "game: #{game.name} -- size: #{game.size}GB -- popularity: #{game.popularity}%" }
end

puts 'Games on Mobile:'
@iterator = GameMobile.new.game_mobile
display_game
puts ''

puts 'Games on PC:'
@iterator = GamePc.new.game_pc
display_game