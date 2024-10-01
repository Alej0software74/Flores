package org.example.ayudas;

import java.time.LocalDate;

public class Repartidor {
    private Long id;
    private String nombre;
    private String apellido;
    private Integer edad;
    private Float estatura;
    private LocalDate fechaNacimiento;
    private String genero;
    private String tel;
    private String direccion;
    private String estrato;

    public Repartidor() {
    }

    public Repartidor(Long id, String nombre, String apellido, Integer edad, Float estatura, LocalDate fechaNacimiento, String genero, String tel, String direccion, String estrato) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estatura = estatura;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.tel = tel;
        this.direccion = direccion;
        this.estrato = estrato;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Float getEstatura() {
        return estatura;
    }

    public void setEstatura(Float estatura) {
        this.estatura = estatura;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstrato() {
        return estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }
}
