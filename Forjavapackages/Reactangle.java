package com.codewithharry.shape;
public class Reactangle {

       int length,breadth;    

    public int getBreadth() {
        return this.breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int area(){
        return this.breadth * this.length;
    }

    public int perimeter(){
        return 2*(this.length + this.breadth);
    }
}
