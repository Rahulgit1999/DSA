package Recursion;

public class PermutationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		per("abc","");
	}

	private static void per(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length()==0)
			{
			System.out.println(ans+"\t");
			return;
			}
		for(int i=0;i<ques.length();i++) {
			char ch=ques.charAt(i);
			String s1=ques.substring(0,i); 
			String s2=ques.substring(i+1);
			per(s1+s2, ans+ch);
					
		}
	}

}
