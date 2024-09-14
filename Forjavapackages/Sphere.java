package com.codewithharry.shape;
public class Sphere extends Circle{
    public float volume(){
        return (4f/3)*(22f/7)*radius*radius*radius;
    }
    public float surfaceArea(){
        return (22f/7)*4*radius*radius;
    }
}
