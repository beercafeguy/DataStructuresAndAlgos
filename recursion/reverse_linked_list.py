class ListNode:

    def __init__(self, value):
        self.value = value
        self.next = None


class SimpleLinkedList:

    def __init__(self):
        self.head = None
        self.tail = None
    
    def insert(self, value):
        new_node = ListNode(value)
        if self.head == None:
            self.head = new_node
            self.tail = self.head
        else:
            self.tail.next = new_node
            self.tail = self.tail.next
    
    def print(self):
        self._print(self.head)
    
    def _print(self, head_node):
        curr = head_node
        result = []
        while curr:
            result.append(curr.value)
            curr = curr.next
        print(result)

    

    def reverse_iterative(self):

        previous = None
        current = self.head
        while current:
            next_element = current.next
            current.next = previous
            previous = current
            current = next_element
        
        self.head = previous
         
        


def create_ll(arr):
    dummy = ListNode(0)
    curr = dummy
    for element in arr:
        curr.next = ListNode(element)
        curr = curr.next
    
    return dummy.next

def get_list_from_ll(head):
    l = []
    curr = head
    while curr:
        l.append(curr.value)
        curr = curr.next
    
    return l


def reverse_linked_list(ll_head):
    curr = ll_head
    prev = None

    while curr:
        next = curr.next
        curr.next = prev
        prev = curr
        curr = next
    
    return prev



sll = SimpleLinkedList()
sll.insert(1)
sll.insert(3)
sll.insert(5)

sll.print()
sll.reverse_iterative()
sll.print()

#sll.reverse_iterative()

simple_ll_head = create_ll([1, 2, 3, 4])
print(get_list_from_ll(simple_ll_head))
print(get_list_from_ll(reverse_linked_list(simple_ll_head)))