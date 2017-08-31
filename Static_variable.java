/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

/**
 *
 * @author viki
 */
public class Static_variable {
static int a=10;
static  int b=5;
public static void main(String [] args){
    System.out.println(Static_variable.b);
    Static_variable t=new Static_variable();
    t.m1();
}
void m1(){
    System.out.println(a); //// how instance method using static variable
}
}
