package com.crud.demo.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<BookModel> findAll() {
        return bookRepository.findAll();
    }

    public BookModel criarLivro(BookModel bookModel) {
        return bookRepository.save(bookModel);
    }

    public void deletarLivro(Long id) {
        bookRepository.deleteById(id);
    }

    public BookModel update(Long id, BookModel bookModel) {
        BookModel newBook = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Livro não encontrado com ID: " + id));

        newBook.setCategoria(bookModel.getCategoria());
        newBook.setNome(bookModel.getNome());
        return bookRepository.save(newBook);
    }
}
