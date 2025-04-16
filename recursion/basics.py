

# fibonacci series


# loop version

def fib_loop(num):
    result = 1
    while num > 1:
        result = result * num
        num-=1
    return result


def fib_recursive(n):
    if n == 1:
        return 1
    else:
        return n * fib_recursive(n-1)
#print(fib_loop(4))

print(fib_recursive(4))