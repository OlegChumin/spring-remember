package spring_introduction_4_2_prototype;

import org.springframework.context.annotation.Scope;

@Scope("prototype") //не срабатывет при xml конфигурации (если нет scope="prototype" в applicationContext.xml)
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
