package revisit;

public class FibonacciProgression extends Progression{

    private long prev;
    public FibonacciProgression() {
       this(1,1);
    }

    public FibonacciProgression(long first,long second) {
        super(first);
        prev=second-first; // adding a fixicious value
    }

    @Override
    protected void advance() {
        long tmp=current;
        current=current+prev;
        prev=tmp;
    }
}
