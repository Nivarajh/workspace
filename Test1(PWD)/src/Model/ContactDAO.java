package Model;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class ContactDAO 
{

	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost/contact";
	String uid = "root";
	String passwd = "root";
	Connection cx = null;
	
	
	private String nom;
	private String prenom;
	private String mail;
	
	public ContactDAO()
	{
		
		try {
		Class.forName(driver);
		cx = (Connection) DriverManager.getConnection(url, uid, passwd);
		System.out.println("Connexion r�ussie niv !" );
		
		
	    // faire QQChose avec la connexion �
		} catch (ClassNotFoundException e) {
		// classe du pilote introuvable
		} catch (SQLException e) {
		// acc�s � la base refus�
		} 
		
		
	}
	
	
	
	
	public ContactDAO(String nom, String prenom)
	{
		
		this.nom = nom;
		this.prenom = prenom;
		try {
		Class.forName(driver);
		cx = (Connection) DriverManager.getConnection(url, uid, passwd);
		System.out.println("Connexion r�ussie niv !" );
		
		
	    // faire QQChose avec la connexion �
		} catch (ClassNotFoundException e) {
		// classe du pilote introuvable
		} catch (SQLException e) {
		// acc�s � la base refus�
		} 
		
		
	}
	

	public ContactDAO(String nom, String prenom, String mail)
	{
		
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		try {
		Class.forName(driver);
		cx = (Connection) DriverManager.getConnection(url, uid, passwd);
		System.out.println("Connexion r�ussie niv !" );
		
		
	    // faire QQChose avec la connexion �
		} catch (ClassNotFoundException e) {
		// classe du pilote introuvable
		} catch (SQLException e) {
		// acc�s � la base refus�
		} 
		
		
	}
	
	public void CreateContact() throws SQLException
	{
		Statement statement = (Statement) cx.createStatement();

		 /* Ex�cution d'une requ�te de lecture */

     // ResultSet resultat = statement.executeQuery("SELECT id, nom, prenom, email FROM contact;");
		String sql = "INSERT INTO `contact`(`nom`, `prenom`, `email`) VALUES ('" + this.nom + "','"+ this.prenom + "','"+ this.mail +"')";
      int resultat = statement.executeUpdate(sql);
     


           /* Formatage des donn�es pour affichage dans la JSP finale. */

           System.out.println("Ajout effectu�");

       }
       
		
	
	
	
	public void ResearchContact() throws SQLException
	{
		Statement statement = (Statement) cx.createStatement();

		 /* Ex�cution d'une requ�te de lecture */

    // ResultSet resultat = statement.executeQuery("SELECT id, nom, prenom, email FROM contact;");
		String sql = "Select id, nom, prenom, email from contact where nom ='"+this.nom +"'and prenom ='"+ this.prenom +"'";
		
	 ResultSet resultat = statement.executeQuery(sql);

        /* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */

        while ( resultat.next() ) {

            int id = resultat.getInt( "id" );

            String nom = resultat.getString( "nom" );

            String prenom = resultat.getString( "prenom" );

            String email = resultat.getString( "email" );
            
            System.out.println("Votre contact est le suivant : id = "+ id + " nom = "+ nom + " prenom = " + prenom + " email = "+ email + "");

        }

	}
	
	public void AfficheContact() throws SQLException
	{
		Statement statement = (Statement) cx.createStatement();

		String sql = "Select * from contact";
		
		 ResultSet resultat = statement.executeQuery(sql); 
		 while ( resultat.next() ) {

	            int id = resultat.getInt( "id" );
	            String nom = resultat.getString( "nom" );

	            String prenom = resultat.getString( "prenom" );

	            String email = resultat.getString( "email" );       
		 }
		 
		 
		 
		
	//	String sql1 = "UPDATE `contact` SET `nom`='" + this.nom + "',`prenom`='" + this.prenom + "',`email`'"+ this.mail +"'where id="'";
      //  int resultat1 = statement.executeUpdate(sql);
   


          System.out.println("Mise � jour effectu�e");

      
	}
	
	
	public ArrayList updateContact() throws Exception
	{
		return null;
		
		
	}
	
	public void DeleteContact()
	{
		
		System.out.println("Votre contact � bien �t� supprim�!");
	}
	
	
}
