package inf;

class Circle implements Shape {
	public void draw() {
		System.out.println("drawing circle");
	}

	public static void main(String args[]) {
		Shape s = new Circle();
								
		s.draw();
	}
}
