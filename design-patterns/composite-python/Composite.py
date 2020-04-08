class CompositeInterface:

    def showDetails(self): 
        pass


class LeafElement(CompositeInterface): 

	'''Class representing objects at the bottom.'''

	def __init__(self, *args): 

		''''Takes the first positional argument and assigns to member variable "position".'''
		self.position = args[0] 

	def showDetails(self): 

		'''Prints position of child element.'''
		print("-", end ="") 
		print(self.position) 


class CompositeElement: 

	'''Class representing objects at any level of the hierarchy 
	tree except for the bottom level. Maintains the child 
	objects by adding and removing them from the tree structure.'''

	def __init__(self, *args): 

		'''Takes the first positional argument and assigns to member 
		variable "position". Initializes a list of children elements.'''
		self.position = args[0] 
		self.children = [] 

	def add(self, child): 

		'''Adds the supplied child element.'''
		self.children.append(child) 

	def remove(self, child): 

		'''Removes the supplied child element.'''
		self.children.remove(child) 

	def showDetails(self): 

		'''Prints the details of the component element first. Then, 
		iterates over each of its children, prints their details by 
		calling their showDetails() method.'''
		print(self.position) 
		for child in self.children: 
			print("-", end ="") 
			child.showDetails() 


"""main method"""

if __name__ == "__main__": 

	topLevelMenu = CompositeElement("Grocery Store") 
	subMenuItem1 = CompositeElement("Department 1") 
	subMenuItem2 = CompositeElement("Department 2") 
	subMenuItem11 = LeafElement("Item 1") 
	subMenuItem12 = LeafElement("Item 2") 
	subMenuItem21 = LeafElement("Item 3") 
	subMenuItem22 = LeafElement("Item 4") 
	subMenuItem1.add(subMenuItem11) 
	subMenuItem1.add(subMenuItem12) 
	subMenuItem2.add(subMenuItem22) 
	subMenuItem2.add(subMenuItem22) 

	topLevelMenu.add(subMenuItem1) 
	topLevelMenu.add(subMenuItem2) 
	topLevelMenu.showDetails() 
