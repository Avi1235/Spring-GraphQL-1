package com.example.demograhpql.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "author")
public class Author {
        @Id
        private String id;
        private String name;
        private Integer age;
        private List<String> bookIds = new ArrayList<>();

        public Author(String name, Integer age) {
                this.name = name;
                this.age = age;
        }

}
