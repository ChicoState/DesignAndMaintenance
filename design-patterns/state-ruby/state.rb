class TrafficLightSystem
    def initialize(obj)
        @state = obj
    end

    def SetState(value)
        @state = value
        puts "Inside TrafficLightSystem:State .. State Changed"
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
   
class REDLight < State
    def Handle(context)
        puts "REDLight:Handle()"
        context.SetState(GREENLight.new)
    end
end

class GREENLight < State
    def Handle(context)
        puts "GREENLight:Handle()"
        context.SetState(REDLight.new)
    end
end

signal = REDLight.new
context = TrafficLightSystem.new(signal)

context.Request
context.Request