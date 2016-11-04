package listeChainee;

public class HabitationIndividuelle  extends Habitation{
	
	private boolean piscine;
	private int nbPieces;

	public HabitationIndividuelle( String proprietaire, String adresse, double surface, boolean piscine, int nbPieces) {
		
		super(proprietaire,adresse,surface);
		this.piscine = piscine;
		this.nbPieces = nbPieces;
		// TODO Auto-generated constructor stub
	}
	
	public double impot()
	{
	 double impot;
	 
	 impot = super.impot();
	 impot = impot + nbPieces*15;
	 
	 if (piscine == true)
	 {
		 impot = impot + 80;
	 }
	 return impot;
	}

	
}
