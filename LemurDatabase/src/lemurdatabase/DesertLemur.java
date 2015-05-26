package lemurdatabase;

/**
 * @title LemurDatabase
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 20-May-2015 12:02:39 PM
 * @purpose The purpose of this program is to emulate 3 types of lemurs
 */
public class DesertLemur extends Lemur {
    //declear varibles

    String water, coat, babies;

    public DesertLemur() {
        //set info for lemur

        water = "Cacti";
        coat = "White";
        babies = "Two Thirds";

    }

    public String toString() {
        //add info about this type of lemur to the output

        String output = "Desert Lemur:\n";
        output += super.toString();
        output += "\nWater Source: " + water + "\nColour: " + coat + "\nBaby Death Rate: " + babies;
        return output;
    }

}
