package com.builderDP;

public class Shop {

    public static void main(String[] args){
        PhoneBuilder builder = new PhoneBuilder();
        Phone p = builder.setBattery(4500).setOs("Android").getPhone();
        System.out.println(p);
    }
}
