package week2;
public class Book {
	private  int bid;
	private  int no_of_copies;
	private  String author;
	private  String btitle;
	private  double price;
	Date date_of_purchase;
	Book(){
		bid=0;
		no_of_copies=0;
		author=null;
		btitle=null;
		price=0.0;
		date_of_purchase=new Date();
	}
	
	Book(int b,int n,String a){
		bid=b;
		no_of_copies=n;
		author=a;
	}
	
	
	Book(int b,int n,String a,String t,double d){
		bid=b;
		no_of_copies=n;
		author=a;
		btitle=t;
		price=d;
	}
	
	void setbid(int b) {
		bid=b;
	}
	
	void setcopies(int n) {
		no_of_copies=n;
	}
	
	void setauthor(String a) {
		author=a;
	}
	
	void settitle(String t) {
		btitle=t;
	}
	void setday(int day) {
		date_of_purchase.setDate(day);
	}
	void setmonth(int month) {
		date_of_purchase.setMonth(month);
	}
	void setyear(int year) {
		date_of_purchase.setYear(year);;
	}
	void setprice(int p) {
		price=p;
	}
	
	int getbid() {
		return bid;
	}
	
	double getprice() {
		return price;
	}
	
	int getcopies() {
		return no_of_copies;
	}
	
	void getdate() {
		System.out.println(date_of_purchase.toString());
	}
	
	String getauthor() {
		return author;
	}
	
	String gettitle() {
		return btitle;
	}
	
	public String toString() {
		return String.format(bid+author+btitle+no_of_copies);
	}
	
	public static void display(Book book) {
		System.out.println(book.bid);
		System.out.println(book.no_of_copies);
		System.out.println(book.author);
		System.out.println(book.btitle);
		System.out.println(book.price);
	}
	

}
