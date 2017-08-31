/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

/**
 *
 *operator loading
 */
public class poly3 {

    public poly3(int a ,int b) {
System.out.println(a+b);
    }
public poly3(char a ,char b) {
System.out.println(a+b);
    }
public static void main(String[] args){
    new poly3(2,1);
new poly3('q','r');         //ascii value
System.out.println("viki"+"waran");
System.out.println("viki"+"waran"+10);
System.out.println(10+"viki"+107+"waran");
System.out.println(10+86+"viki"+45+"waran");  /// 10+85 =string +viki=string+45int+waran string
}
}
