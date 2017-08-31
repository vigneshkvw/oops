package oops;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 real time example
 */
public class Const5 {
    int a;
    String name;
    float f;
    void m1(){
        System.out.println(a);
       System.out.println(name);
       System.out.println(f);
    }

    public Const5(int a,String name,float f) {
   this.a=a;
   this.f=f;
   this.name=name;  ///conversion
    }

public static void main(String[] args){
    Const5 g =new Const5(1,"viki",500.5f);
    g.m1();
}
}
