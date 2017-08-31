/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

/**
 *
 * @author viki
 */
public class Method1 {
public static void main(String [] args){
    Method1 A=new Method1();
    A.m1();
   Method1.m2();
}
void m1(){
    System.out.println("hi");
}
static void m2(){
 System.out.println("hi viki");
}
}
