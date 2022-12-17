package finalkeyword;

class Honda extends Bike {
	@Override
	void run() {
		System.out.println("running safely with 100kmph");
	}
	
	//Comment and show the method. It should work 

	public static void main(String args[]) {
		Honda honda = new Honda();
		honda.run();
	}
}