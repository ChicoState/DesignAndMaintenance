def singleton(myClass):
	instances = {} #dictonary of instances
	def getInstance(*args, **kwargs):
		if myClass not in instances: #if instance of myClass is not already there in dictonary of instances
			instances[myClass] = myClass(*args, **kwargs) #Create new instance
		return instances[myClass] #return newly created instance
	return getInstance #return function


@singleton #decorator
class PhoneBook(object):

	def __init__(self):
		self.database = {}


	def AddContact(self, Name, Number): #Function to store contact in the database dictonary
		self.database[Name] = Number
		print("One new contact added to Phone Book")


	def GetContact(self, Name): #Function to retrieve contact information from database dictonary
		return self.database[Name]
	


if __name__ == "__main__":
	x = PhoneBook() #Created the very first intance of singleton class
	
	x.AddContact("Jayesh", 6124697466)
	x.AddContact("Nomaan", 5307176298)
	x.AddContact("Diksha", 5309335595)

	y = PhoneBook() #The new instance created here points to the old instance created earlier (x)
	print("Contact Jayesh: ", y.GetContact("Jayesh"))
	print("Contact Nomaan: ", y.GetContact("Nomaan"))
	print("Contact Diksha: ", y.GetContact("Diksha"))
