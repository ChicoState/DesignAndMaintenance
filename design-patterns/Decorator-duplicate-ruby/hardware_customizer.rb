require_relative 'computer.rb'

class HardwareCustomizer < Computer
  def initialize(new_comp)
    @computer = new_comp
  end

  def parts
    @computer.parts
  end

  def cost
    @computer.cost
  end
end