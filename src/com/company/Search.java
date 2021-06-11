package com.company;

public class Search {
	/* returns the index of the passed in value */
	public static int linearSearch(int [] mylist, int val)
	{
		int count = 0;
		int i;
		for(i = 0; i < mylist.length; i++)
		{
			count ++;
			if (mylist[i] == val)
				break;
		}
		System.out.println("linear search for " + val + " " + count + " guesses.");
		return i;
	}
	
	public static int binarySearch(int [] mylist, int val)
	{
		int count = 1, start = 0, end = mylist.length - 1;
		int mid = (end + start)/2;
		
		//System.out.println(mylist[mid]);
		while(mylist[mid] != val)
		{
			count ++;
			if (mylist[mid]> val)
				end = mid - 1;
			else if(mylist[mid] < val)
				start = mid + 1;
			
			mid = (end + start)/2;
			//System.out.println(mylist[mid]);
		}
		
		System.out.println("binary search for " + val + " " + count + " guesses.");
		return mid;
	}
	
	public static void squaredSearch(int [] mylist)
	{
		int count = 0;
		for (int i = 0; i < mylist.length; i++)
		{
			for (int j = i + 1; j < mylist.length; j++)
			{
				count ++;
				if(mylist[i] == mylist[j])
					System.out.println("pair of " + mylist[i] + " at " + i + " and " + j);
			}
		}
		System.out.println("squaredSearch " + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] mylist1 = {3, 5, 7, 8, 11, 18, 23, 33, 36, 41, 45, 51, 56, 60, 67, 67, 71, 88, 89, 92};
		int lin = linearSearch(mylist1, 8);
		System.out.println(lin);
		lin = linearSearch(mylist1, 67);
		System.out.println(lin);
		
		int bin = binarySearch(mylist1, 8);
		System.out.println(bin);
		bin = binarySearch(mylist1, 67);
		System.out.println(bin);
		
		int [] mylist2 = {3, 6, 1, 7, 3, 1, 8, 6, 9, 7, 11, 45, 8, 9, 11, 45, 12, 12, 0,7};
		squaredSearch(mylist2);

	}

}
