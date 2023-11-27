package spring_introduction;

public class Test1 {
    public static void main(String[] args) {
        //Dog dog = new Dog();
        Pet pet = new Dog(); //методы Dog ((не имплементированные)) в pet будут недоступны
        //dog.say();
        pet.say();

        Pet cat = new Cat();
        cat.say();
    }
}
