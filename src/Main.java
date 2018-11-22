import com.sun.codemodel.internal.JOp;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("name einlesen");
        int alter = Integer.parseInt(JOptionPane.showInputDialog("alter einlesen"));

        if (alter > 17) {
            JOptionPane.showMessageDialog(null, name + " ist volljaehrig");

        } else {
            JOptionPane.showMessageDialog(null, name + " ist nicht volljaehrig");
        }

    }
}
