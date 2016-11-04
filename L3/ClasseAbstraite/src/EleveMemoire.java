import java.util.Scanner;


public class EleveMemoire implements Memoire {

	int noteMemoire;
	
	
	public EleveMemoire(int noteMemoire)
	{
		this.noteMemoire = noteMemoire;
	}
	
	@Override
	public int obtention() {
		return this.noteMemoire;
	}

	@Override
	public boolean renduATemps() {
		String v;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Memoire rendu à temps ?");
		v = sc.next();
		v= v.toUpperCase();
		sc.close();
		
		if (v.equals("OUI"))
			return true;
		else
			return false;
	}

	@Override
	public double degreProblematique()
	{
		double d = Math.random();
		return 10+30*d;
	}
		
	
	

}
