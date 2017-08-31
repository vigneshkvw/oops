/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

/*
  Methods return object
        */
class emp{

}
public class Methods5 {

    emp m1(){
        emp e =new emp();

        return e;
}
    public static void main(String[] args){
Methods5 Q=new Methods5();
emp e=Q.m1();
System.out.print(e);
}
}
