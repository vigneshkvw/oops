/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

/**
 *
 * @author viki
 */
public class Method4 {
public static void main(String[] args){
    Method4 W=new Method4();
W.m1();
int a=W.m2();
System.out.println(a);
float b=W.m4();
System.out.println(b);

}
void m1(){

    m2();
   System.out.println("hi");

    /*
    void m2(){
    * System.out.println("hi");
    */
}
float m4(){
   System.out.println("hi");

    return 10.4f;

}
int m2(){ //return type
    return 10;
}
}