package exceptionpkg;

import java.io.File;
import java.io.IOException;

public class WithExceptionHandle {
	public static void main(String[] args) {  
        try  
        {  
        int data=50/0; //may throw exception   
        }  
            //handling the exception  
        catch(ArithmeticException e)  
        {  
            System.out.println("Exception handled");  
        }  
        System.out.println("rest of the code");  
        
    }  
}
