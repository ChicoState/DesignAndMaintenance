class Fun 
    def games
    end
  end
  
  class Pubg < Fun
  end
  
  class Cod < Fun
  end
  
  
  class Players < Pubg 
    def gamer
      puts "players" 
    end
  end
  
  class Map < Cod 
    def gamer
      puts "boring"
    end
  end
  
  
  class FunFactory 
    def create_fun
    end
  end
  
  
  class PubgFactory < FunFactory 
    def create_fun
      Players.new
    end
  end
  
  class CodFactory < FunFactory 
    def create_fun
      Map.new
    end
  end
  
  class DFunFactory 
    def initialize(fun_class)
      @fun_class = fun_class
    end
  
    def create_fun
      @fun_class.new 
    end
  end
  
  
  class FunManager 
    def make_fun_factory(type)
      if(type == :pubg) 
        PubgFactory.new
      elsif(type == :cod) 
        CodFactory.new
      end
    end 
  end
  
  
  fun_manager = FunManager.new
  
  fun_factory1 = fun_manager.make_fun_factory(:pubg)
  fun_factory2 = fun_manager.make_fun_factory(:cod)
  fun_factory3 = DFunFactory.new(Players)
  
  fun1 = fun_factory1.create_fun
  fun2 = fun_factory2.create_fun 
  fun3 = fun_factory3.create_fun
  
  fun1.gamer
  fun2.gamer
  fun3.gamer