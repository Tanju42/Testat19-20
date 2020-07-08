// Prüfung Programmieren-1-Praktikum Wintersemester 2019/2020

// Name:
// Matrikelnummer:

package testat;

import java.util.Scanner;

public class Testat {
    Scanner kbdInput = new Scanner(System.in);
    
    // Die main-Methode ist bereits vollständig implementiert
    public static void main(String[] args) {
        Testat test = new Testat();
        test.operate();
    }

    // Die Methode "operate()" ist bereits vollständig implementiert
    void operate() {
        char cmd;

        System.out.print("\nOptionen: p = Passwortsicherheit prüfen, k = Kameraset erstellen: ");
        cmd = kbdInput.next().charAt(0);

        switch (cmd) {
            case 'p':
                // zu Teil1:
                System.out.print("Bitte geben Sie ein Passwort ein: ");
                
                String password = kbdInput.next();

                if (checkPassword(password)) {
                    System.out.print("Das Passwort erfüllt die Sicherheitskriterien!");
                } else {
                    System.out.print("Das Passwort ist nicht sicher!");
                }
                break;
            case 'k':
                // zu Teil2:
                kameraset_erstellen();
                break;
        }
        System.out.println();
    }
    
    // zu Teil1:
    // Vervollständigen Sie die Methode "checkPassword(String pwd)":
    // Die Methode soll "true" zurückgeben, wenn der übergebene String
    // unten stehende Kriterien erfüllt. Ansonsten soll sie "false" zurückgeben.
    // - Das Passwort enthält mindestens 8 Zeichen
    // - Das Passwort enthält mindestens einen Groß- und einen Kleinbuchstaben
    // - Das Passwort enthält mindestens zwei Ziffern
    //
    // Die Prüfung auf Großbuchstaben, Kleinbuchstaben und Ziffern kann mit folgenden 
    // Methoden der Klasse "Character" durchgeführt werden:
    // - "Character.isUpperCase(aChar)": gibt "true" zurück, wenn "aChar" ein Großbuchstabe ist, sonst false
    // - "Character.isLowerCase(aChar)": gibt "true" zurück, wenn "aChar" ein Kleinbuchstabe ist, sonst false
    // - "Character.isDigit(aChar)": gibt "true" zurück, wenn "aChar" eine Ziffer ist, sonst false
    // (vergleichbar wie in der Übungsaufgabe 6 "Palindrom" => "Character.isAlphabetic(aChar)" 
    boolean checkPassword(String pwd) {
        if (pwd.length() < 8) { // - Das Passwort enthält mindestens 8 Zeichen
            return false;
        }
        //####
        boolean großbuchstaben = false;
        boolean kleinbuchstaben = false;
        int zahl = 0;
        for (char ch : pwd.toCharArray()) { // - Das Passwort enthält mindestens einen Groß- und einen Kleinbuchstaben
            if (Character.isUpperCase(ch)) {
                großbuchstaben = true;
            }
            if (Character.isLowerCase(ch)) {
                kleinbuchstaben = true;
            }
            if (Character.isDigit(ch)) { // - Das Passwort enthält mindestens zwei Ziffern
                zahl++;
            }
            if (großbuchstaben && kleinbuchstaben && zahl >= 2) {
                break;
            }
        }
        if (!großbuchstaben || !kleinbuchstaben || zahl < 2) {
            return false;
        }
        return true;
    }

    // Die Methode "kameraset_erstellen()" ist bereits vollständig implementiert
    void kameraset_erstellen(){
        Kamera meineKamera=new Kamera("Nikon D7100", 24);
        Objektiv[] objektive=new Objektiv[3];
        objektive[0] =  new Objektiv("Weitwinkel", 10);
        objektive[1] =  new Objektiv("Zoom", 300);
        objektive[2] =  new Objektiv("Festbrennweite", 35);
        
        char cmd='x';
        
        while(cmd!='q'){
            System.out.println("\nWas möchten Sie tun? Eingabe + , - , p oder q");
            System.out.println("+  Objektiv montieren / - Objektiv entfernen / p Kameraset ausgeben / q beenden");
            System.out.print("Ihre Eingabe: ");
            cmd = kbdInput.next().charAt(0);
            
            switch (cmd) {
                case '+':
                    int objektiv_auswahl = objektiv_auswaehlen(objektive);
                    meineKamera.objektiv_montieren(objektive[objektiv_auswahl-1]);
                    System.out.println();
                    break;
                case '-':
                    meineKamera.objektiv_entfernen();
                    break;   
                case 'p':
                    meineKamera.print();
                    break;
                case 'q':
                    return;
            }
        }
    }
    
    // Die Methode "objektiv_auswaehlen(...)" ist bereits vollständig implementiert
    int objektiv_auswaehlen(Objektiv[] objektive){
        System.out.println("Folgende Objektive stehen zur Auswahl: ");
        for(int i=0; i<objektive.length;i++){
            System.out.print(i+1 + ": ");
            objektive[i].print();
        }
        System.out.print("Eingabe 1,2 oder 3: ");
        return kbdInput.nextInt();
    }
}