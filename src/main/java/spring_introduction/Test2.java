package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        // Создание sping контейнера на основе xml кофигурации
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);
        Pet cat = context.getBean("myCat", Pet.class);
        Pet cat2 = context.getBean("myCat", Pet.class);
        Pet cat3 = context.getBean("myCat", Pet.class);
        //Pet cat = context.getBean(Cat.class);
        //Pet cat2 = context.getBean("spring_introduction.Cat#0", Pet.class);
        //Pet cat3 = context.getBean(Cat.class);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            System.out.println("Bean name: " + beanName);
        }
    }
}
