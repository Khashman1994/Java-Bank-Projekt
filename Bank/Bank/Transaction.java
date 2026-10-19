// Basisklasse für alle Transaktionen (Ein-/Auszahlungen und Überweisungen)
package Bank;
public class Transaction {
    // Datum im Format DD.MM.YYYY
    private String date,

    // Beschreibung

            description;

    // Geldbetrag
    private double amount;

    /**
     * 2. Wie ist ein Copy-Konstruktor aufgebaut?
     * Ein Copy-Konstruktor zeichnet sich durch zwei Merkmale aus:
     *
     * Er hat denselben Namen wie die Klasse.
     *
     * Er nimmt ein Objekt derselben Klasse als Parameter entgegen.
     * Quelle; Gemini, https://www.gemini.de/lexikon/copy-konstruktor#:~:text=Ein%20Copy%2DKonstruktor%20zeichnet%20sich,als%20Parameter%20entgegen.
     */

    public Transaction() {
    }
    //Copy-Konstruktor: Erstellt ein Duplikat einer bestehenden Transaktion
   public Transaction(Transaction other) {
        this.date = other.date;
        this.description = other.description;
        this.amount = other.amount;
    }
    // Konstruktor zur Initialisierung der Grunddaten
    public Transaction(String date,  double amount,String description) {
        this.date = date;
        this.amount = amount;
        this.description = description;
        
    }
    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    //PrintObject
    public void printObject() {
    System.out.println("Date: " + date);
    System.out.println("Amount: " + amount);
    System.out.println("Description: " + description);
}
}
