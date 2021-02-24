package week1;
import java.util.*;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		
		Scanner sc=new Scanner(System.in);
		
		a=sc.nextInt();
		
		if(a%2==0) System.out.print("The given number is Even!");
		else System.out.print("The given number is Odd!");
		
		sc.close();
	}

}
