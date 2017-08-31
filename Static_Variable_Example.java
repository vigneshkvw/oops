/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

/**
 *
 * @author viki
 */
public class Static_Variable_Example {
  int a=2;
  int b=3;
    public static void main(String[] args){
    m1();
    m2();
  
   }

    static  void m1() {
Static_Variable_Example q=new Static_Variable_Example();
        System.out.println(q.a );
    }
static void m2(){
Static_Variable_Example q=new Static_Variable_Example();
        System.out.println(q.b );

}

}
