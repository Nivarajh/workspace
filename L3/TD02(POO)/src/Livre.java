
public class Livre {
	
	private String titre;
	private String auteur;
	private int nbPages;
	private String editeur;
	private float p = 1.00f;
	

	public Livre(String unTitre, String unAuteur, int unePage, String unEditeur) {
		
		this.titre = unTitre;
		this.auteur = unAuteur;
		this.nbPages = unePage;
		this.editeur = unEditeur;
		
		
	}
	
	
public Livre(String unTitre, String unAuteur, int unePage) {
		
		this.titre = unTitre;
		this.auteur = unAuteur;
		this.nbPages = unePage;
		this.editeur = "p.u.m.n";
		
		
	}
	


public Livre(String unTitre,String unEditeur) {
	
	this.titre = unTitre;
	this.auteur = "Mélanie Notlong";
	this.nbPages = 501;
	this.editeur = unEditeur;
	
	
}


public void afficheTitre()
{
	System.out.println("Titre :" + this.titre);
}


public float TempsLecture()
{
	return this.nbPages*p;
	
}


public static void Message()
{
	System.out.println("Chouette un livre");
}


@Override
public String toString() {
	
	return " le titre est " + this.titre + " l'auteur est "+ this.auteur + " l'éditeur est " + this.editeur + " le nombre de page est de " + this.nbPages + ".";
}





}
