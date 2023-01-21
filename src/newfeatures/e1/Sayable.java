package newfeatures.e1;

interface I1{  
    default void say() {  
        saySomething();  
    }  
    // Private method inside interface  
    private void saySomething() {  
        System.out.println("Hello... I'm private method");  
    }  
} 