
class distance_units:


    def __init__(self, length):
        self._length = length

    def convert(self):
        return self._length

class decorator(distance_units):


    def __init__(self, length):
        self._length = length

    def convert(self):
        return self._length


class in_meter(distance_units):


    def __init__(self, decorate):
        self._decorate = decorate

    def convert(self):
        return self._decorate*1000


class in_centimeter(distance_units):


    def __init__(self, decorate):
        self._decorate = decorate
    def convert(self):
        return self._decorate*100

class in_miles(distance_units):


    def __init__(self, decorate):
        self._decorate = decorate
    def convert(self):
        return self._decorate/1.609

class nautical_miles(distance_units):


    def __init__(self, decorate):
        self._decorate = decorate
    def convert(self):
        return self._decorate/1.852  


if __name__ == '__main__':
    distance = input("Enter distance in kilometers:  ")
    in_kilometer = distance_units(int(distance))
    meter = (in_meter(in_kilometer.convert()))
    final_val = in_centimeter(meter.convert())
    miles = (in_miles(in_kilometer.convert()))
    nautical = nautical_miles(miles.convert())
    print("Meter      :", meter.convert(),"m")
    print("Centimeter :", (final_val.convert()),"cm")
    print("Miles      :",round(miles.convert(),2),"mi")
    print("Nautical   :",round(nautical.convert(),2),"nmi")

