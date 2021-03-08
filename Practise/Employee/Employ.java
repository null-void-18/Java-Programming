public class Employ{
	private String name;
	private String designation;
	private double salary;
	private int id;
	
	Employ(){
		name="Kiran";
		designation="SDE";
		salary=10;
		id=7;
	}

	Employ(String n,String d,double s,int i){
		name=n;
		designation=d;
		salary=s;
		id=i;
	}
	
	void setname(String n) {
		name=n;
	}
	
	void setdesig(String d) {
		designation=d;
	}
	void setsal(double s) {
		salary=s;
	}
	void setname(int i) {
		id=i;
	}
	
	String getname() {
		return name;
	}
	
	int getid() {
		return id;
	}
	
	double getsalary() {
		return salary;
	}
	
	String getdesig() {
		return designation;
	}
	
}
