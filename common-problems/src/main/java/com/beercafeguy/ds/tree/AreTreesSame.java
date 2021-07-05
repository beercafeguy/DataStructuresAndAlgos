package com.beercafeguy.ds.tree;

public class AreTreesSame {

    public static void main(String[] args) {

        BinaryTree binaryTree=new BinaryTree();
        binaryTree.root=getIntTreeNode(10);
        binaryTree.root.left=getIntTreeNode(20);
        binaryTree.root.right=getIntTreeNode(30);
        binaryTree.root.left.left=getIntTreeNode(40);
        binaryTree.root.left.right=getIntTreeNode(50);
        binaryTree.root.right.left=getIntTreeNode(60);
        binaryTree.root.right.right=getIntTreeNode(70);

        AreTreesSame app=new AreTreesSame();
        System.out.println(app.isSameTree(binaryTree.root,binaryTree.root));
    }

    public boolean isSameTree(IntTreeNode p, IntTreeNode q) {

        if(p == null && q == null){
            return true;
        }else if (p != null && q !=null){
            return (p.data == q.data) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }else{
            return false;
        }
    }

    public static IntTreeNode getIntTreeNode(int val){
        return new IntTreeNode(val);
    }
}
