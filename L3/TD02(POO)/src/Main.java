
public class Main {

	public static void AfficheTitre(Livre[] l)
	{
		int i;
		for (i=0;i<l.length;i++)
		{
			l[i].afficheTitre();
		}
	}
	
	public static void main(String[] args) {
		
		Livre[] LesLivres = new Livre[6];
		
		LesLivres[0] = new Livre("Barb�s Vertigo","Denis-Henri L�vy", 100, "Le d�couvert");
		LesLivres[1] = new Livre("Et si c��tait niais ?","Marc Levis", 245,"Gallimatias");
		LesLivres[2] = new Livre("Quelqu�un m�attend,c�est tout","Anna Galvauda",10,"Minuit");
		LesLivres[3] = new Oeuvre("Stop au tremblements","gallimatias",false);
		LesLivres[4] = new Oeuvre("Cosm�tique de l�ennui","Soule",false);
		LesLivres[5] = new ChefOeuvre("Java pendant la sieste","C. Alanoy",6000000,true);
		
		AfficheTitre(LesLivres);
		
	
		

	}
	
	

}
