package com.beercafeguy.ds.tree;

public class LeafNodesBinaryTree {

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
    }



    public static IntTreeNode getIntTreeNode(int val){
        return new IntTreeNode(val);
    }
}

class BinaryTree{

    IntTreeNode root;
    public BinaryTree(){
        root=null;
    }

    public void printLeafNodes(){

        printLeafNodesRec(root);
        System.out.println();
    }
    public int countLeafNodes(){
        return countLeafNodesRec(root);
    }

    private int countLeafNodesRec(IntTreeNode passedRoot) {
        if(passedRoot==null){
            return 0;
        }else if (passedRoot.left==null && passedRoot.right==null){
            return 1;
        }else{
            return countLeafNodesRec(passedRoot.left)+
                    countLeafNodesRec(passedRoot.right);
        }
    }


    private void printLeafNodesRec(IntTreeNode passedRoot) {
        if(passedRoot==null){
            return;
        }else if (passedRoot.left==null && passedRoot.right==null){
            System.out.print(passedRoot.data+" ");
        }else{
            printLeafNodesRec(passedRoot.left);
            printLeafNodesRec(passedRoot.right);
        }
    }
}

class IntTreeNode{
    int data;
    IntTreeNode left,right;

    public IntTreeNode(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "data=" + data +
                '}';
    }
}
