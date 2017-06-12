package pvu.spring.core.beandefinition.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pvu.spring.core.beandefinition.Account;

/**
 * Created by vhphat on 6/12/2017.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("pvu/spring/core/beandefinition/xml/beans.xml");

        Account account1 = applicationContext.getBean("account1", Account.class);
        System.out.println(account1);

        Account account2 = applicationContext.getBean("account2", Account.class);
        System.out.println(account2);
    }
}
