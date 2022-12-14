public class main {
   public static void main(String[] args) {
       Personne p = new Personne("Doe", "John", 25);
       Adherant a = new Adherant("Doe", "John", 25, "123456");
       p.afficher();
       a.afficher();
   } 
}
