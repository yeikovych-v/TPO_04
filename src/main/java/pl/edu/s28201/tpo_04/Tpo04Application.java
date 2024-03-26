package pl.edu.s28201.tpo_04;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.edu.s28201.tpo_04.repository.AuthorRepository;
import pl.edu.s28201.tpo_04.repository.BookRepository;
import pl.edu.s28201.tpo_04.repository.PublisherRepository;

@SpringBootApplication
public class Tpo04Application {

    public static void main(String[] args) {
        SpringApplication.run(Tpo04Application.class, args);

    }

    @Bean
    public CommandLineRunner run(BookRepository bookRepo,
                                 PublisherRepository pubRepo,
                                 AuthorRepository authRepo) {
        return args -> {
            bookRepo.findAll().forEach(System.out::println);
            pubRepo.findAll().forEach(System.out::println);
            authRepo.findAll().forEach(System.out::println);
        };
    }

}
