class SinglyLinkedListNode:

    def __init__(self, data):
        self.data = data
        self.next = None
    
    def __str__(self):
        return f"[{self.data}]"


def insertNodeAtPosition(llist, data, position):
    new_node = SinglyLinkedListNode(data)
    if not llist:
        llist = new_node
        return llist
    else:
        current = llist
        i = 0
        while i < (position -1) and current:
            current = current.next
            i+=1
        if current:
            tmp = current.next
            current.next = new_node
            new_node.next = tmp
        else:
            print("Position is outside window")
        return llist



def create_ll_from_list(arr):
    head_node = None
    tail_node = None
    for a in arr:
        if not head_node:
            head_node = SinglyLinkedListNode(a)
            tail_node = head_node
        else:
            tail_node.next = SinglyLinkedListNode(a)
            tail_node = tail_node.next
    return head_node


def list_from_ll(head_node):
    current = head_node
    result = []
    while current:
        #print(current)
        result.append(current.data)
        current = current.next
    return result


initial_list = [1,2,3,4,5]
ll_head = create_ll_from_list(initial_list)

ll_head = insertNodeAtPosition(ll_head, 20, 6)
#print(ll_head)
list_back = list_from_ll(ll_head)
print(list_back)

