package com.company;

public class Algorithms {
	public static int sumSquares(int n)	
	{
		int sum = 0;
		
		for(int k = 1; k <=n; k++)		// iteration
		{
			int sq = k*k;
			sum += sq;
		}
		return sum;
	}
	public static int sumSquaresRecursive(int n)
	{
		if(n == 0 || n == 1) return n;			// base case
		int ns = n*n;
		int ss = sumSquaresRecursive(n-1);		// recursion
		int x = ns+ss;
		System.out.println(x);
		//return x;
		return n*n + sumSquaresRecursive(n-1);
	}
	
	public static long factorial(int x) {
		long fact = 1;
		for(int i = 1; i <= x; i++) {
			fact *= i;
		}
		return fact;
	}
	
	public static long factorialRecursive(int x) {
		System.out.println("fact" + x);
		if(x == 1) return 1;
		return x * factorialRecursive(x-1);
	}

	public static double series1(int n){
		double result = 1;
		for(int i = 2; i <=n; i++){
			result += 1.0/(i*i);
		}
		return result;
	}

	public static double series2(int n){
		if(n==1) return 1;
		return 1.0/(n*n)+series2(n-1);
	}

	public static void main(String[] args) {
//		for(int i = 1; i < 10; i++){
//			System.out.println(series1(i));
//			System.out.println(series2(i));
//		}

		// TODO Auto-generated method stub
		//System.out.println("sum squares 5 " + sumSquares(5));
		//System.out.println("sum squares 5 " + sumSquaresRecursive(5));
		
		//System.out.println("factorial 5 " + factorial(5));
		//System.out.println("factorial 5 " + factorialRecursive(5));
		//System.out.println(exFiveIterative(15));
		//System.out.println(exFiveRecursive(15));
		
		//printStars(5);
		//printStars(7);
		triangle1(5);
		triangle2(5);
		
	}
	
	public static double exFiveIterative(int n)
	{
		double term = 1.0;
		for(int x = 1; x < n; x++)
		{
			term = 1.0 + 1.0/term;
		}
		return term;
	}
	
	public static double exFiveRecursive(int n)
	{
		double sum = 1.0;
		
		if(n==1) return 1.0;
		double y = exFiveRecursive(n-1);
		sum += 1.0/y;
		
		return sum;
	}

	public static void printStars(int n)
	{
		if(n == 1) System.out.println("*");
		else {
			System.out.print("*");
			printStars(n-1);
		}
	}
	
	public static void triangle1(int n)
	{
		if(n==0){
			//printStars(n);
			return;
		}
		else {
			triangle1(n-1);
			printStars(n);
		}
		//System.out.println();
	}	
	public static void triangle2(int n)
	{
		if(n==0){
			//printStars(n);
			return;
		}
		else {
			printStars(n);
			triangle2(n-1);
		}
	}
	public static void triangle(int cur, int max)
	{
		
		if(cur==max){
			printStars (cur);
			return;
		}
		
		triangle(cur+1, max);
		printStars(cur);
	}



}
