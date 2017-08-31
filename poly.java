/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

/**
 *one person differnt behaviour
 *
 * types
 * 1: run-time by method overwritting
 * 2; compile time by method overloading
 *
 * method overloading
 *
 */
public class poly {
void m1(){
    System.out.println("0-args");
}
void m1(int a){
System.out.println(a);

}

void m1(char a){
System.out.println(a);

}

void m1(int a,int b){
System.out.println(a +b);

}
public static void main(String args[]){
   // new poly().m1();   //new poly().m1().m1(10);  //y not possible
    poly A=new poly();
    A.m1();
    A.m1('a');
    A.m1(10);
    A.m1(3, 4);
}
}
