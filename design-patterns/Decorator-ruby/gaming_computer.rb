require_relative 'hardware_customizer.rb'

class GamingComputer < HardwareCustomizer
  def initialize(new_comp)
    super(new_comp)
    @graphics = 6
    @graphics_cost = 10
  end

  def parts
    "#{@computer.parts} Graphics Card = #{@graphics} GB"
  end

  def cost
    @computer.cost + @graphics_cost
  end
end