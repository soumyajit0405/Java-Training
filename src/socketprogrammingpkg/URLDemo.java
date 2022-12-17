package socketprogrammingpkg;

import java.net.URL;

public class URLDemo {
	public static void main(String[] args) {
		try {
			//URL url = new URL("https://www.abc.com/java");
			//URL url = new URL("https://127.0.0.1:8080/java");
			URL url=new URL("https://www.google.com/search?q=java&oq=java&sourceid=chrome&ie=UTF-8");  
//			System.out.println("Protocol: " + url.getProtocol());
//			System.out.println("Host Name: " + url.getHost());
//			System.out.println("Port Number: " + url.getPort());
//			System.out.println("File Name: " + url.getFile());
			
			System.out.println("Protocol: "+url.getProtocol());    
			System.out.println("Host Name: "+url.getHost());    
			System.out.println("Port Number: "+url.getPort());    
			System.out.println("Default Port Number: "+url.getDefaultPort());    
			System.out.println("Query String: "+url.getQuery());    
			System.out.println("Path: "+url.getPath());    
			System.out.println("File: "+url.getFile());    
			  

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
