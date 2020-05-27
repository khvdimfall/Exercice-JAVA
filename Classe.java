public class Classe implements IInscription{

   //Auto généré
    private int id;
    private String nom;

    //Propriété navigationnelle
	private Etudiant etud;
     private ArrayList<Etudiant> etuClasse= new ArrayList<Etudiant>();;
     private ArrayList<Professeur> profClasse= new ArrayList<Professeur>();;

   //Getters and Setters

	public int getId(){
		return this.id;
	}
	public String getNom(){
		return this.nom;
	}

	public void setNom(String nom){
		this.nom=nom;
	}

   //redefinition de la methode affiche()

    @Override
    public String affiche(){
       return "Id: "+id+" Nom : "+nom;
    }

    public void inscrire(Etudiant etud){
	this.etuClasse.add(etud);
	
	
	}

}