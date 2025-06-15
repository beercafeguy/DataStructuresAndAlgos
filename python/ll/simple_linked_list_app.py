class LinkedListNode:

    def __init__(self, value):
        self.value = value
        self.next = None

class SimpleLinkedList:

    def __init__(self):
        self.head = None
        self.tail = None
        self.length = 0
    
    def insert(self, value):
        node = LinkedListNode(value)
        if self.head == None:
            self.head = node
            self.tail = node
        else:
            self.tail.next = node
            self.tail = node
        self.length +=1
    
    def insert_at_start(self, value):
        new_node = LinkedListNode(value)
        new_node.next = self.head
        self.head = new_node
        self.length += 1
    
    def insert_at_given_position(self, position, value):
        if position > self.length:
            return None
        if position == 0:
            self.insert_at_start(value)
        else:

            new_node = LinkedListNode(value)
            current = self.head
            i = 0
            while i < position -1:
                current = current.next
                i+=1
            new_node.next = current.next
            current.next = new_node
        self.length+=1


    
    def print(self):
        print(self.get_as_py_list())

    def get_as_py_list(self):
        current = self.head
        result = []
        while current:
            result.append(current.value)
            current = current.next
        return result
    



def main():
    ll = SimpleLinkedList()
    for i in range(1, 10):
        ll.insert(i)
    
    ll.insert_at_start(12)
    ll.insert_at_given_position(3, 34)
    
    ll.print()

main()

