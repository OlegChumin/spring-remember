package spring_introduction;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test2_1 {
    public static void main(String[] args) {
        GenericXmlApplicationContext context =
                new GenericXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        Pet cat = context.getBean("myCat", Pet.class);
        Pet cat2 = context.getBean("myCat", Pet.class);
        Pet cat3 = context.getBean("myCat", Pet.class);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            System.out.println("Bean name: " + beanName);
        }

    }
}
