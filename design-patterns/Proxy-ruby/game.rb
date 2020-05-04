
require_relative 'game_function'

class Game < GameFunction

  def initialize(name)
    @name = name
    @size = 38
    @creater = 'Player Unknown BattleGround'
  end

  def play_game
    puts "Playing Game: #{@name}"
  end

  def stop_game
    puts "Stopping Game: #{@name}"
  end

  def delete_game
    puts "Deleting Game: #{@name}"
  end

  def game_details
    " Game Details:\n Name: #{@name}\n Size: #{@size} GB\n Creator: #{@creater}"
  end
end