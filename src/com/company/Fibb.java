package com.company;

public class Fibb {
    public static int calcfib(int x){
        if(x==0 || x==1) return(1);
        return calcfib(x-1)+calcfib(x-2);
    }

    public static void printfib(int x){
        if(x==0) System.out.print(1);
        else {
            printfib((x - 1));
            System.out.print(", " + calcfib(x));
        }
    }
    public static void main(String [] args){
        printfib(20);
    }
}
