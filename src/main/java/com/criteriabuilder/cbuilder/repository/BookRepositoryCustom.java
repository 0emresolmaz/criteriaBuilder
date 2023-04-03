package com.criteriabuilder.cbuilder.repository;

import com.criteriabuilder.cbuilder.model.Book;

import java.util.List;

public interface BookRepositoryCustom {
   List<Book> findBooksByAuthorNameAndTitle(String authorName, String title);
}
