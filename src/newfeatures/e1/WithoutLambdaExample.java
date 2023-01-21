package newfeatures.e1;


public class WithoutLambdaExample{ 
	public static void main(String[] args) {  
	 sayable s=new sayable(){  
          public void say(String message){System.out.println("Saying "+message);}  
     };
     s.say("hello");
}  
}