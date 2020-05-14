# Director class that takes the client request and assigns it to each builder object
class Director
    def initialize
        @builder = nil
    end
    def SetBuilder(builderObj)
        @builder = builderObj
    end
    def Construct(name)
        if name == 'RegularHouse' then
            @builder.Create()
            @builder.Wood()
            @builder.Glass()
        elsif name == 'Castle' then
            @builder.Create()
            @builder.Stone()
            @builder.Iron()
        elsif name == 'Palace' then
            @builder.Create()
            @builder.Gold()
            @builder.Diamond()
        end
    end
end
# Builder class that contains the object construction code.
class Builder
    def Create
        raise NotImplementedError, 'Create() must be defined in subclass'
    end
    def Wood
        raise NotImplementedError, 'Wood() must be defined in subclass'
    end
    def Glass
        raise NotImplementedError, 'Glass() must be defined in subclass'
    end
    def Stone
        raise NotImplememntedError, 'Stone() must be defined in subclass'
    end
    def Iron
        raise NotImplememntedError, 'Iron() must be defined in subclass'
    end
    def Gold
        raise NotImplememntedError, 'Gold() must be defined in subclass'
    end
    def Diamond
        raise NotImplememntedError, 'Diamond() must be defined in subclass'
    end
end
# ConcreteBuilder1 inherits from Builder class the construction code for regular house.
class ConcreteBuilder1 < Builder
    def initialize
        @house = nil 
    end
    def Create
        @house = RegularHouse.new
    end
    def Wood
        puts "Constructing house with Wood"
    end
    def Glass
        puts "Constructing house with Glass"
    end
    def GetHouse
        return @house
    end
end
# ConcreteBuilder1 inherits from Builder class the construction code for Castle.
class ConcreteBuilder2 < Builder
    def inititlize
        @house = nil
    end
    def Create
        @house = Castle.new
    end
    def Stone
        puts "Constructing house with Stone"
    end
    def Iron
        puts "Constructing house with Iron"
    end
    def GetHouse
        return @house
    end
end
# ConcreteBuilder1 inherits from Builder class the construction code for Palace.
class ConcreteBuilder3 < Builder
    def inititlize
        @house = nil
    end
    def Create
        @house = Palace.new
    end
    def Gold
        puts "Constructing house with Gold"
    end
    def Diamond
        puts "Constructing house with Diamond"
    end
    def GetHouse
        return @house
    end
end

class RegularHouse
    def UserHouse
        puts '**** RegularHouse constructed for Client 1 ****'
    end
end

class Castle
    def UserHouse
        puts '**** Castle constructed for Client 2 ****'
    end
end

class Palace
    def UserHouse
        puts '**** Palace constructed for Client 3 ****'
    end
end
# creating an object from the main class
director = Director.new

builder1 = ConcreteBuilder1.new
director.SetBuilder(builder1)
director.Construct('RegularHouse')
house1 = builder1.GetHouse
house1.UserHouse

builder2 = ConcreteBuilder2.new
director.SetBuilder(builder2)
director.Construct('Castle')
house2 = builder2.GetHouse
house2.UserHouse

builder3 = ConcreteBuilder3.new
director.SetBuilder(builder3)
director.Construct('Palace')
house3 = builder3.GetHouse
house3.UserHouse