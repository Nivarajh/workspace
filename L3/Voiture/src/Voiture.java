
public class Voiture implements Vehicule, BienConsommation {

	double vitesse;
	float prix;
	int nbChevaux;
	
	
	public Voiture(float prix,int nbChevaux)
	{
		this.vitesse = 0;
		this.prix = prix;
		this.nbChevaux = nbChevaux;
	}
	
	
	@Override
	public float consulterPrix() {
		return this.prix;
	}

	@Override
	public void vendre(float i) {
		
		System.out.println(this.prix = this.prix +i);
		
	}

	@Override
	public void acheter(float i) {
		
		System.out.println(this.prix= prix-i);
		
		
	}

	@Override
	public double vitesse() {
		
		
		return  this.vitesse;
	}

	@Override
	public void demarrer() {
		this.vitesse = 1;
		
	}

	@Override
	public void accelerer(double a) {
		this.vitesse = this.vitesse + a;
		
	}

	@Override
	public void ralentir(double r) {
		this.vitesse = this.vitesse - r;
		
	}
	
	
	
	

}
