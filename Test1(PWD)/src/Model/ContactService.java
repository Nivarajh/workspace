package Model;

import java.sql.SQLException;

public class ContactService 
{
	private String nom;
	private String prenom;
	private String email;
	
	public ContactService()
	{
	}
	
	
	
	public ContactService(String nm, String prm)
	{
		this.nom = nm;
		this.prenom = prm;
		
	}
	
	
	

	public ContactService(String nm, String prm,String email)
	{
		this.nom = nm;
		this.prenom = prm;
		this.email = email;
		
	}
	
	public void createContact() throws SQLException
	{
		ContactDAO dao = new ContactDAO(this.nom,this.prenom,this.email);
		dao.CreateContact();
		
	}
	
	public void researchContact() throws SQLException
	{
		ContactDAO dao = new ContactDAO(this.nom,this.prenom);
		dao.ResearchContact();
		
	}
	
	public void afficheContact() throws SQLException
	{
		ContactDAO dao = new ContactDAO(this.nom,this.prenom,this.email);
		dao.AfficheContact();
		
	}
	
	public void deleteContact()
	{
		ContactDAO dao = new ContactDAO(this.nom,this.prenom,this.email);
		dao.DeleteContact();
		
	}
}
