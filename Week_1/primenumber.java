package week1;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
		int a;
		a=sc.nextInt();
		
		for(int i=2;i<a;++i) {
			if(a%i==0) {
				System.out.print("The input number is not a prime number!");
				return;
			}
		}
		
		System.out.print("The input number is a prime number!");
		}
		finally {
			sc.close();
		}
	}

}
