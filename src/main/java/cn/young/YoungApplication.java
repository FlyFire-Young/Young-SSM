package cn.young;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class YoungApplication {

    public static void main(String[] args) {
        SpringApplication.run(YoungApplication.class, args);
    }
}
