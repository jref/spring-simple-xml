package ua.com.codespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        Dog dog = applicationContext.getBean(Dog.class);
        dog.say();
        System.out.println(dog);
        /*B b = (B) applicationContext.getBean("b");
        System.out.println(b);*/
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
