package com.app.onlinebookstore;

import com.app.onlinebookstore.model.Book;
import com.app.onlinebookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class OnlineBookStoreShop {
    private final BookService bookService;

    @Autowired
    public OnlineBookStoreShop(BookService bookService) {
        this.bookService = bookService;
    }

    public static void main(String[] args) {
        SpringApplication.run(OnlineBookStoreShop.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            Book harryPotter1 = new Book();
            harryPotter1.setTitle("Harry Potter 1");
            harryPotter1.setAuthor("Joan Rouling");
            harryPotter1.setIsbn("8237523861245");
            harryPotter1.setPrice(BigDecimal.TEN);
            harryPotter1.setDescription("The first novel in the Harry Potter series and Rowling's"
                    + " debut novel, it follows Harry Potter, "
                    + "a young wizard who discovers his magical heritage on his eleventh birthday, "
                    + "when he receives a letter of acceptance to Hogwarts School "
                    + "of Witchcraft and Wizardry.");
            harryPotter1.setCoverImage("https://www.app.com/image?EETJSDIFq21S");

            Book harryPotter2 = new Book();
            harryPotter2.setTitle("Harry Potter 2");
            harryPotter2.setAuthor("Joan Rouling");
            harryPotter2.setIsbn("534623521532");
            harryPotter2.setPrice(new BigDecimal("35.12"));
            harryPotter2.setDescription("The story follows Harry's second year at "
                    + "Hogwarts School of Witchcraft and Wizardry, where the Heir of "
                    + "Salazar Slytherin opens the Chamber of Secrets, unleashing a "
                    + "monster that petrifies the school's students.");
            harryPotter2.setCoverImage("https://www.app.com/image?DFGWXFDS8141D");

            Book harryPotter3 = new Book();
            harryPotter3.setTitle("Harry Potter 3");
            harryPotter3.setAuthor("Joan Rouling");
            harryPotter3.setIsbn("7658954963543");
            harryPotter3.setPrice(new BigDecimal("12.43"));
            harryPotter3.setDescription("The film follows Harry's third year "
                    + "at Hogwarts and his quest to uncover the truth about his past, "
                    + "including the connection recently-escaped Azkaban prisoner Sirius Black "
                    + "has to Harry and his deceased parents. With this film, the Harry Potter "
                    + "series switched to a longer eighteen-month production cycle.");
            harryPotter3.setCoverImage("https://www.app.com/image?JIEWIOJT21SJD");

            System.out.println(bookService.save(harryPotter1));
            System.out.println(bookService.save(harryPotter2));
            System.out.println(bookService.save(harryPotter3));

            bookService.findAll().forEach(System.out::println);
        };
    }
}
