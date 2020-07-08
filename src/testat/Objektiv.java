// Prüfung Programmieren-1-Praktikum Wintersemester 2019/2020

// Name:
// Matrikelnummer:

package testat;

// zu Teil2
// Vervollständigen Sie die Klasse "Objetiv"
public class Objektiv {
    private String objektivTyp; 
    private int brennweite;     
    
    // Vervollständigen Sie den Konstruktor "Objektiv (String objektivTyp, int brennweite)":
    // Dieser soll die übergebenen Werte den entsprechenden Membervariablen zuweisen
    Objektiv(String objektivTyp, int brennweite){
        this.objektivTyp = objektivTyp;
        this.brennweite = brennweite;
    }
     
    // Implementieren Sie geeignete Methoden, damit die Methoden der 
    // Klasse "Kamera" die Daten des Objektivs ausgeben können.

    void print() {
        System.out.println("Objektiv: " + this.objektivTyp+", Brennweite: " + this.brennweite);
    }
}
