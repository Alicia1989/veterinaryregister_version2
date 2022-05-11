//This class is to get the information about the pet ownwer, 

/**
 *
 * @author Alicia
 */
public class Person {

    private String ownerName;
    private String ownerAddress;

    //setters

    /**
     *
     * @param ownerName
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     *
     * @param ownerAddress
     */
    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    //Getters

    /**
     *
     * @return
     */
    public String getOwnerName() {
        return this.ownerName;
    }

    /**
     *
     * @return
     */
    public String getOwnerAddress() {
        return this.ownerAddress;
    }
    /**
     *
     * @return
     */
    public String getData() {
        String data = "Owner Name: " + ownerName
             
                + " Address: " + ownerAddress;
        return data;
    }
}
