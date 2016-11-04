
public class Main {

	

	public static void main(String[] args) {
	
		Ordinateur []LesOrdinateurs = new Ordinateur[7];
	    
		LesOrdinateurs[0] = new Ordinateur(12546);
		LesOrdinateurs[1] = new Ordinateur(12898);
		LesOrdinateurs[2] = new Portable(25896);
		LesOrdinateurs[3] = new Portable(26989);
		LesOrdinateurs[4] = new Portable(25896);
		LesOrdinateurs[5] = new Tablette(12458);
		LesOrdinateurs[6] = new Tablette(19858);
		
		((Portable)LesOrdinateurs[2]).wifi = true;
		((Tablette)LesOrdinateurs[5]).troisG = true; 
		
		   
		
	      AfficheOrdiConnecter(LesOrdinateurs);
	      AfficheMethodes(LesOrdinateurs);

		
		
	}
	
	
	public static void AfficheOrdiConnecter(Ordinateur [] ordinateurs)
	{
		int j,i;
		
		for(i=0;i<ordinateurs.length-1;i++)
		{
			for(j=i+1;j<ordinateurs.length; j++)
		    {
		      ordinateurs[j].identite();
		      ordinateurs[j].AfficheSerie();
		      ordinateurs[i].AdHoc(ordinateurs[j]);
	     	}
	    }
		
	}
	
	
	public static void AfficheMethodes(Ordinateur[] ordinateurs)
	{
		int i;
		for(i=0;i<ordinateurs.length;i++)
		{
			System.out.print(" Méthode 1 : ");
			ordinateurs[i].ports(5); 
			System.out.print(" Méthode 2 : ");
			ordinateurs[i].ports(5,-4); 
			if (ordinateurs[i] instanceof Portable)
			{	
			System.out.print(" Méthode 4 : ");
			((Portable)ordinateurs[i]).ports(5,6,7);
			}
		}
		
	}
	
	
	
	
	

}
