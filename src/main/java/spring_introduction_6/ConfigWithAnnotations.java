package spring_introduction_6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext6.xml");
        Cat myCat = context.getBean("catBean", Cat.class);
        myCat.say();
        Dog myDog = context.getBean("dog", Dog.class);
        myDog.say();
    }
}
