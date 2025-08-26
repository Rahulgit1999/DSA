package backtrack;

public class Recursion1 {
    public static void main(String[] args) {
        rec(10);
            }
        
            private static void rec(int i) {
           
                if(i==0){
                    return;
                }
                System.out.println(i);
                rec(i-1);
            }
}
