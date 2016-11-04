import java.util.Scanner;


public class Exercice1 {

public Exercice1()
{
	
}
public void Hello()
{
	System.out.println("Hello World !");
}

public void Hello2()
{
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Entrez un nom ");
	String nom = sc.nextLine();
	
	System.out.println("Hello "+nom);
	
}







	

public static void main(String[] args) {
	
	//Exercice1 ex = new Exercice1();
	//ex.Hello2();
	



//System.out.println(args[0]);
	
String mot;
int i =0;
Scanner sc = new Scanner(System.in);

while(sc.hasNext())
{
	mot = sc.next();
	System.out.println("[" + i + "]"+ " : Hello " + mot );
	if(mot.equals("fin"))
	{
		break;
	}
	i++;
}
sc.close();
System.out.println("fin");

}



}



