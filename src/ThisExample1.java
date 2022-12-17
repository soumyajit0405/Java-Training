
public class ThisExample1 {
	int rollno;
	String name;
	float fee;

	ThisExample1(int rollno,String name,float fee){  
	this.rollno=rollno;  
	this.name=name;  
	this.fee=fee;  
	}
	
	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}

	public static void main(String args[]) {
		ThisExample1 s1 = new ThisExample1(111, "ankit", 5000f);
		ThisExample1 s2 = new ThisExample1(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}

}
