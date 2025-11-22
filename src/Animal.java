public class Animal {
        public String name;
        public int age;
        private String animalID;
        private boolean isMale = true;

        public Animal(String animalID, String name, int age, boolean isMale){
            this.name = name;
            this.age = age;
            this.animalID = animalID;
            this.isMale = isMale;
        }
        public String toString(){
            return animalID+ "," + name + "," + age + "," + isMale;
        }
    }

    //Classes of different species of animal as an implementation of Inheritance
    class Dog extends Animal{
        public Dog(String animalID, String name, int age, boolean isMale){
            super(animalID, name, age, isMale);
        }

    }

    class Cat extends Animal{
        public Cat(String animalID, String name, int age, boolean isMale){
            super(animalID, name, age, isMale);
        }
    }

    class Hamster extends Animal{
        public Hamster(String animalID, String name, int age, boolean isMale){
            super(animalID, name, age, isMale);
        }
    }

    class Rabbit extends Animal{
        public Rabbit(String animalID, String name, int age, boolean isMale){
            super(animalID, name, age, isMale);
        }
}
