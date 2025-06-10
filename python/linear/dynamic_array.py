from array import array
class dynamic_array:

    size  = 0
    storage_arr  = None
    def __init__(self, initial_size = 5):
        self.storage_arr = array('i', [0]* 5)
        self.size = 0
    

    def add_element(self, element):
        if self.size >= len(self.storage_arr) * 0.7:
            self.tmp_storage = array('i', [0] * 2 * len(self.storage_arr))
            for i in range(0, self.size):
                self.tmp_storage[i] = self.storage_arr[i]
            self.storage_arr = self.tmp_storage
        self.storage_arr[self.size] = element
        self.size +=1
    
    def __str__(self):
        return ','.join(map(str,self.storage_arr[0:self.size]))
    


arr = dynamic_array(5)
arr.add_element(21)
arr.add_element(22)
arr.add_element(22)
arr.add_element(22)
arr.add_element(22)
arr.add_element(22)
print(arr)
