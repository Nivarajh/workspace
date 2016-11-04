
public class Ordinateur {
	
	int numeroSerie;
	boolean ethernet;

	public Ordinateur( int unNumeroSerie) {
		
	this.numeroSerie = unNumeroSerie;
	this.ethernet= false;
		
	}

	public int getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public boolean getEthernet() {
		return ethernet;
	}

	public void setEthernet(boolean ethernet) {
		this.ethernet = ethernet;
	}
	
	
	public void Saisie()
	{
		System.out.println("Vous avez un clavier externe.");
	}
	

	public static void connectionsListe(Ordinateur o)
	{
		System.out.println("Connexion Ethernet ");
		if (o instanceof Portable)
		{
			System.out.println("et Wifi");
		}
		
		if (o instanceof Tablette)
		{
			System.out.println("et 3G");
		}
	}
	
	
	public void identite()
	{
		System.out.println("je suis un ordinateur.");
		
	}
	
	
	
	
	public void AfficheSerie()
	{
	   System.out.println(" Le numéro de serie est le suivant : "+ this.numeroSerie);
	}
	
	public void AdHoc(Ordinateur o)
	{	
	     System.out.println("On ne peut pas se connecter en mode AdHoc.");
	}
	
	
	public void ports(int x)
	{
		System.out.println("il y a "+ x);
	}
	
	public  void ports(int x, int y)
	{
		System.out.println("il y a "+ (x+y));
	}
	
	
}
