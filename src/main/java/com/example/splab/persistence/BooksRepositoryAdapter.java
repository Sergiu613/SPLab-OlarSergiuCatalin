package com.example.splab.persistence;

import com.example.splab.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BooksRepositoryAdapter implements CrudRepository<Book, Long> {

    private final BooksRepository booksRepository;

    @Autowired
    public BooksRepositoryAdapter(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @Override
    public Book save(Book entity) {
        return booksRepository.save(entity);
    }

    @Override
    public Optional<Book> findById(Long id) {
        return booksRepository.findById(id);
    }

    @Override
    public List<Book> findAll() {
        return booksRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        booksRepository.deleteById(id);
    }
}