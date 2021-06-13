package com.beercafeguy.study.ds.rec;

public class KnapsackApp {

    public static void main(String[] args) {
        int[] values={60,100,120};
        int[] weight={10,20,30};
        int size=50;

        System.out.println(knapSack(size,weight,values,3));
    }


    /**
     *
     * @param maxWeight : space left in BAG
     * @param weights : weight array
     * @param values : value array
     * @param n : item number (starts with last element)
     * @return
     */
    public static int knapSack(int maxWeight,int[] weights,int[] values,int n){

        //no elements left to process or
        //no space left in bag
        if(n==0||maxWeight==0){
            return 0;
        }

        if(weights[n-1] > maxWeight){ //if weight of the item is more then the space left
            return knapSack(maxWeight,weights,values,n-1); // ignore the item
        }else{
            // weight of the item is less then the space left so now we can include the item
            // but the decision to add the item of not will be done based on the profit
            // incurred buy adding or excluding the item
            return max(
                    // 1. profit if we add the element (pass remaining weight to next iteration)
                    values[n-1] + knapSack(maxWeight-weights[n-1],weights,values,n-1),
                    // 2. profit if we ignore the item
                    knapSack(maxWeight,weights,values,n-1)
                    );
        }
    }
    public static int max(int a,int b){
        return Math.max(a, b);
    }
}
