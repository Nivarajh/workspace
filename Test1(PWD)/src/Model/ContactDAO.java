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
		System.out.println("Connexion réussie niv !" );
		
		
	    // faire QQChose avec la connexion …
		} catch (ClassNotFoundException e) {
		// classe du pilote introuvable
		} catch (SQLException e) {
		// accès à la base refusé
		} 
		
		
	}
	
	
	
	
	public ContactDAO(String nom, String prenom)
	{
		
		this.nom = nom;
		this.prenom = prenom;
		try {
		Class.forName(driver);
		cx = (Connection) DriverManager.getConnection(url, uid, passwd);
		System.out.println("Connexion réussie niv !" );
		
		
	    // faire QQChose avec la connexion …
		} catch (ClassNotFoundException e) {
		// classe du pilote introuvable
		} catch (SQLException e) {
		// accès à la base refusé
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
		System.out.println("Connexion réussie niv !" );
		
		
	    // faire QQChose avec la connexion …
		} catch (ClassNotFoundException e) {
		// classe du pilote introuvable
		} catch (SQLException e) {
		// accès à la base refusé
		} 
		
		
	}
	
	public void CreateContact() throws SQLException
	{
		Statement statement = (Statement) cx.createStatement();

		 /* Exécution d'une requête de lecture */

     // ResultSet resultat = statement.executeQuery("SELECT id, nom, prenom, email FROM contact;");
		String sql = "INSERT INTO `contact`(`nom`, `prenom`, `email`) VALUES ('" + this.nom + "','"+ this.prenom + "','"+ this.mail +"')";
      int resultat = statement.executeUpdate(sql);
     


           /* Formatage des données pour affichage dans la JSP finale. */

           System.out.println("Ajout effectué");

       }
       
		
	
	
	
	public void ResearchContact() throws SQLException
	{
		Statement statement = (Statement) cx.createStatement();

		 /* Exécution d'une requête de lecture */

    // ResultSet resultat = statement.executeQuery("SELECT id, nom, prenom, email FROM contact;");
		String sql = "Select id, nom, prenom, email from contact where nom ='"+this.nom +"'and prenom ='"+ this.prenom +"'";
		
	 ResultSet resultat = statement.executeQuery(sql);

        /* Récupération des données du résultat de la requête de lecture */

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
   


          System.out.println("Mise à jour effectuée");

      
	}
	
	
	public ArrayList updateContact() throws Exception
	{
		return null;
		
		
	}
	
	public void DeleteContact()
	{
		
		System.out.println("Votre contact à bien été supprimé!");
	}
	
	
}
