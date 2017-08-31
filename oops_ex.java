/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

/**
 *
 * variables
 * methods
 * constr
 * instances
 * static
 */
public class oops_ex {
int a; ///instances variable
static int c;
void m1(){    // instances method
    int b = 45;    // local variable
    System.out.println(b);
}
static void m2(){
   System.out.println(c);


}
{
    System.out.println("hai");
}
static {
System.out.println("hello");

}

    public oops_ex(int d) {//o - args const
a=154;
        System.out.println(d);
    }

    public oops_ex() {
        System.out.println("0-args constr");

    }


    public static void main(String [] args){
        new oops_ex(10).m1();  //object creation using nameless const
        oops_ex.m2();
        oops_ex O=new oops_ex();
O.m2();
    }

}
