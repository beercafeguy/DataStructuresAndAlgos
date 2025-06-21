from typing import List


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        holder = dict()

        for element in strs:
            sorted_element = ''.join(sorted(element))
            if sorted_element not in holder:
                holder[sorted_element] = [element]
            else:
                holder[sorted_element].append(element)
        
        return list(holder.values())



ip = ["act","pots","tops","cat","stop","hat"]
sol = Solution()
print(sol.groupAnagrams(ip))