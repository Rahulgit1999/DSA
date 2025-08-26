package Recursion;

public class Nqueen {
static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
	boolean	board[][]=new boolean[n][n];
	queen(board, n, 0);
	System.out.println(count);

	}
	private static void queen(boolean board[][], int n, int row) {
		if(n==row) {
			count++;
			display(board);
			return;
		}
		for(int col=0;col<n;col++) {
			if(isValid(board,row,col)) {
				board[row][col]=true;
				queen(board, n, row+1);
				board[row][col]=false;
			}
		}
	}
	private static boolean isValid(boolean[][] board, int cr, int cc) {
		// TODO Auto-generated method stub
		//checking upword
		int row=cr,  col=cc;
		while(row>=0) {
			if(board[row][col])return false;
			row--;
		}
		row=cr; col=cc;
		//cheking upleft
		while(col>=0 && row>=0) {
			if(board[row][col]) return false;
			col--;
			row--;
		}
		col=cc; row=cr;
		while(col<board.length && row>=0) {
			if(board[row][col]) return false;
			col++;
			row--;
		}
		
		return true;
	}
	private static void display(boolean[][] board) {
		// TODO Auto-generated method stub
		for( boolean []bs:board) {
			for(boolean b:bs) {
				if(b) {
					System.out.print("Q");
				}
				else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}
