package oops;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
public class Instances2 {
public Instances2() {
System.out.println("hi : 0 args");
    }
    Instances2(int a){
System.out.println("hi : 1 args");

    }
    Instances2(int a,int b){
System.out.println("hi : 2 args");

    }
    {
System.out.println("hi : instances");

    }
    {
System.out.println("hi : instances no 2");

    }
    public static void main(String[] args){
      new Instances2();
      new Instances2(1);
      new Instances2(2,4);

    }
}
