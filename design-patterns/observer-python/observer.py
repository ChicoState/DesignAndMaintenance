from __future__ import annotations
from abc import ABC, abstractmethod
from random import randrange
from typing import List


class Observable(ABC):
    """
    The Subject interface declares a set of methods for managing subscribers.
    """

    @abstractmethod
    def addObserver(self, iobserver: IObserver) -> None:
        """
        Attach an observer to the subject.
        """
        pass

    @abstractmethod
    def removeObserver(self, iobserver: IObserver) -> None:
        """
        Detach an observer from the subject.
        """
        pass

    @abstractmethod
    def notifyObservers(self) -> None:
        """
        Notify all observers about an event.
        """
        pass


class DataModel(Observable):
    """
    The DataModel owns some important state and notifies observers when the state
    changes.
    """

    _state: int = None
    """
    For the sake of simplicity, the DataModel's state, essential to all
    subscribers, is stored in this variable.
    """

    _observers: List[IObserver] = []
    """
    List of subscribers. In real life, the list of subscribers can be stored
    more comprehensively (categorized by event type, etc.).
    """

    def addObserver(self, iobserver: IObserver) -> None:
        print("Observable: Attached an observer.")
        self._observers.append(iobserver)

    def removeObserver(self, iobserver: IObserver) -> None:
        self._observers.remove(iobserver)

    """
    The subscription management methods.
    """

    def notifyObservers(self) -> None:
        """
        Trigger an update in each subscriber.
        """

        print("DataModel: Notifying observers...")
        for observer in self._observers:
            observer.update(self)

    def inputs(self, data : int) -> None:
        """
        Usually, the subscription logic is only a fraction of what a DataModel can
        really do. Subjects commonly hold some important business logic, that
        triggers a notification method whenever something important is about to
        happen (or after it).
        """

        self._state = data
        print(f"DataModel: Received new input: {self._state}")
        self.notifyObservers()


class IObserver(ABC):
    """
    The Observer interface declares the update method, used by subjects.
    """

    @abstractmethod
    def update(self, observable: Observable) -> None:
        """
        Receive update from subject.
        """
        pass


"""
Followin Concrete Observers react to the updates issued by the Subject they had been
attached to.
"""
# This controller caluculates fibonacci series for every number thats getting changed when user enters number input
class AlertControllerA(IObserver):
    def update(self, observable: Observable) -> None:
        n1, n2 = 0, 1
        count = 0

        # check if the number of terms is valid
        if observable._state <= 0:
            print("Please enter a positive integer")
        elif observable._state == 1:
            print("Fibonacci sequence upto",observable._state,":")
            print(n1)
        else:
            print("Fibonacci sequence:")
        while count < observable._state:
            print(n1)
            nth = n1 + n2
            # update values
            n1 = n2
            n2 = nth
            count += 1
        print("AlertControllerA: Reacted to the event")

# This controller caluculates factorial for every number thats getting changed when user enters number input
class AlertControllerB(IObserver):
    def update(self, observable: Observable) -> None:
        factorial = 1

        # check if the number is negative, positive or zero
        if observable._state < 0:
            print("Sorry, factorial does not exist for negative numbers")
        elif observable._state == 0:
            print("The factorial of 0 is 1")
        else:
            for i in range(1,observable._state + 1):
                factorial = factorial*i
            print("The factorial of",observable._state,"is",factorial)
            print("AlertControllerB: Reacted to the event")


if __name__ == "__main__":
    # The client code.

    observable = DataModel()

    observer_a = AlertControllerA()
    observable.addObserver(observer_a)

    observer_b = AlertControllerB()
    observable.addObserver(observer_b)

    while True:
        try:
            s=input()
            observable.inputs(int(s))
        except EOFError:
            break

    observable.removeObserver(observer_a)