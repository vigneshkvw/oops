package oops;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *intances block is common for all const
 * intances block logic is common for all const
 */
public class instances1 {

    public instances1() {
System.out.println("hi : 0 args");
    }
    instances1(int a){
System.out.println("hi : 1 args");

    }
    instances1(int a,int b){
System.out.println("hi : 2 args");

    }
    {
System.out.println("hi : instances");

    }
    public static void main(String[] args){
      new instances1();
      new instances1(1);
      new instances1(2,4);

    }
}
