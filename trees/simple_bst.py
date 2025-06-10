class TreeNode:

    def __init__(self, value):
        self.left = None
        self.right = None
        self.value = value


class simple_bst_impl:

    def __init__(self):
        self.root_node = None
    

    def insert(self, value):
        if self.root_node == None:
            self.root_node = TreeNode(value)
        else:
            self._insert_recursive(self.root_node, value)
    

    def _insert_recursive(self, current_node, value):
        if value < current_node.value:
            if current_node.left == None:
                current_node.left = TreeNode(value)
            else:
                self._insert_recursive(current_node.left, value)
        else:
            if current_node.right == None:
                current_node.right = TreeNode(value)
            else:
                self._insert_recursive(current_node.right, value)
    

    def traverse_in_order(self):
        self._traverse_in_order_recursive(self.root_node)

    def _traverse_in_order_recursive(self, current_node):
        if current_node != None:
            self._traverse_in_order_recursive(current_node.left)
            print(current_node.value)
            self._traverse_in_order_recursive(current_node.right)



def main():
    bst = simple_bst_impl()


    bst.insert(1)
    bst.insert(2)
    bst.insert(5)
    bst.insert(4)
    bst.insert(9)

    bst.traverse_in_order()

main()
