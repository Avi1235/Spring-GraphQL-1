package com.example.demograhpql.repository;

import com.example.demograhpql.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
