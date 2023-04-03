package com.criteriabuilder.cbuilder.repository;

import com.criteriabuilder.cbuilder.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>, BookRepositoryCustom {
}
