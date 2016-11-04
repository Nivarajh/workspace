package listeChainee;

public class Habitation {

	private String proprietaire;
	private String adresse;
	private double surface;
	private boolean payer;
	
	
	public Habitation(String proprietaire, String adresse, double surface) {
		
		this.proprietaire = proprietaire;
		this.adresse = adresse;
		this.surface = surface;

		
	}
	
	public double impot()
	{
		double impot;
		impot = this.surface*2;
		return impot;
	}
	
	
	public void affiche()
	{
		System.out.println(" Le proprietaire est "+ this.proprietaire + " l'adresse est "+ this.adresse + " la surface "+ this.surface);
	}

}
