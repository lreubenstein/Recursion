package com.company;

//import java.lang.reflect.Array;
import java.util.Arrays;
public class Peg {
	private int pegNum;
	private int numDiscs;
	private int[] discs;
	private int count;
	
	public Peg(int p, int num)
	{
		pegNum = p;
		numDiscs = num;
		discs = new int[num];
		count = 0;
	}
	
	public int getPegNum()
	{
		return pegNum;
	}
//	public int getNumDiscs()
//	{
//		return numDiscs;
//	}
	
	public String toString()
	{
		String s = "Peg " + pegNum;
		return s;
	}
	/**
	 * discs are represented by integers
	 * the bigger the number, the bigger the disc
	 * @param whichOne
	 * @return
	 */
	public boolean addDisc(int whichOne) 
	{
		if(count == 0)
		{
			discs[0] = whichOne;
			count ++;
		}
		else if (whichOne < discs[count-1])
		{
			discs[count] = whichOne;
			//System.out.println(Arrays.toString(discs));
			count++;
		}
		else
		{
			System.out.println("Can't do that");
			return false;
		}
		return true;
	}
	public int popDisc()
	{
		if (count == 0) return 0;
		int d = discs[count-1];
		discs[count-1] = 0;
		count --;
		return d;
		
	}
	public boolean moveTopDisc(Peg newPeg)
	{
		int disc = popDisc();
		if (newPeg.addDisc(disc))
		{
			System.out.println("Moving disc " + disc + " from peg " + pegNum + " to peg " + newPeg.getPegNum());
			return true;
		}
		else{
			System.out.println("Bad Move");
			return false;
		}
	}
	
	public static void main(String [] arg) {
		Peg p1 = new Peg(1,5);
		p1.addDisc(3);
		System.out.println(Arrays.toString(p1.discs));
		p1.addDisc(2);
		System.out.println(Arrays.toString(p1.discs));
		p1.addDisc(4);
		System.out.println(Arrays.toString(p1.discs));
		p1.popDisc();
		System.out.println(Arrays.toString(p1.discs));
	}
	

}
