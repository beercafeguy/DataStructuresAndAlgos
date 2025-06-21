from typing import List
from collections import Counter
import heapq

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        holder = dict()

        for num in nums:
            if num in holder:
                holder[num] +=1
            else:
                holder[num] = 1
        sorted_dict = sorted(holder.items(), key= lambda item: item[1], reverse=True)
        return [i for i,j in sorted_dict[:k]]
    

    def topKFrequentEfficient(self, nums, k):

        counter = Counter(nums)
        return heapq.nlargest(k, counter.keys(), key = counter.get)

    # without heapq directly
    def topKFrequentEfficient1(self, nums, k):

        counter = Counter(nums)
        return [i[0] for i in counter.most_common(k)]

nums = [7,7]
k = 1

sol = Solution()
print(sol.topKFrequentEfficient1(nums, k))        