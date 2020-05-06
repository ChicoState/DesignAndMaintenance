# Python Code for object 
# oriented concepts using 
# the abstract factory 
# design patter 
  
import random 
  
class Cars_avaliable: 
  
  
    def __init__(self, Car = None): 
        
        self.cars = Car 
  
    def show_car(self): 
  
        rental = self.cars() 
  
        print(f'Name of car {rental}') 
        print(f'Its priced at {rental.Fee()} /hour') 
  
  
class BMW_330Ci: 

    def Fee(self): 
        return 56
  
    def __str__(self): 
        return "BMW_330Ci"
  
class Audi_A4: 

    def Fee(self): 
        return 30
  
    def __str__(self): 
        return "Audi_A4"
  
class Merc_S550: 
  
    def Fee(self):
        return 90
  
    def __str__(self): 
        return 'Merc_S550'
  
def r_choice(): 
  # random_car
  
    return random.choice([BMW_330Ci, Audi_A4, Merc_S550])() 
  
  
if __name__ == "__main__": 
  
    rental = Cars_avaliable(r_choice) 
  
    for x in range(7): 
        rental.show_car() 