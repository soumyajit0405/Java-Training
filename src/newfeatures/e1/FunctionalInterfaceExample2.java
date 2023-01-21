package newfeatures.e1;



interface sayable1{  
    void say(String msg);   // abstract method  
}  
@FunctionalInterface  
interface Doable1 extends sayable1{  
      
    void doIt();  
}   
public class FunctionalInterfaceExample2 implements sayable1{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();  
        fie.say("Hello Java");  
    }  
}  