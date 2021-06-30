package com.beercafeguy.ds.tree;


public class HeightOfBinaryTree {

    public static void main(String[] args) {

        BinaryTree binaryTree=new BinaryTree();
        binaryTree.root=getIntTreeNode(10);
        binaryTree.root.left=getIntTreeNode(20);
        binaryTree.root.right=getIntTreeNode(30);
        binaryTree.root.left.left=getIntTreeNode(40);
        binaryTree.root.left.right=getIntTreeNode(50);
        binaryTree.root.right.left=getIntTreeNode(60);
        binaryTree.root.right.right=getIntTreeNode(70);


        binaryTree.printLeafNodes();

        System.out.println(binaryTree.countLeafNodes());
        System.out.println();
        System.out.println(binaryTree.height());
    }



    public static IntTreeNode getIntTreeNode(int val){
        return new IntTreeNode(val);
    }
}

