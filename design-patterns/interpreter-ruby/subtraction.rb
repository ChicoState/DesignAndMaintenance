require_relative 'expression'

class Subtraction < Expression
  def interpret
    @first_constant.interpret - @second_constant.interpret
  end
end