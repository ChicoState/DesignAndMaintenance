from __future__ import annotations
from abc import ABC, abstractmethod
from datetime import datetime
from random import sample
from string import ascii_letters, digits
import textwrap 


class Originator():
    """
    The Originator holds some important state that may change over time. It also
    defines a method for saving the state inside a memento and another method
    for restoring the state from it.
    """

    _state = None
    """
    For the sake of simplicity, the originator's state is stored inside a single
    variable.
    """

    def __init__(self, state: str, name: str) -> None:
        self._state = state
        self.name = name
        print(f"Originator: Document Saved: {self._state}")

    def showname(self) -> str:
        return self.name


    def changeit(self, a: str) -> None:
        """
        The Originator's business logic may affect its internal state.
        Therefore, the client should backup the state before launching methods
        of the business logic via the save() method.
        """

        print("Originator: Document Overwritten.")
        self._state = a
        print(f"Originator: Updated Document: {self._state}")


    def save(self) -> Memento:
        """
        Saves the current state inside a memento.
        """

        return ConcreteMemento(self._state)

    def restore(self, memento: Memento) -> None:
        """
        Restores the Originator's state from a memento object.
        """

        self._state = memento.get_state()
        print(f"Originator: My state has changed to: {self._state}")


class Memento(ABC):
    """
    The Memento interface provides a way to retrieve the memento's metadata,
    such as creation date or name. However, it doesn't expose the Originator's
    state.
    """

    @abstractmethod
    def get_name(self) -> str:
        pass

    @abstractmethod
    def get_date(self) -> str:
        pass


class ConcreteMemento(Memento):
    def __init__(self, state: str) -> None:
        self._state = state
        self._date = str(datetime.now())[:19]

    def get_state(self) -> str:
        """
        The Originator uses this method when restoring its state.
        """
        return self._state

    def get_name(self) -> str:
        """
        The rest of the methods are used by the Caretaker to display metadata.
        """

        return f"{self._date} / ({self._state[0:9]}...)"

    def get_date(self) -> str:
        return self._date


class Caretaker():
    """
    The Caretaker doesn't depend on the Concrete Memento class. Therefore, it
    doesn't have access to the originator's state, stored inside the memento. It
    works with all mementos via the base Memento interface.
    """

    def __init__(self, originator: Originator) -> None:
        self._mementos = []
        self._originator = originator

    def backup(self) -> None:
        print("\nCaretaker: Saving Originator's state...")
        self._mementos.append(self._originator.save())

    def undo(self) -> None:
        if not len(self._mementos):
            return

        memento = self._mementos.pop()
        print(f"Caretaker: Restoring state to: {memento.get_name()}")
        try:
            self._originator.restore(memento)
        except Exception:
            self.undo()

    def show_history(self) -> None:
        print("Caretaker: Here's the list of mementos:")
        for memento in self._mementos:
            print(memento.get_name())




def actualEdit(originator: Originator, caretaker: Caretaker):
    while(True):
        print("1 Overwrite existing document")
        print("2 Show previous changes in the document")
        print("3 Undo to previous version")
        print("4 Save and Exit")
        z = input("Enter your choise: ")
        if z == '4':
            break
        elif z == '1':
            a = input("Please start typing here and press enter to save the document: ")
            originator.changeit(a)
            caretaker.backup()
        elif z == '2':
            caretaker.show_history()
        elif z == '3':
            caretaker.undo()
    return originator

 
def Edit(listoriginator, listcaretake):
    print("Choose from below list documents to edit: ")
    j = 1
    for x in listoriginator:
        print("{} {}".format(j, x.showname()))
    a = int(input("Enter your choise: "))
    a = a -1
    listoriginator[a] = actualEdit(listoriginator[a], listcaretake[a])




if __name__ == "__main__":


    print("Welcome to Editor, Create, Edit, Save and Undo your Work ")
    listoriginator = []
    listcaretake = []

    while(True):
        print("Menu: ")
        print("1 Create new document")
        print("2 Edit existing document")
        print("3 Exit")
        x = input("Please enter your choise: ")
        if x == '1':
            name = input("Please enter name for the document: ")
            y = input("\n Please start typing here and press enter to save the document: \n")
            originator = Originator(y, name)
            caretaker = Caretaker(originator)
            caretaker.backup()
            listoriginator.append(actualEdit(originator, caretaker))
            listcaretake.append(caretaker)

        elif x == '3':
            break


        elif x == '2':
            Edit(listoriginator, listcaretake)