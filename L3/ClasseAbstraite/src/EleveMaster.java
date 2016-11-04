
public class EleveMaster extends Eleve {
	
	boolean licenceNanterre;

	public EleveMaster(String nom, String prenom, int numeroApogee, boolean licenceNanterre, int[] t) {
		// TODO Auto-generated constructor stub
		
		super(nom,prenom,numeroApogee,t);
		this.licenceNanterre = licenceNanterre;
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
		if (licenceNanterre)
		{
			System.out.println(" Licence Nanterre");
		}
		else
			System.out.println("Autre");
	}
	
       public String toString() {
		
		if(licenceNanterre)
		{
			return super.toString() + " licence Nanterre";
		}
		else
		return super.toString() + " Autre ";
	}

}
