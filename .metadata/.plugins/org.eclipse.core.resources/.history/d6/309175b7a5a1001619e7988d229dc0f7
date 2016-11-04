
public class monThread extends Thread {
	Registre leRegistre;
	monThread(Registre R) {
		leRegistre = R;
	}
	public void run() {
		for (int turn=0; turn<1000000; turn++) {
			long Tab[];
             synchronized(leRegistre){
			   Tab = leRegistre.get();
			   	for (int i = 0; i < Tab.length; i++) {
				Tab[i]++;
			   }
			   leRegistre.set(Tab);
              }
		}
	}
}
