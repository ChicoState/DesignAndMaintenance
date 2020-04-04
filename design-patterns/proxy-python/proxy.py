"""Interface for Proxy and real project."""
class Shape_Interface: 

    def triangle(self, height, base):
        raise NotImplementedError()

    def parallelo_gram(self, height, base):
        raise NotImplementedError()

    def rectangle(self, height, base):
        raise NotImplementedError()
 
    def trapezium(self, height, base,side):
        raise NotImplementedError()

class area_Finder(Shape_Interface):
    """Real project."""
    def triangle(self, height, base):
        return 1/2*(height * base)

    def parallelo_gram(self, height, base):
        return (height * base)

    def rectangle(self, height, base):
        return (height * base)

    def trapezium(self, height, base, side):
        return 1/2*(side+base)*height

class Proxy_area(Shape_Interface):
    """Proxy"""
    def __init__(self):
        self.area_Finder = area_Finder()

    def triangle(self, height, base):
        return self.area_Finder.triangle(height, base)

    def parallelo_gram(self, height, base):
        return self.area_Finder.parallelo_gram(height, base)

    def rectangle(self, height, base):
        return self.area_Finder.rectangle(height, base)

    def trapezium(self, height, base,side):
        if side == 0:
            print("Side length can't be none.")
        else: 
          return self.area_Finder.trapezium(height, base, side)

proxy = Proxy_area()
height, base, side = 4, 2, 5
print('Area Of Triangle      = ' + str(proxy.triangle(height, base)))
print('Area Of Parallelogram = ' + str(proxy.parallelo_gram(height, base)))
print('Area of triangle      = ' + str(proxy.rectangle(height, base)))
print('Area of trapezium     = ' + str(proxy.trapezium(height, base, side)))