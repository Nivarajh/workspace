
public class Abonnement {

	Client unClient ;
	Vehicule unVehicule;
	public Abonnement(Client LeClient, Vehicule leVehicule ) {
	
		this.unClient = LeClient;
		this.unVehicule = leVehicule;
	}
	public Client getUnClient() {
		return unClient;
	}
	public void setUnClient(Client unClient) {
		this.unClient = unClient;
	}
	public Vehicule getUnVehicule() {
		return unVehicule;
	}
	public void setUnVehicule(Vehicule unVehicule) {
		this.unVehicule = unVehicule;
	}

}
