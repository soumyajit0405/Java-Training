package collectionpkg.al;

class Student {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	public void printData() {
		System.out.println("Roll No: "+this.rollno +" Name: " +this.name+" Age: "+this.age);
	}
}