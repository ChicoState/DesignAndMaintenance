"""
Define a represention for a grammar of the given language along with an
interpreter that uses the representation to interpret sentences in the
language.
"""

import abc
import hashlib


class AbstractExpression(metaclass=abc.ABCMeta):
    """
    Declare an abstract Interpret operation that is common to all nodes
    in the abstract syntax tree.
    """

    @abc.abstractmethod
    def interpret(self):
        pass


class NonterminalExpression(AbstractExpression):
    """
    Implement an Interpret operation for nonterminal symbols in the grammar.
    """

    def __init__(self, expression):
        self._expression = expression

    def interpret(self, data: str, con: str):
        return self._expression.interpret(data, con)



def checkPali(con: str):
    con = con.casefold()
    rev_con = reversed(con)
    if list(con) == list(rev_con):
        return "String is Palindrome"
    else:
        return "String is not Palindrome"


def checkVowel(con: str):
    vowels = "aeiou"
    con = con.casefold()
    count = {}.fromkeys(vowels, 0)
    for char in con:
        if char in count:
            count[char] += 1
    return count



def checkhash(con : str):
    result = hashlib.sha256(con.encode())
    return result.hexdigest()


class TerminalExpression(AbstractExpression):
    """
    Implement an Interpret operation associated with terminal symbols in
    the grammar.
    """
    def __init__(self):
        self.data = ["palindrome", "vowelcount", "hash"]

    def interpret(self, content: str, con : str):
        if content in self.data[0]:
            return checkPali(con)
        elif content in self.data[1]:
            return checkVowel(con)
        elif content in self.data[2]:
            return checkhash(con)


def main():
    te = TerminalExpression()
    cp = NonterminalExpression(te)
    print(cp.interpret("palindrome", "Madam"))
    print(cp.interpret("vowelcount", "Madam"))
    print(cp.interpret("hash", "Madam"))


if __name__ == "__main__":
    main()