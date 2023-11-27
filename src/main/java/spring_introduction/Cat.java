package spring_introduction;

import org.springframework.context.annotation.Scope;

@Scope("prototype") //не срабатывет при xml конфигурации (если нет scope="prototype" в applicationContext.xml)
public class Cat implements Pet{

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
