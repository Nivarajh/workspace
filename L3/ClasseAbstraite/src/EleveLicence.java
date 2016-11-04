
public class EleveLicence extends Eleve {
	
	boolean iut;

	public EleveLicence(String nom, String prenom, int numeroApogee, boolean iut,int[] t) {
		
		super(nom,prenom,numeroApogee,t);
		this.iut = iut;
	}



	@Override
	public boolean validationAnnee() {
		double moyenne = 0;
		int j;
		
			for(j=0; j<notes.length;j++)
			{
				moyenne = moyenne + notes[j];
			}
			moyenne = moyenne/notes.length;
			
			return moyenne >= 10;
	}
	
	public void provenance()
	{
		if (iut)
		{
			System.out.println("IUT");
		}
		else
			System.out.println("BTS ou UPO");
	}



	@Override
	public String toString() {
		
		if(iut)
		{
			return super.toString() + " iut";
		}
		else
		return super.toString() + " UPO ou Autre ";
	}
	
	

}
