
public class Parking {

	private int nbPlaceUtilisee;
	private int nbAbonne;
	private int nbAbonnePresent;
	private final int tailleMax = 80;
	Abonnement [] tab;
	AbonneParking [] tabAbonneParking;
	
	public Parking() {
		
		tab = new Abonnement[tailleMax];
		nbPlaceUtilisee = 0;
		nbAbonne = 0;
		nbAbonnePresent = 0;
		
		
	}
	
	
	//public void AjoutAbonne(Abonnement ab)
	//{
	//	tab[nbAbonne] = ab;
	//	nbAbonne++;
		
		// Pas de vérification que >tailleMax	
	//}
	
	public boolean Acceptation(Vehicule unVehicule)
	{
		
		int i;
		
		for(i = 0; i<nbAbonne; i++)
		{
			if (tab[i].getUnVehicule().equals(unVehicule))
		    {
				nbAbonnePresent++;
				return true;
			}
			
		}
		//v n'est pas un abonne
		
			if (tailleMax - nbPlaceUtilisee - nbAbonne>0)
			{
				nbPlaceUtilisee++;
				return true;
			}
			return false;
	}
	
	
	public void SortieParking (Vehicule unVehicule)
	{
		int i;
		for(i=0;i<tab.length;i++)
		{
			if(tab[i].getUnVehicule().equals(unVehicule))
			{
				nbAbonnePresent++;
				return;
			}
		}
			nbPlaceUtilisee--;
		
		
	}
	

}
