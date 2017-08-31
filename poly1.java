/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

/**
 * real time example for method over loading
 *
 */


public class poly1 {
void mob(String  w)
{
    System.out.println("your aadhar card");
}
void name(char a){
System.out.println("your aadhar card");

}
public static void main(String[] args){
    new poly1().mob("955111841");
    new poly1().name('a');
}
}
