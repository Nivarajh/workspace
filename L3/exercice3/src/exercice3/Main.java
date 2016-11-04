package exercice3;

public class Main {

	public Main() {
		
	
	}

	public static void main(String[] args) {
	
		Pullover p1 = new Pullover (15,"bleu",75);
		Pullover p2 = new Pullover (12,"rouge",60);
		Pullover p3 = new Pullover (10,"vert",80);
		Pullover p4 = new Pullover (13,"vert",86);
		Pullover p5 = new Pullover (15,"bert",88);
		Rayon r = new Rayon(p1);
		Pullover.modele = "Miage";
		r.AjoutPull(p2);
		r.AjoutPull(p3);
		r.AjoutPull(p4);
		r.AjoutPull(p5);
		
		
		r.tri_Selection();
		r.enleveAbime();
		r.affiche();
		System.out.println("Enleve Vide--------------------------");
		p3.abime= true;
		r.enleveVide();
		r.affiche();
		//System.out.println(p1.toString());
	
}
	
	
}