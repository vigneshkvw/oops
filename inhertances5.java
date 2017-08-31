/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

import inheritances.*;

/**
 *
 * intances and static block in inheritances
 */

class A{
    {
   System.out.println("parent instances");

    }
    A(){
    System.out.println("parent 0-args");

    }
}
 class inhertances5 extends A{
    {
        System.out.println("child instances");
    }

    public inhertances5() {
        System.out.println("child 0-args");

    }

    public inhertances5(int a) {
        System.out.println("child 1-args");

    }


static {
        System.out.println("child static");
    
}
    public static void main(String[] args){
        new inhertances5();
        new inhertances5(10);

     }
}
