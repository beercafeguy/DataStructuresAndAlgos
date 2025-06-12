def get_two_sums_indices(nums, target):

    if len(nums) <=1:
        return []
    else:
        for i, num_out in enumerate(nums):
            for j, num_in in enumerate(nums):
                if i != j and num_in + num_out == target:
                    return [i, j]
        return []

def get_two_sums_indices_with_map(nums, target):

    holder_map = {}

    if len(nums) <=1:
        return []
    else:
        for i, num_out in enumerate(nums):
            diff = target - num_out
            if diff in holder_map:
                return [holder_map[diff], i]
            else:
                holder_map[num_out] = i
        return []


print(get_two_sums_indices_with_map([3, 2, 4], 6))
