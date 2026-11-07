package com.example;

public class Usuario {

    private String idUsuario;
    private String nombre;
    private String correoElectronico;
    private int librosPrestados;

    // Constructor por defecto
    public Usuario() {

    }

    public Usuario(String idUsuario, String nombre, String correoElectronico, int librosPrestados) {
        setIdUsuario(idUsuario);
        setNombre(nombre);
        setCorreoElectronico(correoElectronico);
        setLibrosPrestados(librosPrestados);
    }

    public Usuario(String nombre, String correoElectronico) {
        setNombre(nombre);
        setCorreoElectronico(correoElectronico);
    }

    public Usuario(String idUsuario, int librosPrestados) {
        setIdUsuario(idUsuario);
        setLibrosPrestados(librosPrestados);
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        if (idUsuario != null && !idUsuario.trim().isEmpty()) {
            this.idUsuario = idUsuario;
        } else {
            throw new IllegalArgumentException("El ID del usuario no puede estar vacío");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        if (correoElectronico != null && correoElectronico.contains("@")
                && correoElectronico.contains(".")) {
            this.correoElectronico = correoElectronico;
        } else {
            throw new IllegalArgumentException("El correo electrónico no es válido");
        }
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(int librosPrestados) {
        if (librosPrestados >= 0) {
            this.librosPrestados = librosPrestados;
        } else {
            throw new IllegalArgumentException("La cantidad de libros no puede ser negativa");
        }
    }

    @Override
    public String toString() {
        return "Usuario {" +
                "ID: '" + idUsuario + '\'' +
                ", Nombre: '" + nombre + '\'' +
                ", Correo electrónico: '" + correoElectronico + '\'' +
                ", Libros prestados: " + librosPrestados +
                '}';
    }
}
