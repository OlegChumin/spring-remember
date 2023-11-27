package spring_introduction_8;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction_7.SQLConnection;

public class ConfigWithAnnotations8 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext8.xml");

    }
}
