package com.beercafeguy.ds.tree;

import java.util.ArrayList;

public class BinaryTree{

    IntTreeNode root;
    public BinaryTree(){
        root=null;
    }

    public int height(){
        return height(root);
    }

    private int height(IntTreeNode root) {
        if(root==null){
            return 0;
        }else{
            int leftHeight=height(root.left);
            int rightHeight=height(root.right);
            if(leftHeight>rightHeight){
                return leftHeight+1;
            }else{
                return rightHeight+1;
            }
        }
    }

    public ArrayList<Integer> leftView(IntTreeNode passedRoot){

        ArrayList<Integer> result=new ArrayList<>();
        if(passedRoot==null){
            return result;
        }else {
            result.add(passedRoot.data);
            return leftView(passedRoot.left);
        }
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
