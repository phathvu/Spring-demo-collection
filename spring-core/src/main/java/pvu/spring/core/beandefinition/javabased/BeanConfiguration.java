package pvu.spring.core.beandefinition.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pvu.spring.core.beandefinition.Account;

/**
 * Created by vhphat on 6/12/2017.
 */
@Configuration
public class BeanConfiguration {
    @Bean
    public Account account1() {
        Account account = new Account();
        account.setId(1);
        account.setOwnerName("John");
        account.setBalance(21.2);

        return account;
    }

    @Bean
    public Account account2() {
        Account account = new Account();
        account.setId(2);
        account.setOwnerName("Roger");
        account.setBalance(26.9);

        return account;
    }
}
