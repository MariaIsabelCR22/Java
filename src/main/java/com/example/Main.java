package com.example;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== SISTEMA DE BIBLIOTECA DIGITAL =====");

        System.out.println("\n--- AUTORES ---");

        Autor autor1 = new Autor("A001", "Gabriel García Márquez",
                "Colombiana", 1927);

        Autor autor2 = new Autor("A002", "Mario Vargas Llosa");

        Autor autor3 = new Autor("Julio Cortázar", "Argentina");

        System.out.println(autor1);
        System.out.println(autor2);
        System.out.println(autor3);

        System.out.println("\n--- LIBROS ---");

        Libro libro1 = new Libro("978-0307474728", "Cien años de soledad",
                autor1, 1967, 45000, 10);

        Libro libro2 = new Libro("978-0307743667", "Rayuela", autor3);

        Libro libro3 = new Libro("978-8497592208", "La ciudad y los perros",
                autor2, 55000);

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);

        System.out.println("\n--- USUARIOS ---");

        Usuario usuario1 = new Usuario("U001", "Pepe Grillo",
                "pepe@gmail.com", 3);

        Usuario usuario2 = new Usuario("Luna", "luna@gmail.com");

        Usuario usuario3 = new Usuario("U003", 0);

        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(usuario3);

        System.out.println("\n--- CONSULTA DE DATOS ---");

        System.out.println("Nombre del usuario: " + usuario1.getNombre());
        System.out.println("Correo: " + usuario1.getCorreoElectronico());
        System.out.println("Título del libro: " + libro1.getTitulo());
        System.out.println("Nombre del autor: " + autor1.getNombre());

        System.out.println("\n--- MODIFICACIÓN DE DATOS ---");

        usuario1.setLibrosPrestados(5);
        libro1.setStock(15);
        autor1.setNacionalidad("Colombiana");

        System.out.println(usuario1);
        System.out.println(libro1);
        System.out.println(autor1);

        System.out.println("\n--- PRUEBA DE ERRORES ---");

        try {
            usuario1.setLibrosPrestados(-3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            libro1.setPrecio(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n===== FIN DEL PROGRAMA =====");
    }
}
