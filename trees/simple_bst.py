from collections import deque
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
        return self._traverse_in_order_recursive(self.root_node)

    def _traverse_in_order_recursive(self, current_node):
        if current_node != None:
            return (
                self._traverse_in_order_recursive(current_node.left) + 
                [current_node.value] +
                self._traverse_in_order_recursive(current_node.right)
            )
        else:
            return []
    

    def traverse_pre_order(self):
        return self._traverse_pre_order_recursive(self.root_node)

    
    def _traverse_pre_order_recursive(self, current_node):
        if current_node == None:
            return []
        else:
            return [current_node.value] + self._traverse_pre_order_recursive(current_node.left) + self._traverse_pre_order_recursive(current_node.right)
        
    
    # using queue
    def traverse_level_order_bfs(self):

        if self.root_node is None:
            return []
        
        result = []
        queue = deque([self.root_node])

        while queue: # if queue has any element
            current_node = queue.popleft() # take the current value out of queue and add to result
            result.append(current_node.value)

            if current_node.left != None:
                queue.append(current_node.left)
            
            if current_node.right != None:
                queue.append(current_node.right)
        
        return result


    # using queue
    def traverse_level_order_bfs_levelwise(self):

        if self.root_node is None:
            return []
        
        result = []
        queue = deque([self.root_node])

        while queue: # if queue has any element

            level_size = len(queue)
            level_nodes = []

            for _ in range(level_size):
                current_node = queue.popleft() # take the current value out of queue and add to result
                level_nodes.append(current_node.value)

                if current_node.left != None:
                    queue.append(current_node.left)
                
                if current_node.right != None:
                    queue.append(current_node.right)
            
            result.append(level_nodes)
        
        return result





def main():
    bst = simple_bst_impl()


    bst.insert(1)
    bst.insert(2)
    bst.insert(5)
    bst.insert(4)
    bst.insert(9)

    print(bst.traverse_in_order())
    print(bst.traverse_pre_order())
    print(bst.traverse_level_order_bfs())
    print(bst.traverse_level_order_bfs_levelwise())


main()
