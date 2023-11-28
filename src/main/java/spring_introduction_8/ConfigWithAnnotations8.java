package spring_introduction_8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations8 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext8.xml");
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

    }
}
