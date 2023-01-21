package newfeatures.e1;


public class WithLambdaExample{ 
	public static void main(String[] args) {  
		sayable s= (message) -> {  
          System.out.println("Saying "+message); 
     };
     s.say("hello");
}  
}