package week2;
import java.util.Scanner;
public class BookTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Book[] b=new Book[3];
		
		b[0]=new Book(1,10,"William","HP",2000);
		b[1]=new Book(2,20,"JK","Chess",2000);
		b[2]=new Book(3,5,"ST","Alice",2000);
		int choice;
		System.out.println("Enter your choice -1 to exit or any to continue");
		choice=sc.nextInt();
		sc.nextLine();
		while(choice!=-1) {
			System.out.println("Enter the name of the author: ");
			String s;
			s=sc.nextLine();
			int flag=0;
			
			for(int i=0;i<3;i++) {
				String t;
				
				if(s.equals(b[i].getauthor())) {
					t=b[i].gettitle();
					System.out.println(t);
					flag=1;
					break;
				}
			}
			
			if(flag==0) System.out.println("No author exists!");
			System.out.println("Enter your choice -1 to exit or any to continue");
			choice=sc.nextInt();
			sc.nextLine();
		}
		
		sc.close();
	}

}



