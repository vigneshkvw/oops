package oops;
public class Methods_obj {
static  void m1(emp e){
    System.out.println("ji");
}
 static class emp{}
public static  void main(String [] args){
   emp e=new emp();
   Methods_obj.m1(e);
}
}