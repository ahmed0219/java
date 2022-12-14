class Bibliothéque{
    public static void main(String[] args) {
        Adherant a = new Adherant("Doe", "John", 25, "123456");
       livre l = new livre(123456, "Le livre",new Auteur("Doe", "John", 25, "123456"));
       System.out.println( a.afficher());
       System.out.println(l.afficher1());
 }
}


