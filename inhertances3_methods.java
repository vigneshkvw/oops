/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

import inheritances.*;

/**
 *
 * @author viki
 */
class A{
    void m1(){
        System.out.println("m1 method");
    }
}
public class inhertances3_methods extends A {

    void m1(){
        System.out.println("child m1 method");
    }

    void m2(){
   super.m1();
   this.m1();
    }
    public static void main(String [] args){
        inhertances3_methods Q=new inhertances3_methods();
        Q.m2();
    }
}
