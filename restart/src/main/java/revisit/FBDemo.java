package revisit;

public class FBDemo {
    public static void main(String[] args) {
        Progression progression=new FibonacciProgression();
        progression.printProgression(10);

        Progression completeFp=new FibonacciProgression(5,10);
        completeFp.printProgression(10);
    }
}
