package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2_2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("myCat", Pet.class);
        System.out.println(pet.getClass());
        pet.say();
        Pet pet2 = context.getBean("myPet", Pet.class);
        System.out.println(pet2.getClass());
        pet2.say();
        Pet pet3 = context.getBean("myCat", Pet.class);
        System.out.println(pet3.getClass());
        pet3.say();
        System.out.println("pet == pet3: " + (pet == pet3));
    }
}
