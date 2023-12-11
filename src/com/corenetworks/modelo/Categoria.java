package com.corenetworks.modelo;

import java.util.Objects;

public class Categoria {
    private int categoryId;
    private String nombre;
    private String description;

    @Override
    public String toString() {
        return "Categoria{" +
                "categoryId=" + categoryId +
                ", nombre='" + nombre + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return categoryId == categoria.categoryId && Objects.equals(nombre, categoria.nombre) && Objects.equals(description, categoria.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, nombre, description);
    }

    public Categoria() {
    }

    public Categoria(int categoryId, String nombre, String description) {
        this.categoryId = categoryId;
        this.nombre = nombre;
        this.description = description;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
