require_relative 'expression'

class Multiplication < Expression
  def interpret
    @first_constant.interpret * @second_constant.interpret
  end
end