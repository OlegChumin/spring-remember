package spring_introduction_4_2_prototype;

public class Person {
    private String surName;
    private int age;
    private Pet pet;

    public Person() {
        System.out.println("Person bean is created");
    }

    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        System.out.println("Class Person: set surName");
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
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
