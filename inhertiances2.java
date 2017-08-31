/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

import inheritances.*;

/**
 *
 * this
 * super
 * keyword
 *
 * varaibles
 */

class A{
    int a=10;
    int b=20;
}

 class inhertiances2 extends A{
int a=50;
int b=60;
void add(int a,int b){
    System.out.println(a+b);  //local variable
    System.out.println(this.a+this.b);  //current variable
    System.out.println(super.a+super.b);  //suoer variable

}
public static void main(String[] args){
    inhertiances2 v=new inhertiances2();
v.add(70, 80);
}
}
