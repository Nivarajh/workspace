
public class AbonneParking {

	private Abonnement [] tableau;
	private int nbAbonne;
	private int nbAbonnePresent;
	public AbonneParking() {
		
	}
	
	public void AfficheAbonne()
	{
		int i;
		
		for (i=0;i<tableau.length;i++)
		{
			System.out.println(tableau[i].toString());
			
		}
		
	}
	
	
	public void AfficheAbonne(String Type)
	{
		int i;
		
		for (i=0;i<tableau.length;i++)
		{
			if(tableau[i].getUnVehicule().getType().equals(Type))
			{
				System.out.println(tableau[i].toString());
			}
		}
		
	}
	
	public int benefice()
	{
		return nbAbonne *10;
		
	}
	
	public boolean EstAbonne(Vehicule v)
	{
		return true;
	}
	
	public void AjoutAbonne(Abonnement ab)
	{
		tableau[nbAbonne] = ab;
		nbAbonne++;
		
		// Pas de vérification que >tailleMax	
	}

	public Abonnement[] getTableau() {
		return tableau;
	}

	public void setTableau(Abonnement[] tableau) {
		this.tableau = tableau;
	}

	public int getNbAbonne() {
		return nbAbonne;
	}

	public void setNbAbonne(int nbAbonne) {
		this.nbAbonne = nbAbonne;
	}

	public int getNbAbonnePresent() {
		return nbAbonnePresent;
	}

	public void setNbAbonnePresent(int nbAbonnePresent) {
		this.nbAbonnePresent = nbAbonnePresent;
	}
	
	

	

}
