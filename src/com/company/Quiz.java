package com.company;

public class Quiz {
	public static int fibonocci(int n)
	{
		if(n == 0) return 0;
		if(n == 1 || n == 2) return 1;	
		
		int f =  fibonocci(n-1) + fibonocci(n-2);
		
		return f;
	}
	
	public static int reubenstein(int n)
	{
		if(n == 0) return 3;
		if(n == 1) return 5;
		
		int r = 2 * reubenstein(n-2) + reubenstein(n-1);
		return r;
	}
	public static boolean isSuch(int n){
		boolean debug;
		
		debug = n > 2 && !isSuch(n-2);
		System.out.println(debug + " " + n);
		return debug;
	}
	
	public static int sumEvenDigits(int n)
	{
		int sum = 0;
		if(n%2==0) sum +=n%10;
		if(n<10) return sum;
		
		return sum + sumEvenDigits(n/10);
		
	}
	
	public static int euclid(int a, int b)
	{
		int g = 1;
		if(a == b)
			return a;
		if(a > b)
			g = euclid(a-b, b);
		else
			g = euclid(a, b-a);
		return g;
	}

	public static void reverseString(String s)
	{
		if(s.length() == 0) return;
		reverseString(s.substring(1));
		System.out.print(s.charAt(0));
	}
	public static String repeat1(String s, int n)
	{
	    //if(n<0) throw�new�IllegalArgumentException("must�be�positive");
	    if(n == 0) return "";
	    if(n == 1) return s;
	    
	    int x = n/2;
	    int y = n-x;
	    //System.out.print("Plus1");
	    return repeat1(s, x) + repeat1(s, y);
	    
	}
	public static String repeat2(String s, int n)
	{
	    //if(n<0) throw�new�IllegalArgumentException("must�be�positive");
	    if(n == 0) return "";
	    //if(n == 1) return s;
	    
	    //System.out.print("Plus2");
	    return s + repeat2(s, n-1);
	    
	}
	
	public int multiplyEvens(int n)
	{
		//if(n<0)�throw�new�IllegalArgumentException("must�be�positive");
		if(n == 1) return 2;

		return (2*n * multiplyEvens(n-1));
	}
	public static boolean isReverse(String s1, String s2)
	{
		int len1 = s1.length();
		int len2 = s2.length();
		if(len1 != len2)return false;
		if(len1== 0 && len2 == 0) return true;
		if(len1 == 1 && s1.equalsIgnoreCase(s2)) return true;
		if(s1.substring(0,1).equalsIgnoreCase(s2.substring(len2-1, len2)))
			return isReverse(s1.substring(1), s2.substring(0, len2-1));
		return false;
	}
	
	public static void squareUp(int n){
//	    if(n==1) System.out.print(1 + " ");
//	    else if (n==0) System.out.print("");
//	    else if(n%2==0){
//			System.out.print(n*n + " ");
//	        squareUp(n-2);
//	        System.out.print((n-1)*(n-1) + " ");
//	    }
//	    else{
//	        System.out.print((n-1)*(n-1) + " ");
//	        squareUp(n-2);
//			System.out.print(n*n+ " ");
//	    }
		if(n%2==0){
			squareUp(n-1);
		}
		if(n<=-1){
			n+=3;
			System.out.print(Math.pow(n,2));
			squareUp(n+2);
		}
		System.out.print(Math.pow(n,2));
		//squareUp(n-2);
	}

	public static int quizMystery1(int x, int y) {
	    if (x < 0) {
	        return -quizMystery1(-x, y);
	    } else if (y < 0) {
	        return -quizMystery1(x, -y);
	    } else if (x == 0 && y == 0) {
	        return 0;
	    } else {
	        return 100 * quizMystery1(x / 10, y / 10) + 10 * (x % 10) + y % 10;
	    }
	}

	
	public static void quizMystery2(int x) {
		if(x<10) {
			System.out.print(x);
		}
		else {
			int y=x%10;
			System.out.print(y);
			quizMystery2(x/10);
			System.out.print(y);
		}
	}
	
	public static void quizMystery3(int n) {
		if(n <=1) {
			System.out.print("* ");
		}
		else {
			System.out.print(n%2 + " ");
			quizMystery3(n/2);
			System.out.print(n + " ");
		}
	}
	public static String endX(String str) {
		if(str.length()== 0) return "";
		String c= str.substring(0,1);
		if(c.equals("x")){
			return endX(str.substring(1)) + c;
		}
		else{
			//return c + endX(str.substring(1));
			return str;
		}

	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i = 1; i <= 10; i++)
			System.out.print(fibonocci(i) + " ");
		System.out.println();*/
//		for(int i = 0; i <= 10; i++)
//			System.out.print(reubenstein(i) + " ");
//		System.out.println();
		
		/*System.out.println(sumEvenDigits(14377661));*/
		
		//System.out.println(euclid(55, 66));
		
		//System.out.println(isSuch(99) + " " + isSuch(100));
		//System.out.println(isSuch(100));
		
		//reverseString("abcdefg");
		/*System.out.println(repeat1("hello", 20));
		System.out.println();*/
		//System.out.println(repeat2("hello", 5));
		/*System.out.println();*/
//		System.out.println(isReverse("b","a"));
//
//		System.out.println(quizMystery1(7,3));
//		System.out.println(quizMystery1(-23,5));
		
//		quizMystery2(136);
//		System.out.println();
//		quizMystery2(85);
//		System.out.println();
//		quizMystery2(902301);
//		System.out.println();
//		
		squareUp(8);
		System.out.println();
		
//		quizMystery3(8);
//		System.out.println();
//		quizMystery3(25);
//		System.out.println();

//		System.out.println("endX of axbcxd  "+ endX("axbcxd"));
//		System.out.println("endX of abcd  "+ endX("abcd"));
//		System.out.println("endX of xxaxbcxd  "+ endX("xxaxbcxd"));
//		System.out.println("hello".substring(0,"hello".length()-1));
	}

}
