def find_diff_brute_force(l, d):

    count = 0
    for i in range(0, len(l)):
        for j in range(i+1, len(l)):
            if abs(l[i] - l[j]) == d:
                print(i,j," ")
                count+=1
    return count

def find_diff_hash_map(arr, k):
    element_to_indices = {}
    result = []

    for i, element in enumerate(arr):
        complement1 = element - k
        if complement1 in element_to_indices: # if the complement value is present in map keys
            indices = element_to_indices[complement1]
            for j in indices:
                result.append((j, i))
        
        complement2 = k + element
        if complement2 in element_to_indices:
            indices = element_to_indices[complement2]
            for j in indices:
                result.append((j,i))
        
        if element in element_to_indices:
            element_to_indices[element].append(i)
        else:
            element_to_indices[element] = [i]

    return result

def main():

    input_list = [1, 5, 3, 4, 2]
    diff = 2
    print(find_diff_brute_force(input_list, diff))

    print(find_diff_hash_map(input_list, diff))

main()