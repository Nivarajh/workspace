package listeChainee;

public class Noeud {
	
 public	Habitation element;
 public Noeud prochain;
 

	public Noeud( Habitation unElement, Noeud unProchain) {
		
		this.element = unElement;
		this.prochain = unProchain;
	}

}
