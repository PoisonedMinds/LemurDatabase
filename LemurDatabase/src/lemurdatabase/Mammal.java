package lemurdatabase;
import javax.swing.*;
/**
 * @title LemurDatabase
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 20-May-2015 12:02:39 PM
 * @purpose The purpose of this program is to emulate 3 types of lemurs
 */
public class Mammal {
        //declear veribles

  private int itsAge;
  private int itsWeight, itsGender;
  private String breed,gender;
  private String buttons[]={"Male", "Female"};

  public Mammal() {
      //randomsly generate age weight and gender
    itsAge = (int)(Math.random()*15+1);
    itsWeight = (int)(Math.random()*6+1);
    itsGender = (int)(Math.random()*2+1);
    
  }
//methods for getting and setting age weight and gender
  public int getAge() {
    return itsAge;
  }

  public int getWeight() {
    return itsWeight;
  }
  
  public int getGender() {
      return itsGender;
  }

  public void setAge(int newAge) {
    itsAge = newAge;
  }

  public void setWeight(int newWeight) {
    itsWeight = newWeight;
  }
  

  public void setGender() {
      itsGender=JOptionPane.showOptionDialog(null, "What gender would you like to set the lemur to?", "Gender", JOptionPane.PLAIN_MESSAGE, 3, null, buttons, buttons[0]);
  }


  public String toString() {
      //add generic info about the mammal to the output
      if (itsGender==0) {
          gender="Male";
      } else {
          gender="Female";
      }
    String output="Age: "+itsAge+"\nWeight: "+itsWeight+" lbs\nGender: "+gender;


  return output;
  }
}