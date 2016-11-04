
public class main {

	
		
		public static void afficheRecu(Eleve [] eleves)
		{
			int i;
			
			for(i=0;i<eleves.length;i++)
			{
				if(eleves[i].validationAnnee());
				System.out.println(" L'élève "+eleves[i].toString() + " a été reçu.");
			}
			
		}
		
		public static void afficheRecuL3(Eleve [] eleves)
		{
			int i;
			
			for(i=0;i<eleves.length;i++)
			{
				if((eleves[i] instanceof EleveLicence) && (eleves[i].validationAnnee()))
				{
					System.out.println("L'élève en licence "+ eleves[i].toString() + " a été reçu.");
				}
			}
			
		}
		
		public static void afficheRecaleApp(Eleve [] eleves)
		{
			int i;
			 
			
			for(i=0;i<eleves.length;i++)
			{
				if((eleves[i] instanceof EleveLicenceApp || eleves[i] instanceof EleveMasterApp) && (!eleves[i].validationAnnee()))
				{
					if(eleves[i] instanceof EleveLicenceApp)
					{
					 System.out.println( eleves[i].toString() + " Vous n’êtes pas reçu veuillez contacter votre tuteur Monsieur : " + ((EleveLicenceApp)eleves[i]).getTuteur());
					}
					
					if (eleves[i] instanceof EleveMasterApp)
					{
						System.out.println(eleves[i].toString() +"  Vous n’êtes pas reçu veuillez contacter votre tuteur Monsieur : " + ((EleveMasterApp)eleves[i]).getTuteur());
					}
					
				}
					
			}
		}
		
		
		public static float moyennePremierEC(Eleve [] eleves)
		{
			float moyenne = 0;
			int i;
			int cpt = 0;
			
			for(i=0;i<eleves.length;i++)
			{
				if(eleves[i].premierEC())
				{
					moyenne = moyenne + eleves[i].moyenne();
					cpt++;
				}
			}
			return moyenne/cpt;
			
			
			
			
		}
		
		
		
	public static void main(String[] args) {	
		
		
		Eleve [] Eleves = new Eleve [4];
		int [] notes;
		notes = new int [6];
		notes[0] = 15;
		notes[1] = 14;
		notes[2] = 12;
		notes[3] = 10;
		notes[4] = 8;
		notes[5] = 16;
		Eleves[0] = new EleveLicence("Marc","Dupont",6,true,notes);
		
		
		notes= new int[6];
		notes[0] = 12;
		notes[1] = 13;
		notes[2] = 14;
		notes[3] = 16;
		notes[4] = 17;
		notes[5] = 19;
		Eleves[1] = new EleveLicenceApp("Jean","Luc",7,false,notes,"François");
		
		notes= new int[5];
		notes[0] = 4;
		notes[1] = 13;
		notes[2] = 19;
		notes[3] = 16;
		notes[4] = 17;
		Eleves[2] = new EleveMaster("ludovic", "Karl",8,true,notes);
		
		
		notes= new int[5];
		notes[0] = 6;
		notes[1] = 2;
		notes[2] = 5;
		notes[3] = 6;
		notes[4] = 8;
		Eleves[3] = new EleveMasterApp("Eric","Jack",9,false,notes,"Bernard");
		
		afficheRecu(Eleves);
		afficheRecuL3(Eleves);
		afficheRecaleApp(Eleves);
		
		
		
		
	 
		
		
		

	}
	
	

}
