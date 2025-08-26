package Recursion;

public class Pattern {

    public static void main(String[] args) {
        pat(3,0,0,"");
            }
        
            private static void pat(int n, int i, int j, String ans) {
               if(i==n && j==n){ System.out.println(ans);
               return;}
               if(i>n ||j>n) return;
               else{
                pat(n,i+1,j,ans+"(");
                if(i>j) pat(n, i, j+1,ans+")");
               }
            }
}
