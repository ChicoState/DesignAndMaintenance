class Calculator
  def initialize(value)
    @state = value
  end

  def SetState(value)
    @state = value
  end

  def GetState
    return @state
  end
end

class Memory
  def SetState(value)
    @state = value
  end

  def GetState
    return @state
  end

  def CreateCalculator
    return (Calculator.new(@state))
  end

  def SetCalculator(calculator)
    puts "Going to previous state: "
    @state = calculator.GetState
  end
end

class Button
  def initialize(memoryObj)
    @calculator = nil
    @origin = memoryObj
  end

  def Execute
    @calculator =  @origin.CreateCalculator
    @origin.SetState(0)
  end

  def Unexecute
    @origin.SetCalculator(@calculator)
  end
end

memory = Memory.new
#setting initial state
memory.SetState(1)
puts "The Calculator State value is : #{(memory.GetState)}"


button = Button.new(memory)
#change the state to 0
button.Execute
puts "The Calculator state value is: #{(memory.GetState)}"

#back to state 1
button.Unexecute
puts "The Calculator state value is : #{(memory.GetState)}"
