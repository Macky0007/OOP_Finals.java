public class AdoptionRecord {
    private String adoptionDate;
    private Adopter adopter;
    private Animal animal;
    
    public AdoptionRecord(String adoptionDate, Adopter adopter, Animal animal) {
        this.adoptionDate = adoptionDate;
        this.adopter = adopter;
        this.animal = animal;
    }
    
    @Override
    public String toString() {
        return "Date: " + adoptionDate + 
               " | Adopter: " + adopter.getName() + 
               " | Animal: " + animal.getName() + 
               " (" + animal.getSpecies() + ")" +
               " | ID: " + animal.getAnimalID();
    }
}
