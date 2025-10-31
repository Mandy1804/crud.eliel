package com.crud.demo.book;

public class BookDTO {

    private Long id;
    private String nome;
    private String categoria;

    public BookDTO() {}

    public BookDTO(BookModel book) {
        this.id = book.getId();
        this.nome = book.getNome();
        this.categoria = book.getCategoria();
    }

    public BookModel transformaParaObjeto() {
        // Corrigido: ordem correta dos parâmetros
        return new BookModel(categoria, nome);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
