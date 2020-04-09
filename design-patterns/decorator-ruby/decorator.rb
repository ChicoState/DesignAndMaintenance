class Automobiles
    def Operation
        raise NotImplemented Error, 'Operation() must be defined in subclass'
    end
end

class Car < Automobiles
    def Operation
        puts "Car::Operation()"
    end
end

class BasicCar < Automobiles
    def initialize(obj)
        @comp = obj
    end

    def Operation
        puts "BasicCar::Operation()"
        @comp.Operation
    end
end

class SportsCar < BasicCar
    def initialize(obj)
        super(obj)
        @addedFeature = nil
    end

    def Operation
        super
        @addedFeature = 1
        puts "SportsCar::Operation()"
        puts "SportsCar::addedFeature = #{@addedFeature}"
    end
end

class LuxuryCar < BasicCar
    def initialize(obj)
        super(obj)
    end

    def Operation
        super
        puts "LuxuryCar::Operation()"
        self.AddedBehavior
    end

    def AddedBehavior
        puts "LuxuryCar::AddedBehavior()"
    end
end

myCar = SportsCar.new(LuxuryCar.new(Car.new))
myCar.Operation