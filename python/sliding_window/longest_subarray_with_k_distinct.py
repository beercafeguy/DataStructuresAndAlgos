from typing import List
from collections import defaultdict

def longest_subarray_with_k_distinct(arr, k):
    counter_dict = defaultdict(int)

    left = 0
    right = 0

    max_len = 0

    for right in range(len(arr)):
        counter_dict[arr[right]] +=1

        while len(counter_dict) > k:
            counter_dict[arr[left]] -=1
            if counter_dict[arr[left]] == 0:
                del counter_dict[arr[left]]
            left += 1
        max_len = max(max_len, right - left +1)
    
    return max_len
        


print(longest_subarray_with_k_distinct([1, 2, 1, 2, 3], 2))