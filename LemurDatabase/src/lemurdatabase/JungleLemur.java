package lemurdatabase;

/**
 * @title LemurDatabase
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 20-May-2015 12:02:39 PM
 * @purpose The purpose of this program is to emulate 3 types of lemurs
 */
public class JungleLemur extends Lemur {
    //declear varibles

    String coat, mane, pack, food;

    public JungleLemur() {
        //set info for lemur

        coat = "Blue or Black";
        mane = "No Mane";
        pack = "Small Groups";
        food = "Mice, Snails, and Insects";

    }

    public String toString() {
        //add info about this type of lemur to the output

        String output = "Jungle Lemur:\n";
        output += super.toString();
        output += "\nColour: " + coat + "\nMane: " + mane + "\nPack Size: " + pack + "\nFood: " + food;
        return output;
    }
}
