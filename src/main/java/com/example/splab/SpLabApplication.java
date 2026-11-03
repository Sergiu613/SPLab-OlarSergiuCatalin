package com.example.splab;

import com.example.splab.persistence.BooksRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpLabApplication.class, args);
    }

    @Bean
    public CommandLineRunner initDatabase(BooksRepository booksRepository) {
        return args -> {
            Book book = new Book("Amintiri din copilarie");
            book.addAuthor(new Author("Ion", "Creanga"));

            Section cap1 = new Section("Capitolul 1");
            cap1.add(new Paragraph("Stau si-mi aduc aminte..."));
            cap1.add(new ImageProxy("poza_humulesti.jpg"));

            book.addContent(cap1);

            booksRepository.save(book);
        };
    }
}