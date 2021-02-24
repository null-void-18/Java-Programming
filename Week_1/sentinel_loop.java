package week1;
import java.util.*;
public class Sentinelloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
		int count=0;
		while(sc.nextInt() != -1) {
			count++;
		}
		System.out.print(count);
		}
		finally {
			sc.close();
		}
	}

}
