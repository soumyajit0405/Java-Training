package reflection.e1;

class Example{}  
  
class Example2{  
 public static void main(String args[]){  
  try{  
	  Example obj = new Example();
	  Class c=obj.getClass();  
   System.out.println(c.isInterface());  
    
  }catch(Exception e){System.out.println(e);}  
  
 }  
}  
