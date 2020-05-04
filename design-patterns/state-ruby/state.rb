class Context
    def initialize(obj)
        @state = obj
    end

    def SetState(value)
        @state = value
        puts "Inside Context:State .. State Changed"
    end

    def GetState
        return @State
    end

    def Request
        @state.Handle(self)
    end
end

class State
    def Handle(context)
        raise NotImplementedError, 'Handle() must be defined in subclass'
    end
end
   
class ConcreteStateA < State
    def Handle(context)
        puts "ConcreteStateA:Handle()"
        context.SetState(ConcreteStateB.new)
    end
end

class ConcreteStateB < State
    def Handle(context)
        puts "ConcteteStateB:Handle()"
        context.SetState(ConcreteStateA.new)
    end
end

state = ConcreteStateA.new
context = Context.new(state)

context.Request
context.Request