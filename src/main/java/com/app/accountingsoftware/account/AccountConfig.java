package com.app.accountingsoftware.account;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountConfig {

    @Bean
    CommandLineRunner accountCommandLineRunner(AccountRepository repository) {
        return args -> {
//            Account cash = new Account("Cash");
//            repository.saveAll(List.of(cash));
        };
    }
}
