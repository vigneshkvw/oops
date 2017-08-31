/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

import inheritances.*;

/**
 *this or super actomatically crated by complier
 */



class A{
    A(){
       System.out.println("0-args");
    }

}
public class inherithance4 extends A{

    public inherithance4() {
//super class also create here hence it is parent class obj class default contr will excute
       System.out.println("child :0-args");

    }
    public inherithance4(int a) {

       System.out.println("child :1-args");

    }
public static void main(String[] args){
    new inherithance4();
    new inherithance4(10);
}
}
