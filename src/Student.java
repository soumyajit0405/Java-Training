class Student{  
 //defining fields  
 int id;//field or data member or instance variable  
 String name;  
 
 void insertRecord(int rid, String n){  
	  id=rid;  
	  name=n;  
}  
 
 void displayInformation(){System.out.println(id+" "+name);}  
 
 Student(int i, String n) {
	 id=i;  
     name=n;  
 }
 
 Student() { 
 }
 //creating main method inside the Student class  
 public static void main(String args[]){  
  //Creating an object or instance  
  Student s1=new Student();//creating an object of Student  
  //Printing values of the object  
  //Reference variable
  s1.id=101;  
  s1.name="Sonoo";  
  s1.displayInformation();  
  
  Student s2=new Student();  
  s2.insertRecord(222,"Aryan");  
  
  s2.displayInformation();
  
  Student s3=new Student(1,"test");  
  s3.displayInformation();
 }  
}  