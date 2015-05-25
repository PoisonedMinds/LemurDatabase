/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lemurdatabase;

/**
 *
 * @author Steven Biro
 */
public class JungleLemur extends Lemur {
    String coat,mane,pack,food;
    public JungleLemur() {
        coat="Blue or Black";
        mane="No Mane";
        pack="Small Groups";
        food="Mice, Snails, and Insects";
       
    }
    public String toString() {
         String output="Jungle Lemur:\n";
                output+=super.toString();
                output+="\nColour: "+coat+"\nMane: "+mane+"\nPack Size: "+pack+"\nFood: "+food;
                return output;
    }
}
