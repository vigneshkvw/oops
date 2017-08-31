/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

/**
 *
 * @author viki
 */
public class Static_Variable_Example2 {
int a=10;
int b=13;
static int c=4;
static int d=5;
void m1(){
    System.out.println(a);
     System.out.println(b);
 System.out.println(c);
  System.out.println(d);
}
static void m2(){
Static_Variable_Example2 w=new Static_Variable_Example2();

    System.out.println(w.a);
     System.out.println(w.b);
 System.out.println(c);
  System.out.println(d);

}
public static void main(String [] args){
    Static_Variable_Example2 t=new Static_Variable_Example2();
    t.m1();
    m2();

}
}
