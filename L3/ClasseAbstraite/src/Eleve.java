
public abstract class Eleve {
	
	 String nom;
	 String prenom;
	int numeroApogee;
	int [] notes;

	public Eleve(String nom, String prenom, int numeroApogee, int [] note) {
		this.nom = nom;
		this.prenom = prenom;
		this.numeroApogee = numeroApogee;
		this.notes = note;
		
		// TODO Auto-generated constructor stub
	}
	
	public Eleve(String nom, String prenom, int apogee, int n)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.numeroApogee = apogee;
		this.notes = new int[n];
	}

	@Override  // necessite une redefinition dans ses classe filles !
	public String toString() {
		return "Eleve nom=" + nom + ", prenom= " + prenom + ", numeroApogee= "
				+ numeroApogee ;
	}
		
	public void Bienvenue()
	{ 
		System.out.println("Bienvenue "+ this.prenom + " " + this.nom);
	}
	
	
	public abstract boolean validationAnnee();
	
	
	
	public boolean premierEC()
	{
		return notes[0]>=10;
	}
	
	public int nombreEC(){
		
		int i;
		int cpt = 0;
		for (i=0;i<notes.length; i++)
		{
			if(notes[i]>=10)
				cpt++;
		}
		return cpt;
		
	}
	
	
	public  String mention(){
	
		double moyenne = 0;
		int j;
		
		if(!validationAnnee())
		{
			return "Recalé";
		}
		else
		{
			
			for(j=0; j<notes.length;j++)
			{
				moyenne = moyenne + notes[j];
			}
			moyenne = moyenne/notes.length;
			
			if(moyenne >= 16)
			{
				return "TB";
			}
			else if(moyenne <= 14)
			{
				return "B";
			}
			else if(moyenne >= 12)
			{
				return "AB";
			}
			else {
				return "Passable";
			}
			
		}
			
		
	}
	
	public float moyenne()
	{
		float moyenne =0;
		int i ;
		
		for(i=0;i<notes.length;i++)
		{
			moyenne = moyenne + notes[i];
		}
		
	return	moyenne = moyenne/notes.length;
		
		
	}
	
	
}
