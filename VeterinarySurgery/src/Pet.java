
// Its extends from animal class so we dont have to write the variables again.

/**
 *we have use inheritence
  Animal class contains the variables and methods that are reused here in Pet class
  so we don't need to create methods and variables again
  cInheritance help us in code reusability.
 *
 * @author Alicia
 */
public class Pet extends Animal {
// This are the properties of the class Pet.
    private String petName;
    private String petGender;
    private int petAge;
    private String petColor;
    private String illness;

    //Constructor as the same name of the class
    /**
     *
     * @param petName
     * @param petGender
     * @param petAge
     * @param petColor
     * @param illness
     * @param animalType
     * @param dateOfRegistration
     */
    public Pet(String petName, String petGender, int petAge, String petColor, String illness, String animalType, String dateOfRegistration) {
        //On the super class we include animalType, dateOfRegistration to call the animal class and execute it.
        super(animalType, dateOfRegistration);
        this.petAge = petAge;
        this.petName = petName;
        this.petGender = petGender;
        this.illness = illness;
        this.petColor = petColor;
    }

    //List of Setters 
    /**
     *
     * The private members of the class cannot be access, that's why i created setters methods
    this is called abstraction
     * @param petName
     */

    public void setPetName(String petName) {
        this.petName = petName;
    }

    /**
     *
     * @param petGender
     */
    public void setGender(String petGender) {
        this.petGender = petGender;
    }

    /**
     *
     * @param petAge
     */
    public void setAge(int petAge) {
        this.petAge = petAge;
    }

    /**
     *
     * @param petColor
     */
    public void setPetColor(String petColor) {
        this.petColor = petColor;
    }

    /**
     *
     * @param illness
     */
    public void setIllness(String illness) {
        this.illness = illness;
    }

    //List of Getters

    /**
     *
     * @return
     */
    public String getPetName() {
        return this.petName;
    }

    /**
     *
     * @return
     */
    public String getPetGender() {
        return this.petGender;
    }

    /**
     *
     * @return
     */
    public int getPetAge() {
        return this.petAge;
    }

    /**
     *
     * @return
     */
    public String getPetColor() {
        return this.petColor;
    }

    /**
     *
     * @return
     */
    public String getIllness() {
        return this.illness;
    }
    //This class helps to get the values of the classes

    /**
     *
     * @return
     */
    public String getData() {
      
        
        String data = "Animal Type: " + getAnimalType()
                +"\n"
                + " Date: " + getRegistrationDate()
                 +"\n"
                + " Name: " + petName
                 +"\n"
                + " Gender: " + petGender
                 +"\n"
                + " Age: " + petAge
                 +"\n"
                + " Color: " + petColor
                 +"\n"
                + " Illness: " + illness;

        return data;
    }

}
