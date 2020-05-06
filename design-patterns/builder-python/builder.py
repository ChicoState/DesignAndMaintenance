  
# Director: returns assembled plane
class Director(object):
    plane_builder = None
    
    def setBuilder(self, builder):
        self.plane_builder = builder
    
    # code for assembling a plane
    def getPlane(self):
        plane = Plane()
        
        body = self.plane_builder.getBody()
        plane.setBody(body)
        
        engine = self.plane_builder.getEngine()
        plane.setEngine(engine)
        
        i = 0
        while i < 2:
            wing = self.plane_builder.getWing()
            plane.attachWing(wing)
            i += 1
        
        j = 0
        while j < 4:
            wheel = self.plane_builder.getWheel()
            plane.attachWheel(wheel)
            j += 1
            
        k = 0
        while k < 2:
            propeller = self.plane_builder.getPropeller()
            plane.attachPropeller(propeller)
            k += 1
                
        return plane

# Product: contains different parts
class Plane(object):
    def __init__(self):
        self.__wings = list()
        self.__wheels = list()
        self.__engine = None
        self.__body = None
        self.__propeller = list()
    
    def attachWing(self, wing):
        self.__wings.append(wing)
    
    def attachWheel(self, wheel):
        self.__wheels.append(wheel)
    
    def setEngine(self, engine):
        self.__engine = engine
    
    def setBody(self, body):
        self.__body = body
            
    def attachPropeller(self, propeller):
        self.__propeller.append(propeller)
    
    def specification(self):
        print('body: %s' %self.__body.shape)
        print('engine hoorsepower: %d' %self.__engine.horsepower)
        print('wing length: %d ft.' %self.__wings[0].length)
        print('tire size: %d in.' %self.__wheels[0].size)
        print('Propeller diameter : %d cm.' %self.__propeller[0].diameter)

# Product parts
class Wing(object):
    length = None
    
class Wheel(object):
    size = None

class Engine(object):
    horsepower = None

class Body(object):
    shape = None

class Propeller(object):
    diameter = None    


# Builder Interface
class PlaneBuilderInterface(object):
    def getBody(self): pass
    def getEngine(self): pass
    def getWing(self): pass
    def getWheel(self): pass
    def getPropeller(self): pass
# Builder: returns different product parts
class PlaneBuilder1(PlaneBuilderInterface):
    def getBody(self):
        body = Body()
        body.shape = 'Aer0'
        return body
    
    def getEngine(self):
        engine = Engine()
        engine.horsepower = 100000
        return engine
    
    def getWing(self):
        wing = Wing()
        wing.length = 231
        return wing
    
    def getWheel(self):
        wheel = Wheel()
        wheel.size = 49
        return wheel

    def getPropeller(self):
        propeller = Propeller()
        propeller.diameter = 200
        return propeller    
# Builder: returns different product parts
class PlaneBuilder2(PlaneBuilderInterface):
    def getBody(self):
        body = Body()
        body.shape = 'Ballistic'
        return body
    
    def getEngine(self):
        engine = Engine()
        engine.horsepower = 120000
        return engine
    
    def getWing(self):
        wing = Wing()
        wing.length = 197
        return wing
    
    def getWheel(self):
        wheel = Wheel()
        wheel.size = 50
        return wheel

    def getPropeller(self):
        propeller = Propeller()
        propeller.diameter = 320
        return propeller

if __name__ == '__main__':
    director = Director()
    print('*'*30)
    print("Plane1")
    director.setBuilder(PlaneBuilder1())
    plane1 = director.getPlane()    
    plane1.specification()
    print('*'*30)
    print("Plane2")
    director.setBuilder(PlaneBuilder2())
    plane2 = director.getPlane()    
    plane2.specification()
    print('*'*30)