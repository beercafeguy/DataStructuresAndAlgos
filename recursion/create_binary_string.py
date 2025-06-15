def append_at_list_front(x, l):
    return [x + element for element in l]
def get_binary_strings(n):
    if n==0:
        return []
    elif n == 1:
        return ["0","1"]
    else:
        return (append_at_list_front('0', get_binary_strings(n-1)) + append_at_list_front('1', get_binary_strings(n-1)))


print(get_binary_strings(3))