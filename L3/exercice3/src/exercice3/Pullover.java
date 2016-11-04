package exercice3;

public class Pullover {

	final static String marque = "Nike";
    static String modele;
	final int taille;
	String couleur;
    boolean plie = false;
	boolean abime = false;
	int prix;
	
	
	public Pullover(int uneTaille, String uneCouleur,int unPrix ) {
		
		
		this.taille = uneTaille;
		this.couleur = uneCouleur;
		this.prix = unPrix;
		
	}
	
	
	public static void setModele(String unModele)
	{
		modele = unModele;
	}
	
	public void SetCouleur(String uneCouleur)
	{
		couleur = uneCouleur;
		
	}	

	@Override
	public String toString() {
		String etat, abimer;
		if(abime == true)
		{
			abimer = "abimé";
			
		}
		
		else
		{
			abimer = "en bon état";
		}
		if(plie == false)
		{ 
			etat = "déplié";
		}
		else
		{
			etat = "plié";
		}
		return "La taille du pullover est : "+ taille + " la marque du pullover est : "+ marque + " la couleur du pullover : "+ couleur + 
				" le prix du pullover est : " + prix + " euros. Il est " + abimer + " et "+ etat ;
	}
	
	public String getCouleur()
	{
		return this.couleur;
	}
	
	
	public int compareTo(Pullover p)
	{
		return this.couleur.compareTo(p.couleur);
	}
	
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
