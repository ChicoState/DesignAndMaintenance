
class OnePlus: 

	"""Class for OnePlus"""

	def __init__(self): 
		self.name = "OnePlus"

	def O(self): 
		return "2400"


class Apple: 

	"""Class for Apple"""

	def __init__(self): 
		self.name = "Apple"

	def A(self): 
		return "1750"


class Samsung: 

	"""Class for Samsung"""

	def __init__(self): 
		self.name = "Samsung"

	def S(self): 
		return "2000"

class Adapter: 

	def __init__(self, obj, **adapted_methods): 
		"""We set the adapted methods in the object's dict"""
		self.obj = obj 
		self.__dict__.update(adapted_methods) 

	def __getattr__(self, attr): 
		"""All non-adapted calls are passed to the object"""
		return getattr(self.obj, attr) 

	def original_dict(self): 
		"""Print original object dict"""
		return self.obj.__dict__ 


""" main method """
if __name__ == "__main__": 

	"""list to store objects"""
	objects = [] 

	oneplus = OnePlus() 
	objects.append(Adapter(oneplus, battery = oneplus.O)) 

	apple = Apple() 
	objects.append(Adapter(apple, battery = apple.A)) 

	samsung = Samsung() 
	objects.append(Adapter(samsung, battery = samsung.S)) 

	for obj in objects: 
	    print("{0} has {1}Mah battery".format(obj.name, obj.battery())) 
