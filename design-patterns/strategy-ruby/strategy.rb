class Context
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
        @strategy.AlgorithmInterface
    end
end

class Strategy
    def AlgorithmInterface
        raise NotImplementedError, 'AlgorithmInterface() must be defined in subclass'
    end
end

class ConcreteStrategyA < Strategy
    def AlgorithmInterface
        puts 'Inside ConcreteStrategyA:AlgorithmInterface()'
    end
end

class ConcreteStrategyB < Strategy
    def AlgorithmInterface
        puts 'Inside ConcreteStrategyB:AlgorithmInterface()'
    end
end

class ConcreteStrategyC < Strategy
    def AlgorithmInterface
        puts "Inside ConcreteStrategyC:AlgorithmInterface()"
    end
end

context = Context.new

conStratA = ConcreteStrategyA.new
context.SetStrategy(conStratA)
context.ContextInterface

conStratB = ConcreteStrategyB.new
context.SetStrategy(conStratB)
context.ContextInterface

conStratC = ConcreteStrategyC.new
context.SetStrategy(conStratC)
context.ContextInterface