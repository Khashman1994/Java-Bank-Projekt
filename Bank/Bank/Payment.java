// Repräsentiert Ein- und Auszahlungen inklusive Zinsangaben
package Bank;
public class Payment extends Transaction {

    // Zinsen bei Ein-und Auszahlungen (Wert zwischen 0.0 und 1.0)
    private double incomingInterest, 
                    outgoingInterest;

    // Setter mit Überprüfung für Einzahlungszinsen (0 % bis 100 %)
    public void setIncomingInterest(double incomingInterest) {
         if (incomingInterest >= 0.0 && incomingInterest <= 1.0) {
        this.incomingInterest = incomingInterest;
       
        } else {
        System.out.println("Fehler: Zinsen müssen zwischen 0 und 1 liegen!");
    }
    }

    // Setter mit Überprüfung für Auszahlungszinsen (0 % bis 100 %)
    public void setOutgoingInterest(double outgoingInterest) {
    if (outgoingInterest >= 0.0 && outgoingInterest <= 1.0) {
        this.outgoingInterest = outgoingInterest;
        
    } else {
        System.out.println("Fehler: Zinsen müssen zwischen 0 und 1 liegen!");
    }
}
    
    public double getIncomingInterest() {
        return incomingInterest;
    }
    public double getOutgoingInterest() {
        return outgoingInterest;
    }
    public Payment() {
    }
    // Konstruktor für die Grunddaten
    public Payment(String date,  double amount,String description) {
        super(date,  amount, description);
       
    }
    // Hauptkonstruktor: Wiederverwendung des Grundkonstruktors über this()
    public Payment(String date,  double amount,String description, double incomingInterest, double outgoingInterest) {
        this(date, amount, description);
       setIncomingInterest(incomingInterest);
       setOutgoingInterest(outgoingInterest);
    }

    //copy constructor
    public Payment(Payment other) {
    super(other); // Kopiert date, amount, description
    if (other != null) {
        this.incomingInterest = other.incomingInterest;
        this.outgoingInterest = other.outgoingInterest;
    }
}

//printObject
@Override 
public void printObject() {
    super.printObject();
    System.out.println("Incoming Interest: " + incomingInterest);
    System.out.println("Outgoing Interest: " + outgoingInterest);
}

}