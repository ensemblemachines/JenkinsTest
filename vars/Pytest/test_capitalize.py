# test_capitalize.py
from allure import severity, severity_level

def capital_case(x):
    if not isinstance(x, str):
        raise TypeError('Please provide a string argument')
    return x.capitalize()

@severity(severity_level.NORMAL)
def test_capital_case1():
    assert capital_case('semaphore') == 'Semaphore'

@severity(severity_level.CRITICAL)
def test_capital_case2():
    assert capital_case('semaphore') == 'Semaphore'
    
@severity(severity_level.CRITICAL)
def test_capital_case3():
    assert capital_case('semaphore') == 'semaphore'
