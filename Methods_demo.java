/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

/**
 *
 * @author viki
 */
public class Methods_demo {
int a=2;
int b=4;
static void add(){
    Methods_demo A=new Methods_demo();
    System.out.println(A.a+A.b);
}
void sub(){
    System.out.println(a-b);
}

void m1(int W ,char ch)
{
    System.out.println(W);
    System.out.println(ch);

}
static void m2(String str,float f){
System.out.println(str);
    System.out.println(f);

}
class emp{
}
class X{
}
static void m3(emp e,X x){
 System.out.println("hi");

}
public static  void main(String[] args){
    add();
    Methods_demo S=new Methods_demo();

    S.sub();
    S.m1(10, 'a');
    m2("viki",10);



}
}
