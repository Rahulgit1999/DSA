package hello;
import java.util.Scanner;

public class GradeCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=1;
		while(a!=0) {
		System.out.println("Please Enter the Marks");
		a=sc.nextInt();
		if(a>=90 && a<=100)
			System.out.println("Grade => A");
		if(a>=80 && a<90)
			System.out.println("Grade => B");
		if(a>=70 && a<80)
			System.out.println("Grade => C");
		if(a>=60 && a<70)
			System.out.println("Grade => D");
		if (a<60)
		System.out.println("FaiL");
		if(a>100)
		System.out.println("Not Valid Marks");
		}
		System.out.println("You Enter \"0\" for Exit");

	}

}
