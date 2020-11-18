package com.singletonDP;

public class DoubleCheckedLocking {

    public static void main(String[] args){

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Abd obj1 = Abd.anyMethod(); // Creates instance once here
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Abd obj2 = Abd.anyMethod(); // Does not create an instance
            }
        });

        t1.start();
        t2.start();
    }
}

class Abd{

    public static Abd obj;

    private Abd(){
        System.out.println("Instance created");
    }

    public static Abd anyMethod(){
        if(obj == null){
            synchronized (Abd.class) {   // added SYNCHRONIZED inside the if condition for double checking
                if(obj == null)
                obj = new Abd();         // This reduces the time lost for every check compared to the Synchronized method
            }
        }
        return obj;
    }
}
