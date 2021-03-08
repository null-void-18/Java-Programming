public class Employee {

	public static void main(String[] args) {
		
		Employ e1=new Employ("Gordon Ramsay","Chef",10.0,3);
		
		System.out.println(e1.getname());
		System.out.println(e1.getid());
		System.out.println(e1.getdesig());
		System.out.println(e1.getsalary());
		
		e1.setname("Jamie Oliver");
		e1.setdesig("Britain's Best Chef!");
		
		System.out.println(e1.getname());
		System.out.println(e1.getid());
		System.out.println(e1.getdesig());
		System.out.println(e1.getsalary());
		
	}
}
