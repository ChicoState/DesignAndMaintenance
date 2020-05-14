require_relative 'expression_reader'

module Operators
  FIRST_CONSTANT_INDEX = 0
  SECOND_CONSTANT_INDEX = 2
  SUMMATION_OPERATOR = :+
  SUBTRACTION_OPERATOR = :-
  MULTIPLICATION_OPERATOR = :*
  DIVISION_OPERATOR = :/
end

expression_string = '1341 - 213'
expression = ExpressionReader.read(expression_string)
puts "#{expression_string} = #{expression.interpret}"

expression_string = '3412 + 232'
expression = ExpressionReader.read(expression_string)
puts "#{expression_string} = #{expression.interpret}"

expression_string = '15 / 3'
expression = ExpressionReader.read(expression_string)
puts "#{expression_string} = #{expression.interpret}"

expression_string = '23 * 12'
expression = ExpressionReader.read(expression_string)
puts "#{expression_string} = #{expression.interpret}"
