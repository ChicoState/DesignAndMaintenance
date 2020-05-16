class OddNumbers(object):
    "An iterable object."

    def __init__(self, maximum):
        self.maximum = maximum

    def __iter__(self):
        return OddIterator(self)

class EvenNumbers(object):
    "An iterable object."

    def __init__(self, maximum):
        self.maximum = maximum

    def __iter__(self):
        return EvenIterator(self)

class FibnocciNumbers(object):
    "An iterable object."

    def __init__(self, maximum):
        self.maximum = maximum

    def __iter__(self):
        return FibnocciIterator(self)



class OddIterator(object):
    "An iterator."

    def __init__(self, container):
        self.container = container
        self.n = -1

    def __next__(self):
        self.n += 2
        if self.n > self.container.maximum:
            raise StopIteration
        return self.n

    def __iter__(self):
        return self

class EvenIterator(object):
    "An iterator."

    def __init__(self, container):
        self.container = container
        self.n = 0

    def __next__(self):
        self.n += 2
        if self.n > self.container.maximum:
            raise StopIteration
        return self.n

    def __iter__(self):
        return self

class FibnocciIterator(object):
    "An iterator."

    def __init__(self, container):
        self.container = container
        self.a = 0
        self.b = 1

    def __next__(self):
        self.a ,self.b = self.b,self.a + self.b
        if self.a > self.container.maximum or self.b > self.container.maximum:
            raise StopIteration
        return self.b

    def __iter__(self):
        return self

def spanish_count_to(count):
	""" Built in iterator implementation"""

	numbers_in_Spanish = ["uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, diez"]

	#built-in iterator
	#Creates a tuple such as (1, "uno")
	iterator = zip(range(count), numbers_in_Spanish)
	
	#Iterate through our iterable list
	#Extract the Spanish numbers
	#Put them in a generator called number
	for position, number in iterator:
		
		#Returns a 'generator' containing numbers in Spanish
		yield number 

numbers = OddNumbers(12)
even = EvenNumbers(16)
fib = FibnocciNumbers(40)


print("Fibnocci Iterator  :",list(fib))
print("Odd Iterator       :",list(numbers))
print("Even Iterator(> 4) : ",set(n for n in even if n > 4))

for num in spanish_count_to(3):
	print("Spanish Numbers Iterator : [{}]".format(num))

	



