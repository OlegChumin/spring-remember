package spring_introduction_7;

import org.springframework.stereotype.Component;

@Component
public class SQLConnection {
    public SQLConnection() {
        System.out.println("SQLConnection bean been created");
    }
}
