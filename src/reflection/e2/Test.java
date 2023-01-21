package reflection.e2;

class Simple {
	void message() {
		System.out.println("Hello Java");
	}
}

class Test {
	public static void main(String args[]) {
		try {
			Class c = Simple.class;
			Simple s = (Simple) c.newInstance();
			s.message();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}