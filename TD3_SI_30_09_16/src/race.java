public class race {
	
	static Double val = 0.0;
	sem_binaire s = new sem_binaire();
	
	public class thread_plus extends Thread{
		
		public void run(){
			for (int i=0; i< 1000000; i++){
				val += 1.0;
				s.V();
			}
		}
	}
	public class thread_moins extends Thread{
		
		public void run(){
			for (int i=0; i< 1000000; i++){
				val -= 1.0;
				s.P();
			}
		}
	}
	public void go() throws InterruptedException{
		thread_plus Tp = new thread_plus();
		thread_moins Tm = new thread_moins();
		
		Tp.start();
		Tm.start();
		//Tp.join();
		//Tm.join();
			
		System.out.println(val);

	}

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		race r = new race();
		r.go();
		
	}

}
