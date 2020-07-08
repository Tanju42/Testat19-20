// Prüfung Programmieren-1-Praktikum Wintersemester 2019/2020

// Name:
// Matrikelnummer:

package testat;

public class Kamera {
    String kameraTyp;   // Kamerabezeichnung
    int anzPixel;       // Anzahl Pixel in Mega-Pixel
    
    Objektiv obj=null;  // Referenz auf ein Objekt vom Typ Objektiv
                        // Der Wert null bedeutet, dass kein Objektiv montiert ist
    
    // Vervollständigen Sie den Konstruktor "Kamera(String kameraTyp, int anzPixel)":
    // Dieser soll die übergebenen Werte den entsprechenden Membervariablen zuweisen
    Kamera(String kameraTyp, int anzPixel){
        this.kameraTyp = kameraTyp;
        this.anzPixel = anzPixel;
    }
    
    // Vervollständigen Sie die Methode "objektiv_montieren(Objektiv obj)":
    // Diese soll Methode die übergebene Objektreferenz "obj" der Membervariablen "obj" zuweisen
    // Falls bereits ein Objektiv montiert ist (Membervariable obj ungleich "null"),
    // soll die Meldung "Es ist bereits ein Objektiv montiert!" ausgegeben werden. 
    // Andernfalls sollen die Daten des Objektivs ausgegeben werden.
    // 
    // Hinweis: Um die Daten des Objektivs ausgeben zu können, müssen in der
    // Klasse "Objektiv" geeignete Methoden implementiert werden.
    void objektiv_montieren(Objektiv obj){
        if (this.obj != null) {
            System.out.println("Es ist bereits ein Objektiv montiert!");
            return;
        }
        this.obj = obj;
        this.obj.print();
    }
    
    // Vervollständigen Sie die Methode "objektiv_entfernen()":
    // Diese soll das an der Kamera montierte Objektiv entfernen und vorher
    // die Daten des zu entfernenden Objektivs ausgeben.
    // Falls kein Objektiv montiert ist (Membervariable "obj" gleich null),
    // soll die Meldung "Kein Objektiv montiert" ausgegeben werden. 
    void objektiv_entfernen(){
        if (obj == null) {
            System.out.println("Kein Objektiv montiert");
            return;
        }
        System.out.println("Folgendes Objektiv wurde entfernt:");
        this.obj.print();
        this.obj = null;
    }
    
    // Vervollständigen Sie die Methode "print()":
    // Diese soll die Daten der Kamera und die Daten des montierten Objektivs
    // ausgeben. Falls kein Objektiv montiert ist, soll  
    // die Meldung "Kein Objektiv montiert" ausgegeben werden.   
    void print(){
        System.out.println("Kamerabezeichnung: "+this.kameraTyp);
        System.out.println("Anzahl Pixel in Mega-Pixel: "+this.anzPixel+"MB");
        if (obj == null) {
            System.out.println("Kein Objektiv montiert");
            return;
        }
        this.obj.print();
    }
}
