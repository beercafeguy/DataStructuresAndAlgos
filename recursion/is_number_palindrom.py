def is_palindrome_number(n: int) -> bool:
    def helper(n, divisor):
        # base case: ?
        if (n  == 0) | (divisor == 1):
            return True
        # recursive case: ?
        else:
            left_digit = n // divisor
            right_digit = n % 10
            n = (n % divisor)//10
            divisor = divisor // 100
            return (left_digit ==   right_digit) and helper(n, divisor)



    # Find initial divisor (like 1000 for 1234)
    div = 1
    while n // div >= 10:
        div *= 10

    return helper(n, div)


print(is_palindrome_number(121))     # True
print(is_palindrome_number(12321))   # True
print(is_palindrome_number(123))     # False
print(is_palindrome_number(1))       # True
print(is_palindrome_number(10))      # False