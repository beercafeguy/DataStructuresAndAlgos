package com.beercafeguy.study.ds.sorting;

import java.util.Arrays;

public class DArray {

    private int[] theArray;
    private int nElements;

    public DArray(int maxSize) {
        theArray=new int[maxSize];
        this.nElements = 0;
    }

    public void mergeSort(){
        int[] workspace=new int[nElements];
        recMergeSort(workspace,0,nElements-1);
    }

    private void recMergeSort(int[] workspace, int lowerBound, int upperBound) {
        if(lowerBound==upperBound){
            return;
        }else{
            int mid=(lowerBound+upperBound)/2; //find middle
            recMergeSort(workspace,lowerBound,mid); //sort lower half
            recMergeSort(workspace,mid+1,upperBound); //sort upper half
            merge(workspace,lowerBound,mid+1,upperBound); //merge the result of sort
        }
    }

    private void merge(int[] workSpace, int lowPtr,
                       int highPtr, int upperBound)
    {
        int j = 0;         // workspace index
        int lowerBound = lowPtr; // start point of first array
        int mid = highPtr-1; // higher end of first array
        int n = upperBound-lowerBound+1;         // # of items

        while(lowPtr <= mid && highPtr <= upperBound) //till both the arrays has elements
            if( theArray[lowPtr] < theArray[highPtr] )
                workSpace[j++] = theArray[lowPtr++];
            else
                workSpace[j++] = theArray[highPtr++];
        while(lowPtr <= mid) //when only first array has elements
            workSpace[j++] = theArray[lowPtr++];
        while(highPtr <= upperBound) // when only second array has elements
            workSpace[j++] = theArray[highPtr++];

        for(j=0; j<n; j++)
            theArray[lowerBound+j] = workSpace[j]; //copy workspace to main array
    } // end merge()

    public void insert(int val){
        theArray[nElements++]=val;
    }

    public void print(){
        System.out.println(Arrays.toString(Arrays.copyOfRange(theArray,0,nElements)));
    }
}
