package pvu.spring.core.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vhphat on 6/9/2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("pvu/spring/core/helloworld/bean.xml");
        HelloWorld bean = context.getBean("helloWorld", HelloWorld.class);
        bean.sayHi();
    }
}
