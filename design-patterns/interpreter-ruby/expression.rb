require_relative 'statement'

class Expression < Statement
  def initialize(first_constant, second_constant)
    @first_constant = first_constant
    @second_constant = second_constant
  end

  def interpret
    raise NotImplementedError, 'Sub class overrides method'
  end
end