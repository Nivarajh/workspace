
public class Tablette extends Portable{

	boolean troisG;
	public Tablette(int unNumeroSerie)
	{
		super(unNumeroSerie);
		this.troisG = false;
		// TODO Auto-generated constructor stub
	}
	
	
	public void Saisie()
	{
		if(this.getClavierExterne() == true)
		{
			super.Saisie();
		}
		else
		{
			System.out.println("Clavier Tactile.");
		}
	}
	
	public void troisGAdhoc(Ordinateur o)
	{
		Tablette t;
		if (o instanceof Tablette )
		{
			t = (Tablette) o;
			if(t.getTroisG())
			{
				System.out.println(" a le 3G");
			}
			else
				System.out.println(" Ne peut pas se connecter.");
		}
		
	}
	
	
	public void AdHoc(Ordinateur o)
	{
		
		if(this.getWifi())
		{
			WifiAdHoc(o);
		}
		
		if (this.getTroisG())
		{
			troisGAdhoc(o);
		}
		
		if(!getWifi() && !getTroisG()) 
	    System.out.println("connection par AdHoc impossible.");
	
	}
	
	


	public boolean getTroisG() {
		return troisG;
	}


	public void setTroisG(boolean troisG) {
		this.troisG = troisG;
	}
	
	
	public void identite()
	{
		System.out.println("je suis une tablette.");
		
	}
	
	public static void PuissanceSignal(Tablette t, int i)
	{
		System.out.println("La force du signal est de "+ i + " pour ce "+t.getClass().getSimpleName());
	}


}
