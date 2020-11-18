package com.singletonDP;
// This is Singleton Class and will work for sequential execution
// This will not run for threads that run in parallel because they execute at the same time

// This is called Lazy Singleton DP (After Eager Singleton DP)
public class Singleton {

    public static void main(String[] args){

        Abc obj1 = Abc.anyMethod(); // Creates instance once here
        Abc obj2 = Abc.anyMethod(); // Does not create an instance
    }
}

class Abc{

    public static Abc obj;

    private Abc(){
        System.out.println("Instance created");
    }

    public static Abc anyMethod(){
        if(obj == null){
            obj = new Abc();
        }
        return obj;
    }
}

