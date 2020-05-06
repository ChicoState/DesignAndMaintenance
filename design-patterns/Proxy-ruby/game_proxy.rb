require_relative 'game'
require_relative 'game_function'

class GameProxy < GameFunction
  def initialize(name)
   
    @game = Game.new(name)
  end

  def play_game
   
    @game.play_game
  end

  def stop_game
    
    @game.stop_game
  end

  def delete_game
    puts 'Deleting game: Back off Not allowed!!!'
  end

  def game_details
  
    @game.game_details
  end
end