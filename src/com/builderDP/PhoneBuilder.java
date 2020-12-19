package com.builderDP;

public class PhoneBuilder {
    private String os;
    private String processor;
    private double screensize;
    private int battery;
    private int camera;

    public PhoneBuilder setOs(String os){
        this.os = os;
        return this;
    }

    public PhoneBuilder setProcessor(String processor){
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreensize(double screensize){
        this.screensize = screensize;
        return this;
    }

    public PhoneBuilder setBattery(int battery){
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setCamera(int camera){
        this.camera = camera;
        return this;
    }

    public Phone getPhone() {
        return new Phone(os, processor, screensize, camera, battery);
    }


}
