require_relative 'expression'

class Division< Expression
  def interpret
    @first_constant.interpret / @second_constant.interpret
  end
end