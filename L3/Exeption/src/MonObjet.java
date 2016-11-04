
public class MonObjet {
	
	int n;
	
	public MonObjet(int n)
	{
		
		this.n = n;
	}
	
	
	
	
	@Override
	public String toString() {
		return "MonObjet n= " + n ;
	}




	public static void main(String[] args)
	
	{
		
		MonObjet []tab = new MonObjet[3];
		
		tab[0] = new MonObjet(1);
		tab[2] = new MonObjet(3);
		
		
		
		
		try
		{
			//System.out.println(tab[1].toString());
			System.out.println(tab[3].toString());
			System.out.println("Voila la fin");
			
		}
		catch(NullPointerException e)
		{
			
		 System.out.println(" Message perso " + e.getMessage());
			e.printStackTrace(); 
			System.out.println(" la soirée continue");
		}
		
		catch(ArrayIndexOutOfBoundsException e3)
		{
			System.out.println(" je suis sorti " + e3.getMessage());
			System.out.println(" La aussi la soirée continue");
		}
		
		System.out.println(" ça tourne");
		
		
		
		
		
	}
	
	
}
