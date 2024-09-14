package com.codewithharry.shape;
public class Cylinder extends Circle{
    int height;


    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float volume(){
        return (22f/7)*radius*radius*height;
    }
    public float surfaceArea(){
        return (22f/7)*2*radius*(radius+height);
    }
}