package spring_introduction_8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private String surName;
    private int age;
    private Pet pet;

//    public Person() {
//        System.out.println("Person bean is created");
//    }

    @Autowired
    public Person(@Qualifier("catBean")Pet pet) {
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
