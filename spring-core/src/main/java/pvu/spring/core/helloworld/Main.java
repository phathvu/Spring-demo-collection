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
        // hello world
        bean.sayHi();

        // a bit more 'hello world'
        Account account1 = context.getBean("account1", Account.class);
        System.out.println("\n=>Account 1 data:");
        System.out.println("ID: " + account1.getId());
        System.out.println("Account name: " + account1.getOwnerName());
        System.out.println("Balance: " + account1.getBalance());

        Account account2 = context.getBean("account2", Account.class);
        System.out.println("\n=>Account 2 data:");
        System.out.println("ID: " + account2.getId());
        System.out.println("Account name: " + account2.getOwnerName());
        System.out.println("Balance: " + account2.getBalance());
    }
}
