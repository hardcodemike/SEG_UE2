package zahlenraten;

import javax.swing.*;
import java.util.Random;

public class ZahlenratenMitWhile {
    public static void main(String[] args) {
        int min = 1, max = 10;

        Random rnd = new Random();


        int zufallszahl = rnd.nextInt(max - min + 1) + min;
        int i = 0;
//        while (i < 3) {
//            int zz2 = Integer.parseInt(JOptionPane.showInputDialog(null, "gebe eine Zahl zwischen 1 und 10 ein"));
//            if (zz2 == zufallszahl) {
//                System.out.println("Zahl erraten");
//                break;
//            } else {
//                i++;
//                if (i > 2) {
//                    System.out.println("keine Übereinstimmung mit der Zufallszahl: " + zufallszahl + "! Alle Versuche aufgebraucht!");
//
//                } else {
//                    System.out.println("keine übereinstimmung mit der Zufallszahl.noch " + (3 - i) + " Versuche übrig.");
//                }
//            }
//        }

        do{
            int zz2 = Integer.parseInt(JOptionPane.showInputDialog(null, "gebe eine Zahl zwischen 1 und 10 ein"));
            if (zz2 == zufallszahl) {
                System.out.println("Zahl erraten");
                break;
            } else {
                i++;
                if (i > 2) {
                    System.out.println("keine Übereinstimmung mit der Zufallszahl: " + zufallszahl + "! Alle Versuche aufgebraucht!");
                } else {
                    System.out.println("keine übereinstimmung mit der Zufallszahl.noch " + (3 - i) + " Versuche übrig.");
                }
            }
        }while(i<3);
    }
}
