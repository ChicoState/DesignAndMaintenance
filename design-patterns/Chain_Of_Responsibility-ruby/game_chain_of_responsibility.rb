require_relative 'game_config'
require_relative 'game_gen'
require_relative 'game_prod'

game_gen = GameGen.new
game_config = GameConfig.new
game_prod = GameProd.new

game_gen.next(game_config)
game_config.next(game_prod)

game_gen.handle_issue(:prod)