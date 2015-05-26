
package lemurdatabase;

/**
 * @title LemurDatabase
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 20-May-2015 12:02:39 PM
 * @purpose The purpose of this program is to emulate 3 types of lemurs
 */
public class TreeLemur extends Lemur {
    //declear varibles
    String pack,food,mane;
    public TreeLemur() {
        //set info for lemur
        pack="Large Groups";
        food="Fruit";
        mane="Red";
    }
    public String toString() {
        //add info about this type of lemur to the output
        String output="Tree Lemur:\n";
                output+=super.toString();
                output+="\nPack Size: "+pack+"\nFood: "+food+"\nColour: "+mane;
                return output;
    }
}
