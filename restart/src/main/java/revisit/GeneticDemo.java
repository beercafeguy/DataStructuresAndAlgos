package revisit;

public class GeneticDemo {

    public static <T> void reverse(T[] t){
        int start=0;
        int end=t.length-1;
        while(start < end){
            T tmp=t[start];
            t[start++]=t[end];
            t[end--]=tmp;
        }
    }
}
