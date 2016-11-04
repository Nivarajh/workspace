package exercice3;



public class Rayon {

	int tailleMax;
	Pullover [] tab;
	int nbElement;
	
	
	
	public Rayon(Pullover P) {
		
		this.tailleMax = 30;
		tab = new Pullover[1];
		tab[0] = P;
		nbElement = 1;
		
		
	}
	
	
	public int AjoutPull(Pullover pull)  {
		
		Pullover [] tab2;
		
		if(tab.length < tailleMax)
		{
			tab2 = new Pullover [nbElement+1];
			System.arraycopy(tab,0,tab2,0,tab.length);
			tab2[nbElement] = pull;
			tab = tab2;
			nbElement++;
			return 0;
		}
		else
		{
			return 1;
		}
		
		
		
		
	}


	@Override
	public String toString() {
		
		if (nbElement == 0)
		{
			return "Ce rayon n'a pas de pull";
		}
		else
		{
			return ("Le Rayon a " + nbElement  + " pulls.Il peut contenir " + tailleMax + " pulls.");
		}
	}
	
	public void affiche()
	{
		System.out.println(this.toString());
		for(int i =0; i<tab.length; i++)
		{
			//enleveVide();
			System.out.println(tab[i].toString());
		}
	}

	
	
	public float enleveAbime()
	{
		float count = 0;
		for (int i=0; i<tab.length; i++)
		{
			if (tab[i].abime)
			{
				count = count + tab[i].prix;
				tab[i]=null;
				nbElement--;
			}
		}
		return count;
	}
	
	
	public float enleveAbime(String pcouleur)
	{
		float count = 0;
		
		for(int i= 0; i<tab.length; i++)
		{
			if (tab[i].abime && tab[i].couleur.equals(pcouleur))
			{
				count = count + tab[i].prix ;
				tab[i]=null;
				nbElement --;
			}
		}
		return count;
		
	}

	public void tri_Selection()
	{
		int j,i, indMin;
		Pullover p ;
		
		for(j=0;j<tab.length-1 ; j++)
		{
			indMin= j;
			p=tab[j];
			for (i=j+1;i<tab.length;i++)
			{
				if(p.compareTo(tab[i])>0)
				{
					p = tab[i];
					indMin = i; 
				}
				
			}
			Pullover tmp = tab[j];
			tab[j]=p;
			tab[indMin]=tmp;
			
			
			
		}
		
		
	}
	
	public void tri_Inserction()
	{
		
		int j, i,h;
		Pullover p;
		for(i=0;i<tab.length-1; i++)
		{
			//je recherche l'emplacement
			j=0;
			p=tab[i];
			
			while(j<i && p.compareTo(tab[i])<0)
			{
				j++;
			}
			// j'insère la valeur de l'emplacement
			for(h=i;h>j;h--)
			{
				tab[h]=tab[h-1];
			}
			// fin du décalage
			tab[j]=p;
			
		}
	
	}
	
	
	
	public void tri_Insertion2()
	{
		int i,j;
		
		for(i=1;i<tab.length;i++)
		{
			Pullover valeur_en_cours = tab[i];
			j=i;
			while((j>0) && tab[j-1].compareTo(valeur_en_cours)>0)
			{
				tab[j]=tab[j-1];
				j--;
			}
			tab[j]=valeur_en_cours;
		}
	}
	
	
	public void enleveVide()
	{
		int i,j=0, compteur=0;
		
		for(i=0;i<tab.length; i++)
		{
			if(tab[i] == null)
			{
			  compteur++;
			}
			
		}
		Pullover [] tmp= new Pullover[tab.length-compteur];
		
		for(i=0;i<tab.length;i++)
		{
			if(tab[i] != null)
			{
				tmp[j]=tab[i];
				j++;
			}
		}
		tab=tmp;
		
	}
	
	
	public void enleveVideComplexe()
	{
		
		int compteur=0,compteurNonVide=tab.length-1;
		Pullover echange;
		
		while (compteur != compteurNonVide)
		{
		
			while(tab[compteur]!=null && compteur<compteurNonVide)
			{
			
				compteur ++;
			}
		
			while(tab[compteurNonVide]==null && compteurNonVide>compteur)
			{
				compteurNonVide--;
			}
			echange = tab[compteur];
			tab[compteur]= tab[compteurNonVide];
			tab[compteurNonVide] = echange;
		
			Pullover [] nv = new Pullover[compteur];
			System.arraycopy(tab, 0, nv, 0, compteur);
			tab=nv;
			
		}
		
	
		
	}
	
}

	
	

