/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

/**
 * intances block object creation depents on object creation bot const creation
 * 'n' number of const may create by call one another by another using this keyword
 * but instances block implement one time
 * @author viki
 */
public class Instances3 {
 Instances3() {
    this(10);
System.out.println("hi : 0 args");
    }
Instances3(int a){
System.out.println(a);

}
    {
System.out.println("hi : instances");

    }
    public static void main(String[] args){
      new Instances3();
    }
}
