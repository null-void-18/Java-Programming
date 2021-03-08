public class Sum {

	public static void main(String[] args) {
		
		Calculate e1=new Calculate();
		int x=e1.calculate(5); // call to a non-static method
		System.out.println(x);
		
		int y=Calculate.calculate(5,6); // call to a static method
		System.out.println(y);
	}
	
}
