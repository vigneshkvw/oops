package oops;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Bacic example
 *
 *
 * instances block with excetute 1st and then constr
 *
 * need of instances block???
 */
public class Instances {

    public Instances() {
System.out.println("hi : 0 args");
    }
    {
System.out.println("hi : instances");

    }
    public static void main(String[] args){
      new Instances();
    }
}
