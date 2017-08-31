/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

/**
 *
 * @author viki
 */
public  class MethodOverloading {
void  a1(int a){
    System.out.println(a);
}
void a1(int a ,int b){
System.out.println(a  );
System.out.println(b  );


}
public static void main(String[] args){
  MethodOverloading t=new MethodOverloading();
    t.a1(10);
t.a1(10, 15);
}
}
