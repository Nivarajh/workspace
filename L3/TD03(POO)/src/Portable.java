
public class Portable extends Ordinateur {
	
	boolean wifi;
	boolean clavierExterne;
	
	
	public Portable(int numeroSerie)
	{
		super(numeroSerie);
		this.wifi = false;
		this.clavierExterne = false;
		
		// TODO Auto-generated constructor stub
	}
	public boolean getWifi() {
		return wifi;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	public boolean getClavierExterne() {
		return clavierExterne;
	}
	public void setClavierExterne(boolean clavierExterne) {
		this.clavierExterne = clavierExterne;
	}
	
	public void Saisie()
	{
		if(clavierExterne = true)
		{
			super.Saisie();
		}
		else
		{
			System.out.println("Clavier Interne.");
		}
	}
	
	public void WifiAdHoc(Ordinateur o)
	{
		Portable p;
		if(o instanceof Portable)
		{
			p = (Portable) o;
			if (p.getWifi())
			{
				System.out.println("Relié à wifi");
			}
			else
				System.out.println("Non relié à wifi");
		}
	}
	
	public void AdHoc(Ordinateur o)
	{
		
		if(this.getWifi())
		{
			WifiAdHoc(o);
		}
		else 
	    System.out.println(" connection par AdHoc impossible.");
	
	}
	
	
	public void identite()
	{
		System.out.println("je suis un portable.");
		
	}
	
	
	public  void ports(int x, int y)
	{
		System.out.println("il y a "+ (x*y));
	}
	
	
	public  void  ports(int x, int y, int z)
	{
		System.out.println("il y a "+ (x+y+z));
	}
	
	public static void PuissanceSignal(Portable p, float f)
	{
		System.out.println("La force du signal est de "+ f + " pour ce "+p.getClass().getSimpleName());
	}

}
