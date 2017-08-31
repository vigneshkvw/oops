/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

import inheritances.*;

/**
 *this
 * super
 * in constru
 */


class A{
    int a=10;  //instances variable
    A(){
        int b=45;   //local variable
System.out.println("parent 0-args"+ (a+b));

    }
}


public class inhertances_constr extends A{

    public inhertances_constr() {

        this(4);

    System.out.println("0-args");

    }
inhertances_constr(int a){

    super();
    System.out.println("1-args");
}
    public static void main(String[] main){
    new inhertances_constr();
}
}
