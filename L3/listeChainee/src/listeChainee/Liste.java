package listeChainee;

public class Liste {

	public Noeud tete;
	
	public Liste( Noeud n) {
		
		this.tete = n;
	}
	
	
	public void InsererTete(Habitation h)
	{
		Noeud n = new Noeud(h,tete);
		tete = n;
	}
	
	public void InsererFin (Habitation h)
	{
		Noeud parcours, n;
		parcours = tete;
		
		if (tete == null)
		{
		
		n = new Noeud(h,null);
    	this.tete = n;
	
		}
		
		while(parcours.prochain!=null)
		{
			parcours = parcours.prochain;
		}
		n = new Noeud(h,null);
		
		parcours.prochain = n;
		
		return;
		
		
	}
	
	public void supprimerElement(Habitation h)
	{
		Noeud parcours, precedent;
		parcours = tete;
		precedent = parcours;
		
		if (tete==null)
			return;
		while(parcours.prochain != null && parcours.element.equals(h) )
		{
			precedent = parcours;
			parcours = parcours.prochain;
		}
		
		if(parcours.prochain == null)
			return;
		precedent.prochain = parcours.prochain;
	}
	
	

}
