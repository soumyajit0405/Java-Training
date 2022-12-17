package inf;

class A2D implements Drawable {
	public void draw() {
		System.out.println("drawing rectangle");
	}
	
	public static void main(String args[]) {
		Drawable d = new A2D();
		d.draw();
		d.msg();
		Drawable.cube(3); 
	}
}