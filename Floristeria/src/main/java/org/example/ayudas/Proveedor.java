package org.example.ayudas;

import java.time.LocalDate;

public class Proveedor {
    private Long id;
    private String nombre;
    private Integer numClientes;
    private Integer numPedidos;
    private String nombreProducto;
    private LocalDate fechaEntrega;
    private Integer cantidadPedidos;
    private String tel;
    private String direccion;
    private String estrato;


    public Proveedor() {
    }

    public Proveedor(Long id, String nombre, Integer numClientes, Integer numPedidos, String nombreProducto, LocalDate fechaEntrega, Integer cantidadPedidos, String tel, String direccion, String estrato) {
        this.id = id;
        this.nombre = nombre;
        this.numClientes = numClientes;
        this.numPedidos = numPedidos;
        this.nombreProducto = nombreProducto;
        this.fechaEntrega = fechaEntrega;
        this.cantidadPedidos = cantidadPedidos;
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

    public Integer getNumClientes() {
        return numClientes;
    }

    public void setNumClientes(Integer numClientes) {
        this.numClientes = numClientes;
    }

    public Integer getNumPedidos() {
        return numPedidos;
    }

    public void setNumPedidos(Integer numPedidos) {
        this.numPedidos = numPedidos;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Integer getCantidadPedidos() {
        return cantidadPedidos;
    }

    public void setCantidadPedidos(Integer cantidadPedidos) {
        this.cantidadPedidos = cantidadPedidos;
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
