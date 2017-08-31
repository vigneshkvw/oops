/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

/**
 *
 * @author viki
 */
public class Method2 {
public static void main(String []args){
    Method2 A=new Method2();
    A.m1(10,'a',10,10.2,"viki");
}
void m1(int a,char ch,float f,double d,String str){
    System.out.println(a+ch+f+d+str);
}
}
