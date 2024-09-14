package com.codewithharry.shape;
public class Square extends Reactangle{
    int side;

    public int getSide() {
        return this.side;
    }

    public void setSide(int side) {
        this.side = side;
    }
     @Override
    public int area(){
        return side*side;
    }
    @Override
    public int perimeter(){
        return 4*side;
    }
    
}
