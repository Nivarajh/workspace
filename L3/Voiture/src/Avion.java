
public class Avion implements Vehicule {

	int nbreacteur;
	double vitesse;
	
	public Avion(int nbReacteur)
	{
		this.vitesse = 0;
		this.nbreacteur = nbReacteur;
	}
	
	@Override
	public double vitesse() {
		return this.vitesse;
	}

	@Override
	public void demarrer() {
		this.vitesse = 1;
		
	}

	@Override
	public void accelerer(double vitesse) {
		this.vitesse = this.vitesse + vitesse;
		
	}

	@Override
	public void ralentir(double r) {
		this.vitesse = this.vitesse - r;
		
	}



	 

	
}
