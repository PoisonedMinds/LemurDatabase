package lemurdatabase;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 * @title LemurDatabase
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 20-May-2015 12:02:39 PM
 * @purpose The purpose of this program is to emulate 3 types of lemurs
 */
public class LemurDatabase {

    public static void main(String[] args) {
        //declear list of lemurs
        List<Lemur> Lemurs = new ArrayList();
        int type;
        //create buttons for the menu
        String buttons[] = {"Tree Lemur", "Jungle Lemur", "Desert Lemur"};
        int amount = Integer.parseInt(JOptionPane.showInputDialog("How many Lemurs would you like to add?"));
        while (amount > 0) {
            //create as many lemurs as the user wants of the type it wants
            type = JOptionPane.showOptionDialog(null, "What type of Lemur would you like to add?", "Type of Lemur", JOptionPane.PLAIN_MESSAGE, 3, null, buttons, buttons[0]);
            if (type == 0) {
                Lemurs.add(new TreeLemur());
            } else if (type == 1) {
                Lemurs.add(new JungleLemur());
            } else {
                Lemurs.add(new DesertLemur());
            }
            //continue until it all have been made
            amount--;
        }
        //print out the info of each lemur
        Lemurs.stream().forEach((Lemur) -> {
            System.out.println("\n" + Lemur.toString());
        });

    }

}
