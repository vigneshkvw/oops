/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

/**
 *
 *covariant return type
 */
class animal{

}
class dog extends animal{

}

class A{
    animal eat(){
        System.out.println("banana");
        return new animal();
    }
}
public class poly5 extends A{
dog eat(){
        System.out.println("piZzza");
    return new dog();
}
public static void main(String[] args){
    new poly5().eat();
}
}
