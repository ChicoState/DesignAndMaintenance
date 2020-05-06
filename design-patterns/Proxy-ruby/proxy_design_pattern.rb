require_relative 'game_proxy'

game_proxy = GameProxy.new('PUBG')
puts game_proxy.game_details
game_proxy.play_game
game_proxy.stop_game
game_proxy.delete_game
game_proxy.record_game