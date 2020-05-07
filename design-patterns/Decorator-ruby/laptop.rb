require_relative 'hardware_customizer.rb'


class Laptop < HardwareCustomizer
  def initialize(new_comp)
    super(new_comp)
    @ssd = 2
    @ssd_cost = 80
  end

  def parts
   
    "#{@computer.parts} Solid State Drive = #{@ssd} TB"
  end

  def cost
    @computer.cost + @ssd_cost
  end
end