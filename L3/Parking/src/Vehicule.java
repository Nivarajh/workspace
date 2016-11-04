
public class Vehicule {

	private String type;
	private String immatriculation;
	//Abonnement unAbonnement;
	
	
	public Vehicule(String unType, String unImmatriculation) {
		this.type = unType;
		this.immatriculation = unImmatriculation;
	}
	
	
	public String getType()
	{
		return this.type;
	}
	
	public String getImmatriculation()
	{
		return this.immatriculation;
	}
	
	//public Abonnement getAbonnement()
	//{
		//return this.unAbonnement;
	//}
	
	public boolean equals (Vehicule v)
	{
		return(this.immatriculation.equals(v.getImmatriculation()));
		
	}
}
