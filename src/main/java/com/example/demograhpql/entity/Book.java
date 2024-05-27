package com.example.demograhpql.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "book")
public class Book {
        @Id
        private String id;
        private String title;
        private String publisher;
        private String authorId;

        public Book(String title, String publisher, String authorId) {
                this.title = title;
                this.publisher = publisher;
                this.authorId = authorId;
        }
}
