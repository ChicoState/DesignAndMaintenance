# The class Computer acts as an interface
class Computer
    def Clone
        raise NotImplementedError, 'CLone() must be defined in subclass'
    end
end
# The class Laptop1 inherits from Computer
class Laptop1 < Computer
    def Clone
        return self.clone
    end
    def Functionality
        puts "Laptop 1"
    end
end
# The class Laptop2 inherits from Computer
class Laptop2 < Computer
    def Clone
        return self.clone
    end

    def Functionality
        puts "Laptop 2"
    end
end
# Object creation for each clone
laptopObj1 = Laptop1.new
laptopObj2 = Laptop2.new
# Calling the first Laptop1 class and executing the function
lpObj = laptopObj1.Clone
lpObj.Functionality
# Calling the first Laptop2 class and executing the function
lpObj = laptopObj2.Clone
lpObj.Functionality