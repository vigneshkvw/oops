/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

/**
 * not applicable const in interface
 *
 */

interface A{
    void m1();
void m2();

}


public class interface2 implements  A{
public void m1(){
    System.out.println("m1");
}
public void m2(){
    System.out.println("m2");
}

    public interface2() {
        int a=10;
        String b="viki";
        float c=10.5f;
    System.out.println(" cont"+a+b+c);

    }
public static void main(String[] args){
    new interface2().m1();  //const is compile becaz we are calling child class
 new interface2().m2();
 A a=new interface2();
 a.m1();    //const does not compile becaz we are calling interface
 a.m2();
}
}
