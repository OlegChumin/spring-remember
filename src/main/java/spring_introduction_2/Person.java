package spring_introduction_2;

public class Person {
    private Pet pet;

    public Person() {
        System.out.println("Person bean is created");
    }

    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public void setPet(Pet pet) { //pet -> setPet
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hallo, my lovely Pet!");
        pet.say();
    }
}
