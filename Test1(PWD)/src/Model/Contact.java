package Model;

public class Contact {
	
	private String nom;
	private String prenom;
	private String email;
	
	
	public Contact(String nom, String prenom, String email)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		
	}
	
	
	public String GetNom()
	{
		return this.nom;
		
	}
	
	public String GetPrenom()
	{
		return this.prenom;
	}
	
	public String GetEmail()
	{
		
		return this.email;
	}
	
	
	
	
	

}
