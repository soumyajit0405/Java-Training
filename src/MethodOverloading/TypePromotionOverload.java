package MethodOverloading;

public class TypePromotionOverload {

	void sum(int a, float b) { //M1
		System.out.println(a + b);
	}

	void sum(int a, float b, int c) { //M2
		System.out.println(a + b + c);
	}
	
	public static void main(String args[]) {
		TypePromotionOverload obj = new TypePromotionOverload();
		obj.sum(20, 20);// now second int literal will be promoted to long
		obj.sum(20, 20, 20);

	}

}
