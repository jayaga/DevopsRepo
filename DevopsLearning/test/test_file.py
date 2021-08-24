import pytest


def addnum(a, b):
    return a + b


def test_add1():
    assert (addnum(2, 3) == 5)


def test_add2():
    assert (addnum(2, 4) == 5)


def test_add3():
    assert (addnum(2, 5) == 6)
