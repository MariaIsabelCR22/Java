package com.example;

public class Autor {

    private String idAutor;
    private String nombre;
    private String nacionalidad;
    private int anioNacimiento;

    public Autor() {

    }

    public Autor(String idAutor, String nombre, String nacionalidad, int anioNacimiento) {
        setIdAutor(idAutor);
        setNombre(nombre);
        setNacionalidad(nacionalidad);
        setAnioNacimiento(anioNacimiento);
    }

    public Autor(String nombre, String nacionalidad, int anioNacimiento) {
        setNombre(nombre);
        setNacionalidad(nacionalidad);
        setAnioNacimiento(anioNacimiento);
    }

    public Autor(String idAutor, String nombre) {
        setIdAutor(idAutor);
        setNombre(nombre);
    }

    public String getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(String idAutor) {
        if (idAutor != null && !idAutor.trim().isEmpty()) {
            this.idAutor = idAutor;
        } else {
            throw new IllegalArgumentException("El ID del autor no puede estar vacío");
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        if (nacionalidad != null && !nacionalidad.trim().isEmpty()) {
            this.nacionalidad = nacionalidad;
        } else {
            throw new IllegalArgumentException("La nacionalidad no puede estar vacía");
        }
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        if (anioNacimiento > 0 && anioNacimiento <= 2026) {
            this.anioNacimiento = anioNacimiento;
        } else {
            throw new IllegalArgumentException("El año de nacimiento no es válido");
        }
    }

    @Override
    public String toString() {
        return "Autor {" +
                "ID: '" + idAutor + '\'' +
                ", Nombre: '" + nombre + '\'' +
                ", Nacionalidad: '" + nacionalidad + '\'' +
                ", Año de nacimiento: " + anioNacimiento +
                '}';
    }
}
