package lemurdatabase;
import javax.swing.*;

public class Mammal {
  private int itsAge;
  private int itsWeight, itsGender;
  private String breed,gender;
  private String buttons[]={"Male", "Female"};

  public Mammal() {
    itsAge = (int)(Math.random()*15+1);
    itsWeight = (int)(Math.random()*6+1);
    itsGender = (int)(Math.random()*2+1);
    
  }

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
  public String getBreed() {
    return breed;
  }

  public void setBreed(String newBreed) {
    breed = newBreed;
  }

  public String toString() {
      if (itsGender==0) {
          gender="Male";
      } else {
          gender="Female";
      }
    String output="Age: "+itsAge+"\nWeight: "+itsWeight+"\nGender: "+gender;


  return output;
  }
}