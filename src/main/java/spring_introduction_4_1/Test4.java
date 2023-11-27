package spring_introduction_4_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext4_1.xml");
                //new ClassPathXmlApplicationContext("applicationContext4.xml", "applicationContext4_1.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("Belka");
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Strelka");
        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());

        System.out.println("myDog == yourDog: " + (myDog == yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);

        context.close();
    }
}
