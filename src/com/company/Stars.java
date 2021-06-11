package com.company;

public class Stars {
    public static void printStars(int n)
    {
        if(n == 1) System.out.println("*");
        else {
            System.out.print("*");
            printStars(n-1);
        }
    }
    public static void triangle1(int n){
        if(n==1) printStars(1);
        else{
            printStars(n);
            triangle1(n-1);
        }

    }
    public static void triangle2(int n){
        if(n==1) printStars(1);  // print 1 star
        else{
            triangle2(n-1);  // do a smaller triangle
            printStars(n);
        }

    }

    public static void main(String [] args){
        triangle1(5);
        triangle2(5);
    }
}
