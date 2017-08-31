/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

/**
 *
 * over wriiten
 **/
class A{
    void marry(){
        System.out.println("marry sujee");   //over ridden
    }
}
public class poly4 extends A {

    void marry(){
        System.out.println("marry cat");  //over riding
    }
    public static void main(String[] args){
        new poly4().marry();
    }
}
