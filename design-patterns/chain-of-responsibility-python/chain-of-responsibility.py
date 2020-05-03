from __future__ import annotations
from abc import ABC, abstractmethod
from typing import Any, Optional


class Handler(ABC):
    """
    The Handler interface declares a method for building the chain of handlers.
    It also declares a method for executing a request.
    """

    @abstractmethod
    def set_next(self, handler: Handler) -> Handler:
        pass

    @abstractmethod
    def handle(self, request) -> Optional[str]:
        pass


class AbstractHandler(Handler):
    """
    The default chaining behavior can be implemented inside a base handler
    class.
    """

    _next_handler: Handler = None

    def set_next(self, handler: Handler) -> Handler:
        self._next_handler = handler
        # Returning a handler from here will let us link handlers in a
        # convenient way like this:
        # LengthCheck.set_next(UppercaseCheck)
        return handler

    @abstractmethod
    def handle(self, request: Any) -> str:
        if self._next_handler:
            return self._next_handler.handle(request)

        return None


"""
All Concrete Handlers either handle a request or pass it to the next handler in
the chain.
"""


class LengthHandler(AbstractHandler):
    def handle(self, request: Any) -> str:
        if len(request) < 8:
            return f"Password length is too short "
        else:
            return super().handle(request)


class UppercaseHandler(AbstractHandler):
    def handle(self, request: Any) -> str:
        flag = 0
        for x in request:
            if x.isupper():
                flag = 1
                break

        if flag == 0:
            return f"Need at least one upper case character "
        else:
            return super().handle(request)


class LowercaseHandler(AbstractHandler):
    def handle(self, request: Any) -> str:
        flag = 0
        for x in request:
            if x.islower():
                flag = 1
                break

        if flag == 0:
            return f"Need at least one lower case character "
        else:
            return super().handle(request)


class DecimalHandler(AbstractHandler):
    def handle(self, request: Any) -> str:
        flag = 0
        decimallist = ['1','2','3','4','5','6','7','8','9','0']
        for x in request:
            if x in decimallist:
                flag = 1
                break

        if flag == 0:
            return f"Need at least one decimal number {decimallist}"
        else:
            return super().handle(request)


class SpecialCharHandler(AbstractHandler):
    def handle(self, request: Any) -> str:
        flag = 0
        specialcharlist = ['~','!','@','#','$','%','^','&','*','_','-','+','=','`','|','(',')','[',']',':',';', '<','>','.','?','/']
        
        for x in request:
            if x in specialcharlist:
                flag = 1
                break

        if flag == 0:
            return f"Need at least one special character from  {specialcharlist}"
        else:
            return super().handle(request)



def client_code(handler: Handler) -> None:
    """
    The client code is usually suited to work with a single handler. In most
    cases, it is not even aware that the handler is part of a chain.
    """
    x = input("Enter the password to check if its valid: ")
    result = handler.handle(x)
    if result:
        print(f"  {result}", end="\n")
    else:
        print(f"Password is valid", end="\n")
    
        


if __name__ == "__main__":

    LengthCheck = LengthHandler()
    UppercaseCheck = UppercaseHandler()
    LowercaseCheck = LowercaseHandler()
    Decimalcheck = DecimalHandler()
    Specialcharcheck = SpecialCharHandler()

    LengthCheck.set_next(UppercaseCheck).set_next(LowercaseCheck).set_next(Decimalcheck).set_next(Specialcharcheck)
    print("Chain: LengthCheck > UppercaseCheck > LowercaseCheck > Decimalcheck > Specialcharcheck")
    print("\n")
    client_code(LengthCheck)
    print("\n")

    # The client should be able to send a request to any handler, not just the
    # first one in the chain.

    print("Subchain: Decimalcheck > Specialcharcheck")
    print("\n")
    client_code(Decimalcheck)