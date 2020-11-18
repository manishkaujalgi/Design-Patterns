package com.singletonDP;

public class Enum {

    public static void main(String[] args){

        Abcde obj1 = Abcde.INSTANCE;
        obj1.i = 5;
        obj1.show();

        Abcde obj2 = Abcde.INSTANCE;
        obj2.i = 7;

        Abcde obj3 = Abcde.INSTANCE;
        obj3.i = 10;

        obj1.show();         // only the final value was printed because there was a single object
                             // being created and it was replaced twice by 7 and 10
    }
}

enum Abcde{             // enum is a special type of Class

    INSTANCE;         // This by default creates the private constructor
    int i;

    public void show(){
        System.out.println(i);
    }
}
