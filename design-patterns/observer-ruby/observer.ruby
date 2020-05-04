class Subject
    def Attach(obj)
        @observers << obj
    end

    def Detach(obj)
    end

    def Notify
        for observer in @observers
            observer.Update()
        end
    end
end

class ConcreteSubject < Subject

    def initialize
        @observers = Array.new
        @state=nil
    end

    def SetState(value)
        @state = value
        self.Notify
    end

    def GetState
        return @state
    end
end

class Observer
    def Update
        raise NotImplementedError, 'Update() must be defined in subclass'
    end
end

class ConcreteObserverA < Observer
    def initialize(obj)
        @conSub = obj
        @state = nil
        @conSub.Attach(self)
    end
    
    def Update
        puts "Inside ConcreteObserverA::Update()"
        @state = @conSub.GetState
        puts "State = #{@state}"
    end
end

class ConcreteObserverB < Observer
    def initialize(obj)
        @conSub = obj
        @state = nil
        @conSub.Attach(self)
    end

    def Update
        puts "Inside ConcreteObserverB::Update()"
        @state = @conSub.GetState
        puts "State = #{@state}"
    end
end

conSubObj = ConcreteSubject.new
ObsObj1 = ConcreteObserverA.new(conSubObj)
ObsObj2 = ConcreteObserverB.new(conSubObj)
conSubObj.SetState(1)