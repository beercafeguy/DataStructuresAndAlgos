def max_sum_subarray(arr, k):
    if len(arr) < k:
        return None
    else:
        window_sum = sum(arr[:k])
        max_sum = window_sum

        for i in range(k, len(arr)):
            window_sum = window_sum + arr[i] - arr[i-k]
            max_sum = max(max_sum, window_sum)
        return max_sum

def max_sum_subarray_v1(arr, k):
    if len(arr) < k:
        return None
    else:
        window_sum = sum(arr[:k])
        max_sum = window_sum
        for i in range(k, len(arr)):
            window_sum = window_sum + arr[i] - arr[i-k]
            max_sum = max(max_sum, window_sum)
        return max_sum

arr = [2, 1, 5, 1, 3, 2]
k = 3

print(max_sum_subarray_v1(arr, k))

# This is a fixed length sliding window problem