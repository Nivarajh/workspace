import java.util.Random;


public class ChefOeuvre extends Oeuvre{

	private float popularite;
	
	public ChefOeuvre(String unTitre, String unAuteur, int unePage, String unEditeur, int uneCritique, boolean uneRecommandation, float unePopularite) {
		
	super(unTitre,unAuteur,unePage,unEditeur,uneCritique, uneRecommandation);
		this.popularite = unePopularite;
	}
	

public ChefOeuvre(String unTitre, String unAuteur, int unePage,  boolean uneRecommandation) {
		
		super(unTitre,unAuteur,unePage, uneRecommandation);
	
			this.popularite = 0.5f;
		}
	
	
public ChefOeuvre(String unTitre,String unEditeur, boolean uneRecommandation,float unePopularite) {
		
		super(unTitre,unEditeur,uneRecommandation);
	
			this.popularite = 90f;
		}



public float TempsLecture()
{
	return super.tempsLecture() * 1.5f;
	
}


public static void Message()
{
   System.out.println("Ah que c’est beau");
   
}

public void Like()
{
	Random r = new Random();
	super.setRecommandation((r.nextFloat()<0.7));
	
}




@Override
public String toString() {
	
	return super.toString() + " la popularité :"+ this.popularite;
}


}
