/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

/**
 *
 *inheritance is possible
 */
interface A{
    void m1();
    
    
}
interface W extends A{
    void m2();
}
abstract class B implements W{
    public void m1(){
        System.out.println("m1");
    }
}
abstract class C extends B{
    public void m2(){
        System.out.println("m2");
    }
}
 class interface3 extends C{
public static void main(String[] args){
    interface3 a=new interface3();
    a.m1();
    a.m2();
}
}
