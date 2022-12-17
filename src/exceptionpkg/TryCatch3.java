package exceptionpkg;

public class TryCatch3 {
	public static void main(String[] args) {  
        
        try  
        {  
        int data1=50/0; 
  
        }  
            
        catch(Exception e)  
        {  
           try {
        int data2=50/0;
           } catch(Exception ae) {
        	   System.out.println("Exception handled");  
           }
  
        }  
    System.out.println("rest of the code");  
    }  
}
