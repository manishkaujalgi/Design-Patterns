package com.builderDP;

public class Phone {
    private String os;
    private String processor;
    private double screensize;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getScreensize() {
        return screensize;
    }

    public void setScreensize(double screensize) {
        this.screensize = screensize;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    private int battery;

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", screensize=" + screensize +
                ", battery=" + battery +
                ", camera=" + camera +
                '}';
    }

    private int camera;

    public Phone(String os, String processor, double screensize, int battery, int camera){
        super();
        this.os = os;
        this.processor = processor;
        this.screensize = screensize;
        this.battery = battery;
    this.camera = camera;
    }
}
