def sum_of_digits(n: int) -> int:
    # base case: ?
    if n < 10:
        return n
    # recursive case: ?
    else:
        return n % 10 + sum_of_digits(n//10)

# Test Cases
print(sum_of_digits(1234))    # Expected: 10
print(sum_of_digits(0))       # Expected: 0
print(sum_of_digits(5))       # Expected: 5
print(sum_of_digits(10001))   # Expected: 2
print(sum_of_digits(9999))    # Expected: 36