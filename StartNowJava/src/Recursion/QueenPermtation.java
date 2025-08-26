package Recursion;

public class QueenPermtation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=4;
int nq=2;
boolean b[]=new boolean[n];
nqueen(b,0,nq,"",0);
	}

	private static void nqueen(boolean[] b, int qi, int nq, String ans,int idx) {
		// TODO Auto-generated method stub
		if(qi==nq)
		{
			for(int i=0;i<b.length;i++) {
				if(b[i]==true)
					System.out.print("q");
			
			else {
				System.out.print("-");
			}
				
			}
			System.out.println();
			return;
		}
		for(int i=idx; i<b.length;i++) {
			if(b[i]==false) {
				b[i]=true;
				nqueen(b, qi+1,nq,ans,idx+1);
				b[i]=false;
				
			}
		}
	}

}
