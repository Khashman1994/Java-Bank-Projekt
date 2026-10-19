
// Repräsentiert eine Überweisung von einem Sender an einen Empfänger
package Bank;

public class Transfer extends Transaction {

    //Attributes
    private String sender, recipient;

    //getMethods
    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }
    //SetMethods
    public void setSender(String sender) {
        this.sender = sender;
    }
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    // Bei Überweisungen dürfen nur positive Beträge gesetzt werden
    @Override
    public void setAmount(double amount) {
    if (amount > 0) {
        super.setAmount(amount);
    } else {
        System.out.println("Fehler: Bei einer Überweisung sind nur positive Beträge erlaubt!");
    }
}
// Konstruktor für die Grunddaten

    public Transfer() {
    }
    public Transfer(String date,  double amount,String description) {
        super(date,  amount, description);
       
    }

    // Hauptkonstruktor: Nutzt den Grundkonstruktor über this() wieder
     public Transfer(String date, double amount, String description, String sender, String recipient) {
        this(date, amount, description);
        setSender(sender);
        setRecipient(recipient);
    }

    //copy constructor
    public Transfer(Transfer other) {
    super(other); // Kopiert date, amount, description
    if (other != null) {
        this.sender = other.sender;
        this.recipient = other.recipient;
    }
}
//printObject
@Override 
public void printObject() {
    super.printObject();
    System.out.println("Sender: " + sender);
    System.out.println("Recipient: " + recipient);
}

}