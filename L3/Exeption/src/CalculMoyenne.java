import java.util.Scanner;


public class CalculMoyenne {
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		
		String chaine;
		Scanner sc; 
		int nombre = 0;
		int entier;
		int somme = 0;
		float moyenne = 0;
		
		try
		{
			sc = new Scanner(System.in);
			
			while(sc.hasNext())
			{
				chaine = sc.next();
				entier = Integer.parseInt(chaine);
				nombre++;
				somme = somme + entier;
			}
		}
		catch(NumberFormatException  num)
		{
			System.out.println(" Vous n'avez pas saisi un chiffre");
			
		}
		
		catch(Exception e)
		{
			System.out.println("Probleme autre");
			moyenne = 0;
			
		}
		
		
		try
		{
			moyenne = somme/nombre;
		}
		
		catch (ArithmeticException e)
		{
			
			System.out.println(" Division par 0");
			throw new 
			MoyenneFausseExeption();
		}
		
		System.out.println(" La moyenne est " + moyenne);
		
	}

}
