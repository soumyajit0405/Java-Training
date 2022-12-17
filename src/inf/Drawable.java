package inf;

interface Drawable {
	void draw();

	default void msg() {
		System.out.println("default method");
	}

	static void cube(int x) {
		System.out.println("Static");
	}
}