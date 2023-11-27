package spring_introduction_7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");
        Cat myCat = context.getBean("catBean", Cat.class);
        myCat.say();
        Dog myDog = context.getBean("dog", Dog.class);
        myDog.say();

        SQLConnection sqlConnection = context.getBean("SQLConnection", SQLConnection.class);
    }
}
