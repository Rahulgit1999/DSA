package Recursion;

public class PolindromePartitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pp("nitin","");
	}

	private static void pp(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=1;i<=ques.length();i++) {
			String s=ques.substring(0,i);
			if(isPal(s)) {
				pp(ques.substring(i),ans+s+'|'); 
			}
		}
	}

	private static boolean isPal(String s) {
		// TODO Auto-generated method stub
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}

}
