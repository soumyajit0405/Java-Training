package iib;

class Bike {
	int speed;

	{
		speed = 100;
	}
	

	Bike() {
		System.out.println("speed is " + speed);
	}

	public static void main(String args[]) {
		Bike b1 = new Bike();
	}
}
