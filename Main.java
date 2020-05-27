import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Main {
        
      public static void main(String args[]){
             
	int choix;
	Classe classe=new Classe();
	LocalDate dateNaiss=LocalDate.of(2016, 9, 23);
	LocalDate date=LocalDate.now();
	long age = ChronoUnit.YEARS.between(dateNaiss, LocalDate.now());
	Etudiant etudi=new Etudiant("safia",dateNaiss,"inazadan",2020);
	do{
              System.out.println("1- Inscrire Etudiant dans une classe");
              System.out.println("2- Lister Classe");	
              System.out.println("3- Afficher Etudiants d'une classe");
              System.out.println("4- Creer Classe");
              System.out.println("5- Affecter Professeurs à une classe");
	      System.out.println("6- Afficher Professeurs à une classe");
	      System.out.println("7- Quitter");
              System.out.println("Faites votre choix");
              Scanner clavier=new Scanner(System.in);
              choix=clavier.nextInt();
           
         
           switch(choix){
            case 1:
              	  System.out.println( etudi.affiche());
		  System.out.println( age);
		  
             break;
            case 2:
                 
             break;
	     case 3:
                 
             break;
           }

     } while(choix!=7);


                  
       }

}

