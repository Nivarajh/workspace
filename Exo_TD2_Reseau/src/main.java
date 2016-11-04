
public class main {

	public static void main(String[] args) throws InterruptedException {
		
		Thread1 uneTache1 = new Thread1();
		Thread2 uneTache2 = new Thread2();
		Thread3 uneTache3 = new Thread3();
		Thread4 uneTache4 = new Thread4();
		
		uneTache1.start();
		Thread.sleep(400);
	    uneTache2.start();
	    Thread.sleep(400);
		uneTache3.start();
		Thread.sleep(400);
		uneTache4.start();
		
		
		
		
		
		

	}

}
