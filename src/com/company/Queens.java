package com.company;

public class Queens {

	private int numQ;
	private boolean [][] queenArray;
	
	public Queens(int size) {
		// TODO Auto-generated constructor stub
		numQ = size;
		queenArray  = new boolean[size][size];
		//queenArray[0][1] = true;
		//queenArray[0][0] = true;
	}

	public boolean canPlaceQueen(int row, int col)
	{
		// check row
		for(int c = 0; c < numQ; c++)
		{
			if(c != col && queenArray[row][c])
				return false;
		}
		// check column
		for(int r = 0; r < numQ; r++)
		{
			if(r!= row && queenArray[r][col])
				return false;
		}
		// check diagonals
		/*int jump = Math.min(row,  col);
		for(int r = row-jump, c = col-jump; c < numQ && r < numQ; r++, c++)
		{
			if(r!=row && queenArray[r][c])
				return false;
		}
		jump = Math.max(row, col);
		for(int r = row+(numQ-jump-1), c = col-(numQ-jump-1); c < numQ && r >0; r--, c++)
		{
			if(r!=row && queenArray[r][c])
				return false;
		}*/
		int r = row-1, c = col-1;
		while(r>=0 && c>=0 ){
			if(queenArray[r][c])
				return false;
			c--;
			r--;
		}
		r = row-1; c = col+1;
		while(r>=0 &&  c < numQ){
			if(queenArray[r][c])
				return false;
			c++;
			r--;
		}
		r = row+1; c = col-1;
		while(r<numQ && c>=0 ){
			if(queenArray[r][c])
				return false;
			c--;
			r++;
		}
		r = row+1; c = col+1;
		while(r<numQ &&  c < numQ){
			if(queenArray[r][c])
				return false;
			c++;
			r++;
		}
		return true;
	}
	
	public void printSolution()
	{
		for(int i = 0; i < numQ; i++) {
			for(int j = 0; j < numQ; j++){
				//System.out.print(queenArray[i][j] + " ");
				if(queenArray[i][j]) System.out.print("[Q]");
				else System.out.print("[ ]");
			}
			System.out.println();
		}
	}
		
	public void start()
	{
		boolean b = placeQueen(0,0);
		if(b)
			printSolution();
		else
			System.out.println("There is no solution with " + numQ + " queens.");
	}
	
	public boolean placeQueen(int row, int col)
	{
		if(col == numQ)  return false;
		if(row == numQ) return true;
		
		
		if(canPlaceQueen(row, col)){
			queenArray[row][col] = true;
			boolean b = placeQueen(row+1, 0);
			if(!b) {
				clearRow(row);
				b = placeQueen(row, col+1);
			}
			return b;
		}
		else {
			queenArray[row][col] = false;
			return placeQueen(row, col+1);
		}
		
		/*else {
			return placeQueen(row, col+1);
		}*/
		
	}
	private void clearRow(int row)
	{
		for(int i= 0; i < numQ; i++)
			queenArray[row][i] = false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queens qa = new Queens(6);
		//System.out.println(qa.canPlaceQueen(0, 0));
		qa.start();
	}

}
