// Name:        
// Matr.-Nr.:   

package testat2_Sommersemester;

public class Node {
    private int id;
    private int value;
    Node next;
    
    // Folgende Methoden in dieser Klassen sollen implementiert werden:
    
    // 1. Implementieren Sie einen Konstruktor, welcher zwei int-Werte 
    // entgegen nehmen kann. Der Konstruktor soll den ersten übergebenen Wert der 
    // Membervariablen "id" und den zweiten der Membervariablen "value" zuweisen.
    
    // 2. Implementieren Sie eine Methode "printData", welche die Membervariablen 
    // "id" und "value" ausgibt in der Art wie auf dem Aufgabenblatt angegeben.
    
    // 3. Implementieren Sie eine Methode "getId", welche die Membervariable "id" zurückgibt
    
    Node(int id, int value) {
        this.id = id;
        this.value = value;
    }

    void printData() {
        System.out.println("ID: "+id+", Value: "+value);
    }

    int getId() {
        return id;
    }
               
}
