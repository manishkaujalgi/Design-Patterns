package com.singletonDP;
// Adding the word SYNCHRONIZED will resolve this issue
public class Synchronized {

    public static void main(String[] args){

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Abcd obj1 = Abcd.anyMethod(); // Creates instance once here
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Abcd obj2 = Abcd.anyMethod(); // Does not create an instance
            }
        });

        t1.start();
        t2.start();
    }
}

class Abcd{

    public static Abcd obj;

    private Abcd(){
        System.out.println("Instance created");
    }

    public static synchronized Abcd anyMethod(){  //added SYNCHRONIZED keyword
        if(obj == null){
            obj = new Abcd();
        }
        return obj;
    }
}
