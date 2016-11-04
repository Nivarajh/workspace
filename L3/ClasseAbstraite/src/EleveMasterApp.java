
public class EleveMasterApp extends EleveMaster{

	String tuteur;
	
	public EleveMasterApp(String nom, String prenom, int numeroApogee, boolean licenceNanterre, int[] t,String tuteur) {
		super(nom,prenom,numeroApogee,licenceNanterre,t);
		this.tuteur = tuteur;
		
		
	}
	
	public void AfficheTuteur()
	{
		System.out.println(this.tuteur);
	}

	public String ToString()
	{
		return super.toString() + " tuteur " + this.tuteur;
	}

	public String getTuteur() {
		return tuteur;
	}

	public void setTuteur(String tuteur) {
		this.tuteur = tuteur;
	}
}
