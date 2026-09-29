public class Sigma {
    public static void main(String[] args) {
        // Ovde pravimo objekat iz klase Osoba koju smo kreirali u drugom fajlu
        Osoba o1 = new Osoba("Pavle", "Tokin", 20);
        
        // Pozivamo metodu iz te klase da ispiše podatke
        o1.ispisiInformacije();
    }
}