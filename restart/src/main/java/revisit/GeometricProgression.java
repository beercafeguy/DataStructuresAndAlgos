package revisit;

public class GeometricProgression extends Progression{
    private long multiplier;
    public GeometricProgression(long multiplier,long initialVal) {
        super(initialVal);
        this.multiplier=multiplier;
    }

    public GeometricProgression() {
        this(2,2);
    }

    public GeometricProgression(long multiplier) {
        this(multiplier,2);
    }

    @Override
    public void advance() {
        current*=multiplier;
    }

}
