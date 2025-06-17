class SinglyLinkedListNode:

    def __init__(self, data):
        self.data = data
        self.next = None
    
    def __str__(self):
        return f"[{self.data}]"

def deleteNode(llist, position):
    # Write your code here
    if llist is None:
        return llist
    if position == 0:
        return llist.next
    else:
        prev = None
        current = llist
        i = 0
        while i < position and current:
            prev = current
            current = current.next
            i+=1
        if current:
            prev.next = current.next
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


test_list = [20, 6, 2, 19, 7, 4, 15, 9]
print(test_list)
test_ll = create_ll_from_list(test_list)
test_ll_post_delete = deleteNode(test_ll, 3)

list_back = list_from_ll(test_ll_post_delete)
print(list_back)

