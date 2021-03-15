package week3;

public class Testlibrary {

	public static void main(String[] args) {
		LibraryMember l1=new LibraryMember();
		LibraryMember l2=new LibraryMember("Kiran",1,2203.5);
		
		System.out.println("Default constructor values : ");
		System.out.println(l1.toString());
		System.out.println("Parameterized constructor values : ");
		System.out.println(l2.toString());
		
		System.out.println("Calling getName() function for both the objects : ");
		System.out.println("L1 object: " + l1.getName());
		System.out.println("L2 object: " +l2.getName());
		}

}
