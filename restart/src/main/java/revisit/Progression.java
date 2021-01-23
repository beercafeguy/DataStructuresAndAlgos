package revisit;

public class Progression {

    protected long current;

    public Progression(long initialVal) {
        this.current = initialVal;
    }

    public Progression() {
        this(0);
    }

    public long nextValue(){
        long ans=current;
        advance();
        return ans;
    }

    protected void advance() {
        current++;
    }

    public void printProgression(int n){
        System.out.print(nextValue());
        for (int count=0;count<n;count++){
            System.out.print(" "+nextValue());
        }
        System.out.println();
    }
}
