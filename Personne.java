
class Personne {
    private String nom;
    private String prenom;
    private int age;

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    public String getNom() {
        return nom;
    }
 public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
     public String afficher() {
        return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
    }
}
class Adherant extends Personne {
   
    
    private String numadhérant;

    public Adherant(String nom, String prenom, int age, String numadhérant) {
        super(nom, prenom, age);
        this.numadhérant = numadhérant;
    }
    public String afficher() {
return "Numéro d'adhérant : " +" "+ numadhérant +" "+"nom"+" "+ getNom()+" "+"prenom"+" " +" "+ getPrenom()+" " + "age"+" "+getAge();
 }
}

class Auteur extends Personne {
    private String numAuteur;

    public Auteur(String nom, String prenom, int age, String numAuteur) {
        super(nom, prenom, age);
        this.numAuteur = numAuteur;
    }

    public String afficher() {
        return "Numéro auteur: " + numAuteur +"nom"+ getNom()+"prenom" + getPrenom() + "age"+getAge();
    }
}

class livre{
private int ISBN;
private String titre;
private Auteur auteur1;
private Auteur auteur2;
    private Auteur auteur3;
    private Auteur auteur4; 

  public livre(int ISBN, String titre, Auteur auteur1) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteur1 = auteur1;
    }
    
    public livre(int ISBN, String titre,Auteur auteur1,Auteur auteur2) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteur1 = auteur1;
        this.auteur2 = auteur2;
    }
    public livre(int ISBN, String titre, Auteur auteur1,Auteur auteur2,Auteur auteur3) {
        
        this.titre = titre;
        this.ISBN = ISBN;
        this.auteur1 = auteur1;
        this.auteur2 = auteur2;
        this.auteur3 = auteur3;
    }
    public livre(int ISBN, String titre, Auteur auteur1,Auteur auteur2,Auteur auteur3,Auteur auteur4) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteur1 = auteur1;
        this.auteur2 = auteur2;
        this.auteur3 = auteur3;
        this.auteur4 = auteur4;
    }
        public String afficher1() {
            return "livre [ISBN=" + ISBN + ", titre=" + titre + ", auteur1=" + auteur1.afficher() +  "]";
        }
        public String afficher2() {
            return "livre [ISBN=" + ISBN + ", titre=" + titre + ", auteur1=" + auteur1.afficher() + ", auteur2=" + auteur2.afficher()
                    +"]";
        }
        public String afficher3() {
            return "livre [ISBN=" + ISBN + ", titre=" + titre + ", auteur1=" + auteur1.afficher() + ", auteur2=" + auteur2.afficher()
                    +",auteur3=" + auteur3.afficher() + "]" ;}
        public String afficher4() {
             return "livre [ISBN=" + ISBN + ", titre=" + titre + ", auteur1=" + auteur1.afficher() + ", auteur2=" + auteur2.afficher()
               +", auteur3=" + auteur3.afficher() + ", auteur4=" + auteur4.afficher() + "]";
                    }
        
                }
    
    
