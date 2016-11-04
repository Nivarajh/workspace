
public class EleveLicenceApp extends EleveLicence {

	String tuteur;
	public EleveLicenceApp(String nom, String prenom, int numeroApogee, boolean iut, int[] t, String tuteur) {
		
		super(nom,prenom,numeroApogee,iut,t);
		this.tuteur = tuteur;
		
	}
	
	public void tuteur()
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
