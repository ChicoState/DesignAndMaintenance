require_relative 'expression'

class Addition < Expression
  def interpret
    @first_constant.interpret + @second_constant.interpret
  end
end