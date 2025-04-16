

# factorial
# loop version

def fact_loop(num):
    result = 1
    while num > 1:
        result = result * num
        num-=1
    return result


# recursive
def fact_recursive(n):
    if n == 1:
        return 1
    else:
        return n * fact_recursive(n-1)
#print(fact_loop(4))

print(fact_recursive(4))


# print fibonacci series

# loop method
def print_fib(n):
    if n == 1:
        return 0
    elif n == 2:
        return 1
    else:
        a,b = 0, 1
        for _ in range(2, n):
            a, b = b , a+b
        return b


def get_fib_series(n):
    if n ==1:
        return [0]
    elif n ==2:
        return [0,1]
    else:
        ser = [0,1]
        for i in range(2, n):
            ser.append(ser[i-2] + ser[i-1])
        return ser


print(print_fib(4))
print(get_fib_series(5))
print(get_fib_series(1))
print(get_fib_series(2))