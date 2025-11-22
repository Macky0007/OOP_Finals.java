public class Adopter{

    public String adopterName;
    public int adopterAge;
    public String adopterContact;
    public Animal adoptedAnimal;
    private String adopterAddress;

    public Adopter(String adopterName, int adopterAge,String adopterContact, Animal adoptedAnimal, String adopterAddress){
        this.adopterName = adopterName;
        this.adopterAge = adopterAge;
        this.adopterContact = adopterContact;
        this.adoptedAnimal = adoptedAnimal;
        this.adopterAddress = adopterAddress;
    }

    public String toString(){
        return adopterName + "," + adopterAge + "," + adopterContact + "," + adoptedAnimal;
    }
}
