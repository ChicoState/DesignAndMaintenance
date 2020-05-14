class Game
    attr_reader :name, :size, :popularity
  
    def initialize(name, size, popularity)
      @name = name
      @size = size
      @popularity = popularity
    end
  end