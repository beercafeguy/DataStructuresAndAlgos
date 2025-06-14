def is_array_sorted(arr):

    for i in range(len(arr)-1):
        if arr[i] > arr[i+1]:
            return False
    return True  


def is_array_sorted_recursion(arr):
    if len(arr) == 1:
        return True
    else:
        return arr[0] < arr[1] and is_array_sorted(arr[1:])

def main():
    input_array1 = [1,4,6,90, 34, 54]
    input_array2 = [34, 56, 789, 2345, 9056]
    

    print(is_array_sorted(input_array1))
    print(is_array_sorted(input_array2))


    print(is_array_sorted_recursion(input_array1))
    print(is_array_sorted_recursion(input_array2))

main()