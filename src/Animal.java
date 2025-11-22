public class Animal {
        public String name;
        public String species;
        public int age;
        private String animalID;
        private boolean isMale = true;

        public Animal(String name, String species, int age, String animalID, boolean isMale){
            this.name = name;
            this.species = species;
            this.age = age;
            this.animalID = animalID;
            this.isMale = isMale;
        }
        public String toString(){
            return species + "," + name + "," + age + "," + isMale;
        }
    }

    //Classes of different species of animal as an implementation of Inheritance
    class Dog extends Animal{
        public Dog(String name, int age, String animalID, boolean isMale){
            super(name, "Dog", age, animalID, isMale);
        }

    }

    class Cat extends Animal{
        public Cat(String name, int age, String animalID, boolean isMale){
            super(name, "Cat", age, animalID, isMale);
        }
    }

    class Hamster extends Animal{
        public Hamster(String name, int age, String animalID, boolean isMale){
            super(name, "Hamster", age, animalID, isMale);
        }
    }

    class Rabbit extends Animal{
        public Rabbit(String name, int age, String animalID, boolean isMale){
            super(name, "Rabbit", age, animalID, isMale);
        }
}
