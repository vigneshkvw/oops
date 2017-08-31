/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

/**
 *
 *const over loading
 */
public class poly2 {

    public poly2() {
    System.out.println("0-args const");

    }
    poly2(int a){
        System.out.println("1-args constr");

    }
    poly2(int a,int b){
        System.out.println("2-args constr");

    }
    public static void main(String[] args){
        new poly2(1);
        new poly2();
        new poly2(2, 3);
    }


}
