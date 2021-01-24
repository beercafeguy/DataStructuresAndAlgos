package revisit;

public class GenericPairDemo {

    public static void main(String[] args) {
        GenericPair<String,Integer> gp1=new GenericPair<>("Hem",3);
        System.out.println(gp1.getFirst());
        System.out.println(gp1.returnSecond());

        GenericPair<Double,Integer> gp2=new GenericPair<>(2.3,3);
        System.out.println(gp2.getFirst());
        System.out.println(gp2.returnSecond());

        GenericPair<String,Integer>[] genericPairs;
        genericPairs=new GenericPair[10];
        genericPairs[0]=new GenericPair<>("Hem",1);
        genericPairs[1]=new GenericPair<>("Vijay",2);

    }
}
