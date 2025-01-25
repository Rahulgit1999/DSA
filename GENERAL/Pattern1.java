package hello;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz Enter rows");
		int i=sc.nextInt();
		System.out.println("Plz Enter *");
		int k=sc.nextInt();
		
		while(i>0) {
			int j=k;
			while(j>0) {
				System.out.print(" * ");
				j--;
			}
			System.out.println();
			i--;
		}
			

	}

}
