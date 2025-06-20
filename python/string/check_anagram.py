
def are_anagram(s, t):
    str1 = s
    str2 = t
    holder = dict()
    for ch in str1:
        if ch in holder:
            holder[ch] +=1
        else:
            holder[ch] = 1
        
    for ch in str2:
        if ch not in holder:
            return False
        holder[ch] = holder[ch] -1
        if holder[ch] < 0:
            return False
    return True 


print(are_anagram('and','dnas'))