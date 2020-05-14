class Grade
    def Attach(obj)
        @students << obj
    end

    def Detach(obj)
    end

    def Notify
        for student in @students
            student.Update()
        end
    end
end

class GradeForAll < Grade

    def initialize
        @students = Array.new
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

class Student
    def Update
        raise NotImplementedError, 'Update() must be defined in subclass'
    end
end

class StudentA < Student
    def initialize(obj)
        @conSub = obj
        @state = nil
        @conSub.Attach(self)
    end
    
    def Update
        puts "Inside StudentA::Update()"
        @state = @conSub.GetState
        puts "State = #{@state}"
    end
end

class StudentB < Student
    def initialize(obj)
        @conSub = obj
        @state = nil
        @conSub.Attach(self)
    end

    def Update
        puts "Inside StudentB::Update()"
        @state = @conSub.GetState
        puts "State = #{@state}"
    end
end

conSubObj = GradeForAll.new
ObsObj1 = StudentA.new(conSubObj)
ObsObj2 = StudentB.new(conSubObj)
conSubObj.SetState(1)