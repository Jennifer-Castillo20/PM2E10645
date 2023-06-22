package com.example.pm2e10645.Models;

public class Personas
{
    private Integer id;
    private String pais;
    private String nombre;
    private Integer telefono;
    private String nota;

    public Personas(Integer id, String pais, String nombre, Integer telefono, String nota) {
        this.id = id;
        this.pais = pais;
        this.nombre = nombre;
        this.telefono = telefono;
        this.nota = nota;
    }

    public Personas() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombres() {
        return nombre;
    }

    public void setNombres(String nombres) {
        this.nombre = nombres;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String correo) {
        this.nota = correo;
    }
}