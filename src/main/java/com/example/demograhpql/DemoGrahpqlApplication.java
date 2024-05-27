package com.example.demograhpql;

import com.example.demograhpql.entity.Author;
import com.example.demograhpql.entity.Book;
import com.example.demograhpql.repository.AuthorRepository;
import com.example.demograhpql.repository.BookRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@SpringBootApplication
@EnableMongoRepositories
public class DemoGrahpqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGrahpqlApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(AuthorRepository authorRepository, BookRepository bookRepository) {
		return args -> {
			Author josh = authorRepository.save(new Author("Josh Long", 22));
			Author mark = authorRepository.save(new Author("Mark Hill", 23));
			bookRepository.saveAll(List.of(
					new Book("the book","idk", josh),
					new Book("the litle prince","idk",josh),
					new Book("spring in action","idk",mark)
			));
		};
	}

}
