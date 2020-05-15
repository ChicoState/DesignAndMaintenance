# Base state class
class VirtualMachine_State(object):
    name = 'state'
    allowed = []
    
    def switch(self, state):
        """ Switch to new state """
        if state.name in self.allowed:
            print('Present State: %s   ->   State is changed to - %s' %(self, state.name))
            self.__class__ = state
        else:
            print('Present State: %s  ->   State change to %s not possible.'
                  %(self, state.name))
    
    def __str__(self):
        return self.name
 
class Shut_down(VirtualMachine_State):
    name = 'Shut_down'
    allowed = ['Power_On']

class Power_On(VirtualMachine_State):
    name = 'Power_On'
    allowed = ['Shut_down', 'Sleep_Mode', 'hibernate']

class Sleep_Mode(VirtualMachine_State):
    name = 'Sleep_Mode'
    allowed = ['Power_On']

class Hibernate(VirtualMachine_State):
    name = 'hibernate'
    allowed = ['Power_On']

class VirtualMachine_(object):
    def __init__(self):
        self.state = Shut_down()
        
    def change(self, state):
        self.state.switch(state)

if __name__ == '__main__':
    
    c = VirtualMachine_()
    c.change(Power_On)
    
    c.change(Sleep_Mode)
    c.change(Hibernate)
    
    c.change(Power_On)
    c.change(Shut_down)