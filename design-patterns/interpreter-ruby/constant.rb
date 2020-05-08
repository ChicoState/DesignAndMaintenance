require_relative 'statement'

class Constant < Statement
  def initialize(constant)
    @constant = constant
  end

  def interpret
    @constant.to_i
  end
end