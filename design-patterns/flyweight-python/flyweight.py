import json
from typing import Dict


class Flyweight():
    """
    Intrinsic State:

    The Flyweight stores a common portion of the state (also called intrinsic
    state) that belongs to multiple real business entities. The Flyweight
    accepts the rest of the state (extrinsic state, unique for each entity) via
    its method parameters.
    """

    def __init__(self, shared_state: str) -> None:
        self._shared_state = shared_state

    def operation(self, unique_state: str) -> None:
        s = json.dumps(self._shared_state)
        u = json.dumps(unique_state)
        print(f"Flyweight: Displaying shared ({s}) and unique ({u}) state.", end="")


class FlyweightFactory():
    """
    The Flyweight Factory creates and manages the Flyweight objects. It ensures
    that flyweights are shared correctly. When the client requests a flyweight,
    the factory either returns an existing instance or creates a new one, if it
    doesn't exist yet.
    """

    _flyweights: Dict[str, Flyweight] = {}

    def __init__(self, initial_flyweights: Dict) -> None:
        for state in initial_flyweights:
            self._flyweights[self.get_key(state)] = Flyweight(state)

    def get_key(self, state: Dict) -> str:
        """
        Returns a Flyweight's string hash for a given state.
        """

        return "_".join(sorted(state))

    def get_flyweight(self, shared_state: Dict) -> Flyweight:
        """
        Returns an existing Flyweight with a given state or creates a new one.
        """

        key = self.get_key(shared_state)

        if not self._flyweights.get(key):
            print("FlyweightFactory: Can't find a flyweight, creating new one.")
            self._flyweights[key] = Flyweight(shared_state)
        else:
            print("FlyweightFactory: Reusing existing flyweight.")

        return self._flyweights[key]

    def list_flyweights(self) -> None:
        count = len(self._flyweights)
        print(f"FlyweightFactory: I have {count} flyweights:")
        print("\n".join(map(str, self._flyweights.keys())), end="")


def add_account_to_bank_database(
    factory: FlyweightFactory, account_number: str, owner: str,
    account_type: str, card_type: str, facility: str
) -> None:
    #Extrinsic State
    print("\n\nClient: Adding a customer account to database.")
    flyweight = factory.get_flyweight([account_type, card_type, facility])
    # The client code either stores or calculates extrinsic state and passes it
    # to the flyweight's methods.
    flyweight.operation([account_number, owner])


if __name__ == "__main__":
    """
    The client code usually creates a bunch of pre-populated flyweights in the
    initialization stage of the application.
    """

    factory = FlyweightFactory([
        ["Checking Account", "Credit Card", "Net Banking"],
        ["Savings Account", "Debit Card", "Mobile Banking"],
        ["Interest Bearing Checking Accounts", "Credit Card", "Net Banking"],
        ["Brokerage_Accounts", "Credit_Card", "Mobile_Banking"],
    ])

    factory.list_flyweights()

    add_account_to_bank_database(
        factory, "010424454", "Nomaan Shaikh", "Checking Account", "Credit Card", "Net Banking")

    add_account_to_bank_database(
        factory, "010424459", "Jayesh Sathe", "Investment Retirement Accounts", "Debit Card", "Net Banking")

    print("\n")

    factory.list_flyweights()