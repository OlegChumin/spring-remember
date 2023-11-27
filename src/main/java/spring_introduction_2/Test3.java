package spring_introduction_2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        context.close();
    }
}
