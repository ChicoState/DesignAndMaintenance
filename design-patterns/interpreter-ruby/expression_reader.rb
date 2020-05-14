require_relative 'constant'
require_relative 'addition'
require_relative 'subtraction'
require_relative 'multiplication'
require_relative 'division'

class ExpressionReader
  def self.read(expression)
    expression_token = expression.split(' ')
    first_constant = Constant.new(expression_token[Operators::FIRST_CONSTANT_INDEX])
    second_constant = Constant.new(expression_token[Operators::SECOND_CONSTANT_INDEX])

    return Addition.new(first_constant, second_constant) if expression.include?(Operators::SUMMATION_OPERATOR.to_s)
    return Subtraction.new(first_constant, second_constant) if expression.include?(Operators::SUBTRACTION_OPERATOR.to_s)
    return Multiplication.new(first_constant, second_constant) if expression.include?(Operators::MULTIPLICATION_OPERATOR.to_s)
    return Division.new(first_constant, second_constant) if expression.include?(Operators::DIVISION_OPERATOR.to_s)

    nil
  end
end