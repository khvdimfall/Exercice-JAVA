import java.time.LocalDate;
public abstract class Personne implements IInscription{

   //Auto généré
    protected int id;
   
    protected  String nomComplet;
    protected  LocalDate dateNaiss;
    protected  int  age;

    public Personne (String nomComplet,
               LocalDate dateNaiss){
      this.nomComplet=nomComplet;
      this.dateNaiss=dateNaiss;
     //Initialisé ID
       this.age=calculAge();

    }

      public Personne (){
        //Initialisé ID
    }

   //Getters and Setters
 	public String getNomComplet(){
		return this.nomComplet;
	}

	public void setMatieres(String nomComplet){
		this.nomComplet=nomComplet;
	}
	public LocalDate getDateNaiss(){
		return this.dateNaiss;
	}

	public void setDateNaiss(LocalDate dateNaiss){
		this.dateNaiss=dateNaiss;
	}

	public int getAge(){
		return this.age;
	}
	public int getId(){
		return this.id;
	}

   //redefinition de la methode affiche()

    @Override
    public String affiche(){
       return "Id: "+id+" Nom et Prenom : "+nomComplet;
    }

   private int calculAge(){
	
	
      return 0;
   }

}