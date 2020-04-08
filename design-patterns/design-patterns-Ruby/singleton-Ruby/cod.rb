class Cod
    MINECRAFT = 1
    GAME2 = 2
    GAME = 3
  
    @@level = GAME2
  
    def self.player
      @@player ||= File.open('player.txt', 'w')
    end
  
    def self.minecraft(msg)
      player.puts("Minecraft: #{msg}")
      player.flush
    end
  
    def self.game2(msg)
      player.puts("Game2: #{msg}") if @@level >= GAME2
      player.flush
    end
  
    def self.game(msg)
      player.puts("Game: #{msg}") if @@level >= GAME
      player.flush
    end
  
    def self.level=(new_level)
      @@level = new_level
    end
  
    def self.level
      @@level
    end
  end