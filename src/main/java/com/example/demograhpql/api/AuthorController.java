package com.example.demograhpql.api;

import com.example.demograhpql.dto.BookInput;
import com.example.demograhpql.entity.Author;
import com.example.demograhpql.entity.Book;
import com.example.demograhpql.repository.AuthorRepository;
import com.example.demograhpql.repository.BookRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class AuthorController {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public AuthorController(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @QueryMapping
    Iterable<Author> authors() {
        return authorRepository.findAll();
    }

    @QueryMapping
    Optional<Author> authorById(@Argument Long id) throws Exception {
//        Optional<Author> authorOpt = authorRepository.findById(id);
//        if (authorOpt.isPresent()) {
//            return authorOpt.get();
//        } else {
//            throw new Exception("Not Found");
//        }
        return authorRepository.findById(id);
    }

    @MutationMapping
    Book addBook(@Argument BookInput book) {
        System.out.println("i die at start");
        System.out.println(book);
        Author author = authorRepository.findById(book.authorId()).orElseThrow(() -> new IllegalArgumentException("author not found"));
        System.out.println("i die after find");
        Book b = new Book(book.title(), book.publisher(), author);
        System.out.println("i die after create object");
        return bookRepository.save(b);
    }
}
