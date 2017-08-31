/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

/**
 *
 * interface
 */
interface A{
    void m1();
    void m2();
}
public class interface1 implements A {

    public void m1() {
     System.out.println("m1");
    }

    public void m2() {
     System.out.println("m2");    }

    public static void main(String[] args){
   interface1 a=     new interface1();           //new interface1.m1();
        a.m1();
        a.m2();

    }
}
