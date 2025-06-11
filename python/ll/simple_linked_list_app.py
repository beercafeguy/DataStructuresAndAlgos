class LinkedListNode:

    def __init__(self, value):
        self.value = value
        self.next = None

class SimpleLinkedList:

    def __init__(self):
        self.head = None
        self.tail = None
    
    def insert(self, value):
        node = LinkedListNode(value)
        if self.head == None:
            self.head = node
            self.tail = node
        else:
            self.tail.next = node
            self.tail = node
    
    def print(self):

        current = self.head

        while current != None:
            print(current.value)
            current = current.next


def main():
    ll = SimpleLinkedList()
    for i in range(1, 10):
        ll.insert(i)
    
    ll.print()

main()

