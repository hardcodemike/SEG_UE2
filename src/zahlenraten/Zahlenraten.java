package zahlenraten;

import javax.swing.*;
import java.util.Random;

public class Zahlenraten {
    public static void main(String[] args) {
        int min = 1, max = 10;

        Random rnd = new Random();




        int zufallszahl = rnd.nextInt(max - min + 1) + min;

//        if(zufallszahl%2 == 0){
//            System.out.println(zufallszahl + " ist gerade");
//        }else{
//            System.out.println(zufallszahl + " ist ungerade");
//        }

        for (int i =0; i<3;i++) {
            int zz2 = Integer.parseInt(JOptionPane.showInputDialog(null, "gebe eine Zahl zwischen 1 und 10 ein"));
            if (zz2 == zufallszahl) {
                System.out.println("Zahl erraten");
                break;

           } else if ((zz2 - zufallszahl) >= -2 && (zz2 - zufallszahl) <= 2) {  //Aufgabe3
                System.out.println("innerhalb der range +-2");
            } else {
                if(i==2) {
                    System.out.println("keine übereinstimmung mit der Zufallszahl. alle 3 versuche fehlgeschlagen");

//                    System.out.println("zufallszahl: " + zufallszahl);
//                    System.out.println(zz2 - zufallszahl);
                }
            }
        }
    }
}
