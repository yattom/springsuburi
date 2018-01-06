package jp.yattom.sbs;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
// @ComponentScan(basePackages = {"jp.yattom.sbs"})
// @EntityScan(basePackages = {"jp.yattom.sbs.jpa"})
@EnableJpaRepositories(basePackages = {"jp.yattom.sbs.jpa"})
@EnableTransactionManagement
public class Main {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }
}
