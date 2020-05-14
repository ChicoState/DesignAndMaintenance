from __future__ import annotations
from abc import ABC, abstractmethod
from typing import List


class Context():
    """
    The Context defines the interface of interest to clients.
    """

    def __init__(self, stratergy: Strategy) -> None:
        """
        Usually, the Context accepts a stratergy through the constructor, but
        also provides a setter to change it at runtime.
        """

        self._stratergy = stratergy

    @property
    def stratergy(self) -> Strategy:
        """
        The Context maintains a reference to one of the Strategy objects. The
        Context does not know the concrete class of a stratergy. It should work
        with all strategies via the Strategy interface.
        """

        return self._stratergy

    @stratergy.setter
    def stratergy(self, stratergy: Strategy) -> None:
        """
        Usually, the Context allows replacing a Strategy object at runtime.
        """

        self._stratergy = stratergy

    def hcforlcm(self, a, b) -> None:
        """
        The Context delegates some work to the Strategy object instead of
        implementing multiple versions of the algorithm on its own.
        """

        # ...

        print("Context: Calculating LCM or HCF using the stratergy (not sure how it'll do it)")
        result = self._stratergy.calculate(int(a), int(b))
        print("Result: ", result)

        # ...


class Strategy(ABC):
    """
    The Strategy interface declares operations common to all supported versions
    of some algorithm.

    The Context uses this interface to call the algorithm defined by Concrete
    Strategies.
    """

    @abstractmethod
    def calculate(self, x, y):
        pass


"""
Concrete Strategies implement the algorithm while following the base Strategy
interface. The interface makes them interchangeable in the Context.
"""


class ConcreteStrategyA(Strategy):
    def calculate(self, x, y) -> int:
        print("LCM it is!")
        if x > y:
            greater = x
        else:
            greater = y

        while(True):
            if((greater % x == 0) and (greater % y == 0)):
                lcm = greater
                break
            greater += 1
        return lcm


class ConcreteStrategyB(Strategy):
    def calculate(self, x, y) -> int:
        print("HCF it is!")
        if x > y:
            smaller = y
        else:
            smaller = x
        for i in range(1, smaller+1):
            if((x % i == 0) and (y % i == 0)):
                hcf = i
        return hcf


if __name__ == "__main__":
    # The client code picks a concrete stratergy and passes it to the context.
    # The client should be aware of the differences between strategies in order
    # to make the right choice.

    context = Context(ConcreteStrategyA())
    print("Client: Strategy is set to calculate lcm of 2 numbers: ")
    context.hcforlcm(25, 68)
    print()

    print("Client: Strategy is set to calculate hcf of 2 numbers: ")
    context.stratergy = ConcreteStrategyB()
    context.hcforlcm(25, 68)