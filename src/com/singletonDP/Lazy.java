package com.singletonDP;
// This is Lazy Singleton DP
public class Lazy {
    public static void main(String[] args){

        Abz obj1 = Abz.anyMethod(); // Creates instance once here
        Abz obj2 = Abz.anyMethod(); // Does not create an instance
    }
}

class Abz{

    public static Abz obj = new Abz(); // This always creates an object even before it is consumed since
                                       // is it created as soon as the Class loads (High Memory consumption of bulky object)

    private Abz(){
        System.out.println("Instance created");
    }

    public static Abz anyMethod(){
        return obj;
    }
}
