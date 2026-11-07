package com.example;

public class Libro {

    private String isbn;
    private String titulo;
    private Autor autor;
    private int anioPublicacion;
    private double precio;
    private int stock;

    public Libro() {

    }

    public Libro(String isbn, String titulo, Autor autor, int anioPublicacion, double precio, int stock) {
        setIsbn(isbn);
        setTitulo(titulo);
        setAutor(autor);
        setAnioPublicacion(anioPublicacion);
        setPrecio(precio);
        setStock(stock);
    }

    public Libro(String isbn, String titulo, Autor autor) {
        setIsbn(isbn);
        setTitulo(titulo);
        setAutor(autor);
    }

    public Libro(String isbn, String titulo, Autor autor, double precio) {
        setIsbn(isbn);
        setTitulo(titulo);
        setAutor(autor);
        setPrecio(precio);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn != null && !isbn.trim().isEmpty()) {
            this.isbn = isbn;
        } else {
            throw new IllegalArgumentException("El ISBN no puede estar vacío");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo;
        } else {
            throw new IllegalArgumentException("El título no puede estar vacío");
        }
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        if (autor != null) {
            this.autor = autor;
        } else {
            throw new IllegalArgumentException("El autor no puede ser nulo");
        }
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0 && anioPublicacion <= 2026) {
            this.anioPublicacion = anioPublicacion;
        } else {
            throw new IllegalArgumentException("El año de publicación no es válido");
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }
    }

    @Override
    public String toString() {
        return "Libro {" +
                "ISBN: '" + isbn + '\'' +
                ", Título: '" + titulo + '\'' +
                ", Autor: " + autor +
                ", Año de publicación: " + anioPublicacion +
                ", Precio: " + precio +
                ", Stock: " + stock +
                '}';
    }
}
