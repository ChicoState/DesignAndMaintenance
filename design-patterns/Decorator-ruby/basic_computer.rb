require_relative 'computer.rb'

class BasicComputer < Computer
  def initialize
    @ram = 16
    @rom = 2
  end

  def parts
    "RAM =#{@ram} GB ROM = #{@rom} GB"
  end

  def cost
    1400
  end
end