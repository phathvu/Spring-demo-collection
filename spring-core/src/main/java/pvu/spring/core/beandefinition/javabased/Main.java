package pvu.spring.core.beandefinition.javabased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pvu.spring.core.beandefinition.Account;

/**
 * Created by vhphat on 6/12/2017.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Account account1 = applicationContext.getBean("account1", Account.class);
        System.out.println(account1);

        Account account2 = applicationContext.getBean("account2", Account.class);
        System.out.println(account2);
    }
}
