package io.github.WesleyViricimo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LocalizacaoApplication implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Inicializando");
    }

    public static void main(String[] args) {
        SpringApplication.run(LocalizacaoApplication.class);
    }
}