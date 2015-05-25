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
public class DesertLemur extends Lemur {
    String water,coat,babies;
    public DesertLemur() {
        water="Cacti";
        coat="White";
        babies="Two Thirds";
        
    }
    public String toString() {
         String output="Desert Lemur:\n";
                output+=super.toString();
                output+="\nWater Source: "+water+"\nColour: "+coat+"\nBaby Death Rate: "+babies;
                return output;
    }
    
}
