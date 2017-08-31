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
        System.out.println("m1");
    }
    
    void m2(){
        System.out.println("m2");
    }
}
class B extends A{
    
    void m3(){
        System.out.println("m3");
    }
    
    void m4(){
        System.out.println("m4");
    }
}
class C extends B{
    
    void m5(){
        System.out.println("m5");
    }
    
    void m6(){
        System.out.println("m6");
    }
}
public class inheritances1 {
public static void main(String[] main){
   C c= new C();
c.m5();
c.m6();
c.m1();
c.m2();
c.m3();c.m4();
}
}
