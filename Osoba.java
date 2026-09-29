public class Osoba {
    // Atributi (osobine koje klasa ima)
    String ime;
    String prezime;
    int godine;

    // Konstruktor (stvara novu osobu)
    public Osoba(String ime, String prezime, int godine) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
    }

    // Metoda (šta osoba može da uradi - npr. da ispiše podatke)
    public void ispisiInformacije() {
        System.out.println("Osoba: " + ime + " " + prezime + ", Godine: " + godine);
    }
}