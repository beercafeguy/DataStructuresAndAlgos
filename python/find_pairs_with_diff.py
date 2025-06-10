def find_diff_brute_force(l, d):

    count = 0
    for i in range(1, len(l)):
        for j in range(i, len(l)):
            if abs(l[i] - l[j]) == d:
                print(i,j," ")
                count+=1
    return count
def main():

    input_list = [0,4,5,2,4,5,8]
    diff = 3
    #print(find_diff_brute_force(input_list, diff))

main()