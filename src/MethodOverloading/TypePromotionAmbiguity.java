package MethodOverloading;

class TypePromotionAmbiguity {
	void sum(int a, long b) { //M1
		System.out.println("a method invoked");
	}

	void sum(long a, int b) { //M2
		System.out.println("b method invoked");
	}
	
//	void sum(int a, int b) { //M3
//		System.out.println("c method invoked");
//	}

	public static void main(String args[]) {
		TypePromotionAmbiguity obj = new TypePromotionAmbiguity();
		obj.sum(20, 20);// now ambiguity
	}
}