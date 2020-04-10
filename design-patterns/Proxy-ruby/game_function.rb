
class GameFunction
  def play_game
    raise NotImplementedError, 'Subclasses must override'
  end

  def stop_game
    raise NotImplementedError, 'Subclasses must override'
  end

  def delete_game
    raise NotImplementedError, 'Subclasses must override'
  end

  def game_details
    raise NotImplementedError, 'Subclasses must override'
  end

  def method_missing(m, *args, &block)
    puts "Unable to perform #{m} on Game object"
  end
end