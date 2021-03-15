package week3;

public class LibraryMember {
	private String name=new String();
	private int m_no;
	private double m_fee;
	private int no_of_books;
	
	LibraryMember(){
		name=null;
		m_no=0;
		m_fee=0.0;
		no_of_books=0;
	}
	
	LibraryMember(String name,int m_no,double m_fee){
		this.name=name;
		this.m_fee=m_fee;
		this.m_no=m_no;
		no_of_books=0;
	}
	
	String getName() {
		return name;
	}
	
	public String toString() {
		return "Name : "+name+"\nMembership Number : "+m_no+
				"\nMembership fee : "+m_fee+
				"\nNumber of books borrowed : "+no_of_books;
	}
	
}
