
package lemurdatabase;

public class Lemur extends Mammal {
    String location,coat,classified,dominant,groom;
    public Lemur(){
        location="Madagascar";
        coat="Fur";
        classified="Prosimians";
        groom="Using their teeth as a comb";
        dominant="Female";
    }
    public String toString() {
        String output ="";
        output+=super.toString();
        output+="\nLocation: "+location+"\nCoat: "+coat+"\nClassification: "+classified+"\nGroomed: "+groom+"\nDominant Role: "+dominant;
        return output;
    }
}
