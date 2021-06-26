package com.beercafeguy.ds.java;

public class CallByTest {

    public static void main(String[] args) {
        CallByValue value=new CallByValue();

        int localVal=2;
        System.out.println("Local Val = "+localVal);
        System.out.println("X="+value.x);
        System.out.println("X during INC = "+value.increaseX(localVal));
        System.out.println("X="+value.x);
        System.out.println("Local Val = "+localVal);


        System.out.println("Call by ref check");
        CallByRef call=new CallByRef(100,200);
        System.out.println("The value of obj.a and obj.b before call :");
        System.out.println("obj.a = " + call.a + "\t obj.b = " + call.b);

        call.meth(call);


        System.out.println("The value of obj.a and obj.b after call :");
        System.out.println("obj.a = " + call.a + "\t obj.b = " + call.b);

    }
}

class CallByRef{
    int a,b;

    public CallByRef(int i,int j){
        a=i;
        b=j;
    }

    void meth(CallByRef o){
        o.a=o.a/2;
        o.b=o.b*2;
    }
}

class CallByValue{

    int x;

    public int increaseX(int x){
        x=x+x;
        return x;
    }
}
