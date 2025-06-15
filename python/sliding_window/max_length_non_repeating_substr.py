
def get_max_length_non_repeating_subarray(input_string):
    
    senn_set = set() # set to store already seen elements in window
    left = 0
    max_length = 0

    for right in range(len(input_string)):

        while input_string[right] in senn_set:
            senn_set.remove(input_string[left])
            left+=1


        senn_set.add(input_string[right])
        max_length = max(max_length, right - left + 1)
    
    return max_length


input = 'abadcad'

print(get_max_length_non_repeating_subarray(input))