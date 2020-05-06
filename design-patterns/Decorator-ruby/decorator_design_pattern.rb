require_relative 'basic_computer.rb'
require_relative 'gaming_computer.rb'
require_relative 'laptop.rb'

class DecoratorDesignPattern
  customized_pc = GamingComputer.new(Laptop.new(BasicComputer.new))
  puts "Asus Rog Zephrus G14"
  puts "Parts: #{customized_pc.parts}"
  puts "Cost = $#{customized_pc.cost}"
  puts "whaa this is a good option to buy in case someone runs this...lol"
end