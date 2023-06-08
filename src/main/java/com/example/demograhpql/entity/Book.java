package com.example.demograhpql.entity;


import javax.persistence.FetchType;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;
        private String publisher;
        @ManyToOne(fetch = FetchType.LAZY)
        private Author author;

        public Book(String title, String publisher, Author author) {
                this.title = title;
                this.publisher = publisher;
                this.author = author;
        }

        public Book() {
        }

//        public void setId(Long id) {
//                this.id = id;
//        }
//
//        public void setTitle(String title) {
//                this.title = title;
//        }
//
//        public void setPublisher(String publisher) {
//                this.publisher = publisher;
//        }


        public Long getId() {
                return id;
        }

        public String getTitle() {
                return title;
        }

        public String getPublisher() {
                return publisher;
        }

        public Author getAuthor() {
                return author;
        }
}
