package revisit;

public class GenericPair <T,J>{
    T t;
    J j;

    public GenericPair(T t, J j) {
        this.t = t;
        this.j = j;
    }

    public T getFirst(){
        return t;
    }

    public J returnSecond(){
        return j;
    }
}
