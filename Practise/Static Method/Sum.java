public class Sum {

	public static void main(String[] args) {
		
		Calculate e1=new Calculate();
		int x=e1.calculate(5);
		System.out.println(x);
		
		int y=Calculate.calculate(5,6);
		System.out.println(y);
	}
	
}
