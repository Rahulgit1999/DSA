package Recursion;

public class MazePath {
 static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
maze(1,1,3,"");

	}

	private static void maze(int i, int j, int k, String ans) {
		// TODO Auto-generated method stub
	
		if(i==k && j==k) {
			count++;
			System.out.println(ans+" "+count);
			return;
		}
		if(i>k || j>k) return;
		maze(i+1,j,k,ans+"V"+" "); 
		maze(i,j+1,k,ans+"H"+" "); 

		
	}

}
