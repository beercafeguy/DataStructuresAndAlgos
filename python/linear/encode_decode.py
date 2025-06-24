from typing import List

class Solution:

    def encode(self, strs: List[str]) -> str:
        return "".join([f"{len(s)}#{s}" for s in strs])

    def decode(self, s: str) -> List[str]:

        result = []
        i = 0
        while i < len(s):
            j = i
            while s[j] != "#":
                j +=1
            
            length = int(s[i:j])
            i = j + 1
            result.append(s[i:i+length])
            i = i + length
        return result
    
ip = ["we","say",":","yes"]
sol = Solution()
encoded_str = sol.encode(ip)
print(encoded_str)

print(sol.decode(encoded_str))