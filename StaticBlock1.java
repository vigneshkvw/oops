/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

/**
 * without main method static block is executed
 */
public class StaticBlock1 {
static {
    System.out.println("hi viki");
}
static {
    System.out.println("hi waran");
}
{
    int a =101;                                                //logics
System.out.println(a);

}

    public StaticBlock1(int a) {                           //help to declare variable
System.out.println(a);

    }

public static void main(String [] args){
    new StaticBlock1(10);
}
}
