class Phonebook(object): 
	"""Mediator class."""
	def __init__(self):
		self.Data = {}

	
	def displayphonebook(self, user):
		print("Following is the contact list for the user: ", user)
		for key in self.Data:
			print("{} : {}".format(key, self.Data[key]))


	def addcontact(self, user, name, number):
		print("Contact added in the database")
		self.Data[name] = number



class User(object): 
	'''A class whose instances want to interact with each other.'''

	def __init__(self, name): 
		self.name = name 
		self.phonebook = Phonebook() 

	def displays(self): 
		self.phonebook.displayphonebook(self) 


	def insertcontact(self, name, number ):
		self.phonebook.addcontact(self, name, number )


	def __str__(self): 
		return self.name 

"""main method"""

if __name__ == "__main__": 

	user1 = User('User 1') # user object 
	user2 = User('User 2') # user object 

	user1.insertcontact("Devam", "530-897-556") 
	user1.insertcontact("Chetan", "536-887-556")
	user1.insertcontact("Gopal", "533-897-256")
	user1.displays()

	user2.insertcontact("Nomaan", "511-897-556") 
	user2.insertcontact("Subhed", "535-887-556")
	user2.insertcontact("Aadhar", "887-897-256")

	user2.displays()




# Contact phonebook
