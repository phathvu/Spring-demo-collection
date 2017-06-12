package pvu.spring.core.beandefinition.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vhphat on 6/12/2017.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("/pvu/spring/core/beandefinition/annotation/config.xml");
        Account account = applicationContext.getBean("account", Account.class);
        System.out.println(account);
    }
}
