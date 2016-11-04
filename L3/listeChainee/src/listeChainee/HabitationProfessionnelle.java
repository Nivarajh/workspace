package listeChainee;

public class HabitationProfessionnelle extends Habitation {
	
	private int nbEmploye;
	

	public HabitationProfessionnelle(String proprietaire, String adresse, double surface, int nbEmploye) {
		
		super(proprietaire,adresse,surface);
		
		this.nbEmploye = nbEmploye;
		
	}

	public double impot()
	{
		double res;
		res = this.nbEmploye/10;
		
		return super.impot() + res*150;
	}
}
