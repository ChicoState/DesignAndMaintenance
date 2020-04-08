# Python Code for factory method  
# it comes under the creational  
# Design Pattern 
  
class HexadecimalLocalizer: 
  
    """ it simply returns the hexadecimal version """
        
    def localize(self, value): 
        
        data = {0 : "0", 1 : "1", 2 : "2", 3 : "3", 4 : "4", 5 : "5", 6 : "6", 7 : "7", 8 : "8", 9 : "9", 10 : "a", 11 : "b", 12 : "c",13 : "d",14 : "e",15 : "f"}
        hexadecimal = "" 
        i, n = 0, 0 
        decimal = value
        while(decimal != 0):
            temp = decimal % 16
            hexadecimal = hexadecimal + data[temp]
            decimal = decimal // 16
            i += 1
  

        return hexadecimal[::-1] 
  
class BinaryLocalizer: 
    """it simply returns the binary version"""
    def localize(self, value): 
        binary, i, n = 0, 0, 0 
        decimal = value
        while(decimal != 0):
            temp = decimal % 2
            binary = binary + temp * pow(10, i)
            decimal = decimal // 2
            i += 1

        return binary 
  
class OctalLocalizer: 
    """Simply returns the Octal version"""
  
    def localize(self, value): 
        octal, i, n = 0, 0, 0 
        decimal = value
        while(decimal != 0):
            temp = decimal % 8
            octal = octal + temp * pow(10, i)
            decimal = decimal // 8
            i += 1
        return octal 
  
def Factory(conversions ="Hexadecimal"): 
  
    """Factory Method"""
    localizers = { 
        "Hexadecimal": HexadecimalLocalizer, 
        "Binary": BinaryLocalizer, 
        "Octal": OctalLocalizer, 
    } 
  
    return localizers[conversions]() 
  
if __name__ == "__main__": 
  
    h = Factory("Hexadecimal") 
    b = Factory("Binary") 
    o = Factory("Octal") 
  
    input = [7,73,178] 
  
    for i in input: 
        print("Hexadecimal of {} is {}".format(i, h.localize(i))) 
        print("Binary of {} is {}".format(i, b.localize(i)))
        print("Octal of {} is {}".format(i, o.localize(i)))
