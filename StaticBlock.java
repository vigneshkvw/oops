/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

/**
 *Static block execute 1st becoz when the dot class file loader static block executed
 * @author viki
 */
public class StaticBlock {
    {
        System.out.println("hi instances --->1");
    }
    {
        System.out.println("hi instances --->2");
    }
    static {
        System.out.println("hi static--->1");
    }
    static {
        System.out.println("hi static--->2");
    }
    public StaticBlock() {
        System.out.println("0 -----> args");
    }
    public StaticBlock(int a) {
        System.out.println(a);

    }
    public static void main(String[] args){
        new StaticBlock();
        new StaticBlock(10);
    new StaticBlock(45);
    }
}
