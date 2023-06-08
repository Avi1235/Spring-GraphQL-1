package com.example.demograhpql.entity;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "author")
public class Author {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private Integer age;
        @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
        private List<Book> books = new ArrayList<>();

        public Author(String name, Integer age) {
                this.name = name;
                this.age = age;
        }

        public Author() {
        }

//        public void setId(Long id) {
//                this.id = id;
//        }
//
//        public void setName(String name) {
//                this.name = name;
//        }
//
//        public void setAge(Integer age) {
//                this.age = age;
//        }
//
//        public void setBooks(List<Book> books) {
//                this.books = books;
//        }


        public Long getId() {
                return id;
        }

        public String getName() {
                return name;
        }

        public Integer getAge() {
                return age;
        }

        public List<Book> getBooks() {
                return books;
        }
}
