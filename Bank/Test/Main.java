package Test;

import Bank.Transfer;
import Bank.Payment;


public class Main {
  public static void main(String[] args) {
       System.out.println("--- Test: Payment ---");
        // 1. Teil-Konstruktor
        Payment p1 = new Payment("19.10.2026", 500.0, "Gehalt");
        p1.printObject();

        System.out.println();

        // 2. Voll-Konstruktor
        Payment p2 = new Payment("19.10.2026", -50.0, "Einkauf", 0.02, 0.05);
        p2.printObject();

        System.out.println();

        // 3. Copy-Konstruktor
        Payment p3 = new Payment(p2);
        p3.printObject();


        System.out.println("\n--- Test: Transfer ---");
        // 1. Teil-Konstruktor
        Transfer t1 = new Transfer("19.10.2026", 100.0, "Miete");
        t1.printObject();

        System.out.println();

        // 2. Voll-Konstruktor
        Transfer t2 = new Transfer("19.10.2026", 200.0, "Geschenk", "Max", "Anna");
        t2.printObject();

        System.out.println();

        // 3. Copy-Konstruktor
        Transfer t3 = new Transfer(t2);
        t3.printObject();


        System.out.println("\n--- Test: Validierung & Fehlerfälle ---");
        
        // Ungültige Zinsen testen (muss Fehler auf Konsole ausgeben)
        Payment pFehler = new Payment();
        pFehler.setIncomingInterest(1.5);
        pFehler.setOutgoingInterest(-0.2);

        // Ungültigen Betrag bei Transfer testen (muss Fehler auf Konsole ausgeben)
        Transfer tFehler = new Transfer();
        tFehler.setAmount(-100.0);
        tFehler.setAmount(0.0);
    }
    
}

