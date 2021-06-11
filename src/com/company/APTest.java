package com.company;
// LR  PRACTICE
public class APTest {
    private int foo;
    private int bar;

    public APTest(int x){
        foo=x;
        bar =0;
    }
    public int getfoo(){
        return foo;
    }
    public void setbar(int y){
        bar = y;
    }
    public static void teststuff(){

       int n =56;
       int th = (int)Math.floor(.1 * n);
       System.out.println(th);
        n = Integer.parseInt("hello");
        System.out.println(n);
        double x = 2;
        int y = 3;
        String s = "hello";
        //String c = s.charAt(0);
        char [] a = s.toCharArray();
        String.valueOf(a[0]).equals("a");
        boolean t = true;
        //if(t.equals(true))
    }

    public static void main(String[] args){
        teststuff();
    }

}
