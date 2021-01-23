package revisit;

public class APDemo {
    public static void main(String[] args) {
        Progression baseProgression=new Progression();
        baseProgression.printProgression(10);

        Progression simpleAp=new ArithmeticProgression(4);
        simpleAp.printProgression(10);

        Progression fullAp=new ArithmeticProgression(4,530);
        fullAp.printProgression(10);
    }
}
