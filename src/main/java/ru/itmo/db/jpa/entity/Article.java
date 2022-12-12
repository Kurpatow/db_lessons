package ru.itmo.db.jpa.entity;

import java.time.LocalDateTime;


public class Article {
    private int id;
    private String title;
    private LocalDateTime created;


    public Article() {
        created = LocalDateTime.now();
    }

}
