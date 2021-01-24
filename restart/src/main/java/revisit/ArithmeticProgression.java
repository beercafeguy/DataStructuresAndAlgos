package revisit;

public class ArithmeticProgression extends AbstractProgression{

    private long increment;
    public ArithmeticProgression(long inc,long initialVal) {
        super(initialVal);
        increment=inc;
    }

    public ArithmeticProgression() {
        this(1,0);
    }

    public ArithmeticProgression(long increment) {
        this(increment,0);
    }

    @Override
    public void advance() {
        current+=increment;
    }
}
