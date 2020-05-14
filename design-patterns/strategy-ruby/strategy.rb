class Game
    def initialize
        @strategy = nil
    end

    def SetStrategy(strategyObj)
        @strategy = strategyObj
    end

    def GetStrategy
        return @strategy
    end

    def ContextInterface
        @strategy.WeaponInterface
    end
end

class GameCharacter
    def WeaponInterface
        raise NotImplementedError, 'WeaponInterface() must be defined in subclass'
    end
end

class WeaponOne < GameCharacter
    def WeaponInterface
        puts 'Inside WeaponOne:WeaponInterface()'
    end
end

class WeaponTwo < GameCharacter
    def WeaponInterface
        puts 'Inside WeaponTwo:WeaponInterface()'
    end
end

class WeaponThree < GameCharacter
    def WeaponInterface
        puts "Inside WeaponThree:WeaponInterface()"
    end
end

game = Game.new

CharacterA = WeaponOne.new
game.SetStrategy(CharacterA)
game.ContextInterface

CharacterB = WeaponTwo.new
game.SetStrategy(CharacterB)
game.ContextInterface

CharacterC = WeaponThree.new
game.SetStrategy(CharacterC)
game.ContextInterface