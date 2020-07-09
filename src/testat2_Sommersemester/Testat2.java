// Name:        
// Matr.-Nr.:   

package testat2_Sommersemester;

public class Testat2 {    
    // Die main-Methode ist bereits vollständig implementiert
    public static void main(String[] args) {
        Testat2 t = new Testat2();
        t.run();
    }
    
    // Die Methode "run" ist bereits vollständig implementiert
    void run(){
        // Nachfolgend werden zwei verkettete Listen (list1 und list2) erstellt.
        Node list1 = createList(3,1);
        Node list2 = createList(6,4);
        
        System.out.println("---- list1 nach dem Erstellen der Liste -----");
        printList(list1);
        
        System.out.println();
        System.out.println("---- list2 nach dem Erstellen der Liste -----");
        printList(list2);
        
        System.out.println();
        System.out.println("---- Entfernen der vordersten Node aus list1 -----");
        list1=removeNode(list1);
        
        System.out.println();
        System.out.println("---- list1 nach dem Entfernen der vordersten Node -----");
        printList(list1);
        
        appendList(list1, list2);
        System.out.println();
        System.out.println("---- list1 nach dem Anhängen von list2 -----");
        printList(list1);
    }
    
    // Methode "printList" vervollständigen:
    // Diese Methode soll die Daten aller in der übergebenen Liste enthaltenen Nodes 
    // unter Verwendung der Methode "printData" der Klasse "Node" ausgeben.
    void printList(Node list){
        while(list != null) {
            list.printData();
            list = list.next;
        }
    }

    // Methode "removeNode" implementieren:
    // Diese Methode soll eine verkettete Liste entgegen nehmen,
    // aus dieser die vorderste Node entfernen und die veränderte Liste 
    // zurückgeben.
    // Zudem soll die Methode den Wert der Membervariablen "id" der Node, die
    // entfernt wird, ausgeben (s. Aufgabenblatt)
    // Wenn die Liste keine Nodes enthält, soll sie "null" zurückgeben
    Node removeNode(Node list) {
        if (list == null) {
            System.out.println("Nothing to remove");
            return null;
        }
        System.out.println("Entfernte ID: "+list.getId());
        list = list.next;
        return list;
    }
                
    
    
    
    
    
    // Methode "appendList" vervollständigen:
    // Diese Methode soll die Liste "list2" an das Ende der Liste "list1"
    // anhängen. Zusätzlich soll der Fall, daß die Liste "list1" leer ist,
    // abgefangen und eine Meldung "list1 ist leer" ausgegeben werden.
    void appendList(Node list1, Node list2) {
        if (list1 == null) {
            System.out.println("list1 ist leer");
            return;
        }
        Node iterator = list1;
        while (iterator.next != null) {
            iterator = iterator.next;
        }
        iterator.next = list2;
    }
    
    // Die Methode "createList" ist bereits vollständig implementiert
    // Diese Methode erstellt eine verkettete Liste
    Node createList(int m, int n){
       Node list=null;
       for(int i=m;i>=n;i--){
           Node neuerNode = new Node(i, i*i);
           neuerNode.next=list;
           list=neuerNode;
       }
       return list;
    }
}
