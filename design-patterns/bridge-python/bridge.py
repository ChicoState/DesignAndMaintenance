from __future__ import annotations
from abc import ABC, abstractmethod


class Ford_Mustang:
    """
    The abstraction Ford_Mustang defines the interface for the "control" part of the two
    class hierarchies. It maintains a reference to an object of the
    implementation Engine_Type hierarchy and delegates all of the real work to this object.
    """

    def __init__(self, engine_Type: Engine_Type) -> None:
        self.engine_Type = engine_Type


    def Base_Model_Name(self) -> str:
        return (f"EcoBoost Fastback\n")


    def Base_Price(self) -> int:
        return (26670 + self.engine_Type.Engine_Variant())


    def Engine_Specs(self) -> str:
        return(f"{self.engine_Type.Variant_Name()}")


class Eco(Ford_Mustang):
    """
    You can extend the abstraction Ford_Mustang  without changing the Engine_Type implementation classes.
    """

    def Base_Model_Name(self) -> str:
        return (f"EcoBoost Premium Fastback\n")


    def Base_Price(self) -> int:
        return (31685 + self.engine_Type.Engine_Variant())


    def Engine_Specs(self) -> str:
        return(f"{self.engine_Type.Variant_Name()}")


class Convertible(Ford_Mustang):
    """
    You can extend the abstraction Ford_Mustang  without changing the Engine_Type implementation classes.
    """

    def Base_Model_Name(self) -> str:
        return (f"EcoBoost Premium Convertible\n")


    def Base_Price(self) -> int:
        return (37185 + self.engine_Type.Engine_Variant())


    def Engine_Specs(self) -> str:
        return(f"{self.engine_Type.Variant_Name()}")


class GT(Ford_Mustang):
    """
    You can extend the abstraction Ford_Mustang  without changing the Engine_Type implementation classes.
    """

    def Base_Model_Name(self) -> str:
        return (f"GT Fastback\n")


    def Base_Price(self) -> int:
        return (37185 + self.engine_Type.Engine_Variant())


    def Engine_Specs(self) -> str:
        return(f"{self.engine_Type.Variant_Name()}")


class Engine_Type(ABC):
    """
    The implementation Engine_Type defines the interface for all implementation classes. It
    doesn't have to match the abstraction's (Ford_Mustang) interface. In fact, the two
    interfaces can be entirely different. Typically the Implementation interface
    provides only primitive operations, while the Abstraction defines higher-
    level operations based on those primitives.
    """

    @abstractmethod
    def Engine_Variant(self) -> int:
        pass


    @abstractmethod
    def Variant_Name(self) -> str:
        pass


"""
Each concrete implementations of Engine_Type corresponds to a specific platform and implements
the implementation interface Engine_Type using that platform's API.
"""


class Default(Engine_Type):
    def Engine_Variant(self) -> int:
        return 0


    def Variant_Name(self) -> str:
        return (f"Default - 2.3L EcoBoost® Engine\n")


class V6(Engine_Type):
    def Engine_Variant(self) -> int:
        return 3780


    def Variant_Name(self) -> str:
        return (f"3.0L Ti-VCT V6 Engine (BULLITT™)\n")


class V8(Engine_Type):
    def Engine_Variant(self) -> int:
        return 6899


    def Variant_Name(self) -> str:
        return (f"5.0L Ti-VCT V8 Engine (BULLITT™)\n")


class V12(Engine_Type):
    def Engine_Variant(self) -> int:
        return 9780


    def Variant_Name(self) -> str:
        return (f"7.0L Ti-VCT V12 Engine (BULLITT™)\n")



def client_code(ford_Mustang: Ford_Mustang) -> None:
    """
    Except for the initialization phase, where an abstraction Ford_Mustang object gets linked
    with a specific implementation Engine_Type object, the client code should only depend on
    the abstraction class. This way the client code can support any abstraction-
    implementation combination.
    """

    # ...

    print(ford_Mustang.Base_Model_Name(), end="")
    print("Price: ", ford_Mustang.Base_Price(), end="\n")
    print(ford_Mustang.Engine_Specs(), end="")
    # ...


if __name__ == "__main__":
    """
    The client code should be able to work with any pre-configured abstraction-
    implementation combination.
    """
    print("\n")

    engine_Type = Default()
    ford_Mustang = Ford_Mustang(engine_Type)
    client_code(ford_Mustang)

    print("\n")

    engine_Type = V12()
    ford_Mustang = Convertible(engine_Type)
    client_code(ford_Mustang)

    print("\n")

    engine_Type = V6()
    ford_Mustang = Ford_Mustang(engine_Type)
    client_code(ford_Mustang)

    print("\n")

    engine_Type = V8()
    ford_Mustang = GT(engine_Type)
    client_code(ford_Mustang)

    print("\n")