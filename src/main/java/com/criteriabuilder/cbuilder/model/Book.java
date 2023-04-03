package com.criteriabuilder.cbuilder.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    public Long id;
    public String author;
    public String title;
}
