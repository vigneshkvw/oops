
package oops;

/**
 *const in abstraction
 * instances block in abstraction
 *static block in abstraction
 *
 *
 */


abstract class parent{
    abstract void m1();
    abstract void m2();
    abstract void m3();

    {
    System.out.println("parent instance block");
        
    }
    static {
    System.out.println("parent static block");
        
    }
    public parent() {
    System.out.println("parent const");
    }

}
public class Abstract6 extends parent{

    @Override
    void m1() {
     System.out.println("m1");
    }

    @Override
    void m2() {
     System.out.println("m2");
    }

    @Override
    void m3() {
     System.out.println("m3");
    }

    {
    System.out.println("child -instance block");

    }
    static {
    System.out.println("child static block");

    }
    public Abstract6() {
super();
   System.out.println("const child");

    }
public static void main(String[] args){
    new Abstract6().m1();
    new Abstract6().m2();
    new Abstract6().m3();

}
}