class Personne{
   private String nom;
    private String prenom;
    private int age;
    public Personne(String nom, String prenom, int age){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    public void afficher(){
        System.out.println("Nom : " + nom + " Prenom : " + prenom + " Age : " + age);
    }
}
class Adherant extends Personne{
    private String numadhérant;
    public Adherant(String nom, String prenom, int age, String numadhérant)
    {
        super(nom, prenom, age);
        this.numadhérant = numadhérant;
    }
    public void afficher(){
        super.afficher();
        System.out.println("Numéro d'adhérant : " + numadhérant);
    }
    

     }
     class Auteur extends Personne{
            private String numAuteur;
            public Auteur(String nom, String prenom, int age, String numAuteur){
                super(nom, prenom, age);
                this.numAuteur = numAuteur;
            }
            public void afficher(){
                super.afficher();
                System.out.println("Numéro d'auteur : " + numAuteur);
            }
            
     }
     

  




