require_relative 'game'
require 'set'

class GamePc
  attr_reader :game_pc

  def initialize
    @game_pc = Set[Game.new(:ApexLegends, 24, 100),
                       Game.new(:Overwatch, 32, 97),
                       Game.new(:RocketLeague, 8, 73)]
  end
end