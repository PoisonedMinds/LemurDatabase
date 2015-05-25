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
public class TreeLemur extends Lemur {
    String pack,food,mane;
    public TreeLemur() {
        pack="Large Groups";
        food="Fruit";
        mane="Red";
    }
    public String toString() {
        String output="Tree Lemur:\n";
                output+=super.toString();
                output+="\nPack Size: "+pack+"\nFood: "+food+"\nColour: "+mane;
                return output;
    }
}
