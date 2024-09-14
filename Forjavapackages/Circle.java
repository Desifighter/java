package com.codewithharry.shape;
public class Circle {
    int radius;

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float area(){
        return (22f/7)*radius*radius;
    } 
    public float perimeter(){
        return  (22f/7)*radius*2;
    }
}
