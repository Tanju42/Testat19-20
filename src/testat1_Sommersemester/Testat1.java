//Name:
//Matr.-Nr.:
package testat1_Sommersemester;

public class Testat1 {
 
    public static void main(String[] args) {
        int[] numbers1 = {-8,5,4,7,-1,3};
        int[] numbers2 = {-3,5,8,6,8};
        int[] numbers3 = {4,9,8,-5,1,-3,2};
        
        
        System.out.print("Werte des Arrays 'numbers1': ");
        printIntArray(numbers1);
        System.out.print("Werte des Arrays 'numbers2': ");
        printIntArray(numbers2);
        System.out.print("Werte des Arrays 'numbers3': ");
        printIntArray(numbers3);
        
        // ---- Teil1 ----
        System.out.println("---- Teil1 ----");
        // Methode "subtract" aufrufen mit Übergabe der Arrays "numbers1" und "numbers2"
        subtract(numbers1, numbers2);
                    
        
        
        System.out.print("Werte des Arrays 'numbers1' nach Aufruf der Methode 'subtract': ");
        printIntArray(numbers1);
        
        
        // ---- Teil2 ----
        System.out.println("---- Teil2 ----");
        // Methode 'check_for_duplicates' aufrufen mit Übergabe des Arrays 'numbers2'
        // Wenn die Methode den Wert 0 zurückgibt, soll
        // die Meldung "numbers2: keine Dublikate vorhanden" ausgegeben werden.
        // Bei allen anderen Rückgabewerten soll die Meldung
        // "numbers2: Duplikate vorhanden" ausgegeben werden
        if (check_for_duplicates(numbers2) == 0) {
            System.out.println("numbers2:keine Duplikate vorhanden");
        } else {
            System.out.println("numbers2:Duplikate vorhanden");
        }
                    
        
        // ---- Teil3 ----
        System.out.println("---- Teil3 ----");
        // Methode 'check_for_duplicates' aufrufen mit Übergabe des Arrays 'numbers3'
        // Hier sollen die gleichen Meldungen ausgegeben werden wie unter Teil2,
        // nur bezogen auf Array "numbers3"
        if (check_for_duplicates(numbers3) == 0) {
            System.out.println("numbers3:keine Duplikate vorhanden");
        } else {
            System.out.println("numbers3:Duplikate vorhanden");
        }
                   
    }
    
    
    // Vervollständigen Sie die Methode: "subtract":
    // Diese soll die Werte des Arrays "values2" von den Werten
    // des Arrays "values1" abziehen und das Ergebnis im  
    // Array "values1" speichern
    // Wenn die Arrays unterschiedlich viele Elemente besitzen, soll die
    // Methode eine Meldung ausgeben: "Arrays sind unterschiedlich lang"
    // In diesem Fall sollen nur so viele Werte subtrahiert werden,
    // wie das kleinere Array Elemente besitzt.
    static void subtract(int[] values1, int[] values2){
        if (values1.length != values2.length) {
            System.out.println("Arrays sind unterschiedlich lang");
        }
        for (int i = 0; i < values1.length && i < values2.length; i++) {
            values1[i] = values1[i] - values2[i];
        }
    }
    
    // Vervollständigen Sie die Methode: "check_for_duplicates"
    // Diese Methode soll prüfen, ob Duplikate im übergebenen Array 
    // vorhanden sind (z.B. zweimal der Wert 3). Wenn keine Duplikate vorhanden 
    // sind, dann soll die Methode den Wert 0 zurückgeben.
    // Wenn Duplikate vorhanden sind, soll sie einen Wert ungleich 0 zurückgeben.
    static int check_for_duplicates(int[] values){
        for (int x = 0; x < values.length; x++) {
            for (int i = 0; i < values.length; i++) {
                if (x != i) {
                    if (values[x] == values[i]) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
    
    
    // Ausgabe der Arrayelemente
    // Methode "printIntArray" ist bereits komplett implementiert
    static void printIntArray(int[] nums) {
        for (int i = 0; i < nums.length; i = i + 1) {
            System.out.printf("%3d",nums[i]);
        }
        System.out.println();
    }
}
