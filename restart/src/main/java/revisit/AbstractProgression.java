package revisit;

public abstract class AbstractProgression {
    protected long current;

    public AbstractProgression(long initialVal) {
        this.current = initialVal;
    }

    public AbstractProgression() {
        this(0);
    }

    public long nextValue(){
        long ans=current;
        advance(); // use of template design pattern
        return ans;
    }

    protected abstract void advance();

    public void printProgression(int n){
        System.out.print(nextValue());
        for (int count=0;count<n;count++){
            System.out.print(" "+nextValue());
        }
        System.out.println();
    }
}
