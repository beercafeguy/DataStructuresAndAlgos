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

    def delete_first_element(self):
        if self.length == 0:
            print("List is empty")
        else:
            self.head = self.head.next
            self.length-=1
    
    def delete_last_element(self):
        if self.length == 0:
            print("List is empty")
        else:
            current = self.head
            prev = self.head
            while current.next:
                prev = current
                current = current.next
            prev.next = None
            self.tail = prev
            self.length-=1

    def delete_value(self, value):
        current = self.head
        prev = self.head

        while current.next != None or current.value != value:
            if current.value == value:
                prev.next = current.next
                self.length -=1
                return
            else:
                prev = current
                current = current.next
        print(f"{value} is not present in list")
        


    
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
    ll.delete_first_element()
    ll.delete_last_element()
    ll.print()
    ll.delete_value(7)
    ll.delete_value(41)
    ll.print()

main()

