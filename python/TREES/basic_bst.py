class TreeNode:

    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None
    
    def __str__(self):
        return f"TreeNode[{self.value}]"
    

class BasicBST:

    def __init__(self):
        self.root = None


    def find(self, value):
        if not self.root:
            return None
        else:
            current = self.root
            while current:
                if current.value == value:
                    return current
                elif value < current.value:
                    current = current.left
                else:
                    current = current.right
            return None
    
    def _traverse_pre_order(self, _root):
        if _root:
            return [_root.value] + self._traverse_pre_order(_root.left) + self._traverse_pre_order(_root.right) 
        else:
            return []
    
    def traverse_pre_order(self):
        return self._traverse_pre_order(self.root)

    def _traverse_in_order(self, _root):
        result = []

        def helper(node):
            if not node:
                return
            helper(node.left)
            result.append(node.value)
            helper(node.right)

        helper(_root)
        return result

    def traverse_in_order(self):
        return self._traverse_in_order(self.root)
    
    def _insert_recursive(self, root, value):
        if root == None:
            root = TreeNode(value)
            return root
        if value < root.value:
            root.left = self._insert_recursive(root.left, value)
        else:
            root.right = self._insert_recursive(root.right, value)
        return root

    def insert_recursive(self, value):
        return self._insert_recursive(self.root, value)

    def insert(self, value):

        new_node = TreeNode(value)
        if not self.root:
            self.root = new_node
        else:
            current = self.root
            while True:
                if value < current.value:
                    if current.left is None:
                        current.left = new_node
                        return
                    current = current.left
                else:
                    if current.right is None:
                        current.right = new_node
                        return
                    current = current.right
                    
                    



bst_app = BasicBST()
bst_app.insert(10)
bst_app.insert(20)
bst_app.insert_recursive(5)
bst_app.insert(6)
bst_app.insert_recursive(15)


print(bst_app.traverse_in_order())
print(bst_app.traverse_pre_order())

print(bst_app.find(15))
print(bst_app.find(16))


"""
root = TreeNode(10)
root.left = TreeNode(5)
root.right = TreeNode(15)

def inorder_traverse(_root):
    result = []

    def helper(node):
        if not node:
            return
        else:
            helper(node.left)
            result.append(node.value)
            helper(node.right)
    helper(_root)
    return result

print(inorder_traverse(root))

"""