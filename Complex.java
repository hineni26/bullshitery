import java.util.*;
class Complex{
    int x,y;
    Complex(int xx,int yy){
        x=xx;
        y=yy;
    }
    Complex add(Complex o){
        int addx=x+o.x;
        int addy=y+o.y;
        return new Complex(addx,addy);
    }
    void display(){
        System.out.println(x+"+ i"+y);
    }
    public static void main(String args[]){
        Sum ob=new Sum();
        ob.get();
        Complex ob1=new Complex(Sum.a1,Sum.a2);
        Complex ob2=new Complex(Sum.b1,Sum.b2);
        ob2.add(ob1).display();
    }
}
