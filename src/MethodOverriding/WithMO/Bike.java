package MethodOverriding.WithMO;

class Bike extends Vehicle {

	String run() {
		return "Bike is running safely";
	}

	public static void main(String args[]) {
	
		Bike obj = new Bike();
		
		System.out.println(obj.run());
	}
}
