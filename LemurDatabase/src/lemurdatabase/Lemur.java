
package lemurdatabase;
/**
 * @title LemurDatabase
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 20-May-2015 12:02:39 PM
 * @purpose The purpose of this program is to emulate 3 types of lemurs
 */
public class Lemur extends Mammal {
    //declear veribles
    String location,coat,classified,dominant,groom;
    public Lemur(){
                //set info for all lemurs

        location="Madagascar";
        coat="Fur";
        classified="Prosimians";
        groom="Using their teeth as a comb";
        dominant="Female";
    }
    public String toString() {
                //add generic info about lemurs to the output

        String output ="";
        output+=super.toString();
        output+="\nLocation: "+location+"\nCoat: "+coat+"\nClassification: "+classified+"\nGroomed: "+groom+"\nDominant Role: "+dominant;
        return output;
    }
}
