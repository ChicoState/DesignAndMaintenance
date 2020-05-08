require_relative 'game'

class GameMobile
  attr_reader :game_mobile

  def initialize
    @game_mobile= [Game.new(:Call_of_Duty, 2, 100),
                      Game.new(:Fortnite, 3, 96),
                      Game.new(:PokemonGo, 1, 80)]
  end
end