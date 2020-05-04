class Director
    def Operation
        raise NotImplementedError, 'Operation() must be defined in subclass'
    end
end

class StudentEmployee < Director
    def initialize(name)
        @value = name
    end
    
    def Operation
        puts "\n"
        puts "StudentEmployee:Operation()"
        puts "Value = #{@value}"
    end
end

class Manager < Director
    def initialize
        @elements = Array.new
    end

    def Operation
        puts "\n"
        puts "Manager:Operation()"

        for item in @elements
            item.Operation
        end
    end
    
    def Add(obj)
        @elements << obj
    end
end

task = Manager.new
task.Add(StudentEmployee.new("StudentEmployee 1"))
task.Add(StudentEmployee.new("StudentEmployee 2"))

work = Manager.new
work.Add(StudentEmployee.new("StudentLead A"))
work.Add(StudentEmployee.new("StudentLead B"))

task.Add(work)
task.Add(StudentEmployee.new("StudentEmployee C"))

task.Operation