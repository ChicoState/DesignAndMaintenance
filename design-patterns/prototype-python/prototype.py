#shallow copy : copy.copy()
#Shallow copy creates a copy of that object but references each element of that object.

#deep copy   :  copy.deepcopy()
#The objects that support cloning are called prototypes.
from copy import deepcopy

class body_Temp(object):
    def __init__(self, centigrade, Fahrenheit):
        self.centigrade = centigrade
        self.Fahrenheit = Fahrenheit

    def temp_Rise(self, centigrade, Fahrenheit):
        self.centigrade += centigrade
        self.Fahrenheit += Fahrenheit

    def current_bodyTemp(self):
        if(self.centigrade>39.5 and self.Fahrenheit>103.1):
         print("High Fever")
         self.Fahrenheit= (self.centigrade*9/5)+32
         print(f'{self.centigrade} *C, {self.Fahrenheit} *F')
        elif(self.centigrade>38 and self.Fahrenheit>100.4):
         print("Fever")
         self.Fahrenheit= (self.centigrade*9/5)+32
         print(f'{self.centigrade} *C, {self.Fahrenheit} *F')
        else:
         print("Normal Body Temperature")
         self.Fahrenheit1= (self.centigrade*9/5)+32
         print(f'{self.centigrade} *C, {self.Fahrenheit} *F')

    def clone(self):
        obj = deepcopy(self)
        return obj


#clone function is used for deepcopying the current object
class prototype(object):
    def clone(self):
        obj = deepcopy(self)
        return obj


if __name__ == '__main__':
    p1 = body_Temp(37,98.6)
    p1.current_bodyTemp()
    fever = p1.clone()
    high_Fever = p1.clone()
    #rise = body_Temp(0,0)
    fever.temp_Rise(1.5,2.9)
    high_Fever.temp_Rise(3.0,6.9)
    fever.current_bodyTemp()
    high_Fever.current_bodyTemp()
    print("No change is made to the prototype object even after cloning(deep copy)")
    p1.current_bodyTemp()

