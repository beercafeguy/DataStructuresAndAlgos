from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        if len(nums) < 2:
            return []
        else:
            holder = dict()
            holder[nums[0]] = 0
            for j in range(1, len(nums)):
                if (target- nums[j]) in holder:
                    return [holder[target - nums[j]], j]
                else:
                    holder[nums[j]] = j
            return [] 
                



sol = Solution()

nums = [4,5,6]
target = 10

#print(sol.twoSum([1,3,8,12], 11))
print(sol.twoSum(nums, target))