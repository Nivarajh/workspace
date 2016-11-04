import java.util.Random;


public class Oeuvre extends Livre {
	
	int critique;
	boolean recommandation;

	public Oeuvre(String unTitre, String unAuteur, int unePage, String unEditeur, int uneCritique, boolean uneRecommandation ) {
	
	super(unTitre,unAuteur,unePage,unEditeur);
		
		this.critique = uneCritique;
		this.recommandation = uneRecommandation;
	}
	
	public Oeuvre(String unTitre, String unAuteur, int unePage, boolean uneRecommandation ) {
		
		super(unTitre,unAuteur,unePage);
			
			this.critique = 5;
			this.recommandation = uneRecommandation;
		}
	
	
public Oeuvre(String unTitre, String unEditeur, boolean uneRecommandation ) {
		
		super(unTitre,unEditeur);
			
			this.critique = 0;
			this.recommandation = uneRecommandation;
		}



public float tempsLecture()
{
	
	return super.TempsLecture() *2.00f;
}


public static void Message()
{
	System.out.println("J’aime les classiques");
}


public void Like()
{
	
	Random r = new Random();
	this.recommandation = (r.nextFloat()<0.5);
 
	
}



public void setRecommandation(boolean recommandation) {
	this.recommandation = recommandation;
}

@Override
public String toString() {
	
	return super.toString() + " la crituque est "+ this.critique + " la récommandation est " + this.recommandation;
}

}
