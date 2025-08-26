package Recursion;

public class KeyPad {
	static String	keys[]= {"","abc","def"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		kp("23"," ");
	}
	private static void kp(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		char ch=ques.charAt(0);
		String s1=keys[ch-'0'-1];
		for(int i=0;i<s1.length();i++) {
			kp(ques.substring(1), ans+s1.charAt(i));
		}
	}

}
