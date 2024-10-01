package org.example.modelos;

import java.time.LocalDate;

public class Flor {
    private Double id;
    private Integer numPetalos;
    private String tipoFlor;
    private String calidad;
    private String precio;
    private String color;
    private String cultivo;
    private LocalDate fechaCultivo;
    private String tiempoVida;
    private String olor;

    public Flor() {
    }

    public Flor(Double id, Integer numPetalos, String tipoFlor, String calidad, String precio, String color, String cultivo, LocalDate fechaCultivo, String tiempoVida, String olor) {
        this.id = id;
        this.numPetalos = numPetalos;
        this.tipoFlor = tipoFlor;
        this.calidad = calidad;
        this.precio = precio;
        this.color = color;
        this.cultivo = cultivo;
        this.fechaCultivo = fechaCultivo;
        this.tiempoVida = tiempoVida;
        this.olor = olor;
    }

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public Integer getNumPetalos() {
        return numPetalos;
    }

    public void setNumPetalos(Integer numPetalos) {
        this.numPetalos = numPetalos;
    }

    public String getTipoFlor() {
        return tipoFlor;
    }

    public void setTipoFlor(String tipoFlor) {
        this.tipoFlor = tipoFlor;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCultivo() {
        return cultivo;
    }

    public void setCultivo(String cultivo) {
        this.cultivo = cultivo;
    }

    public LocalDate getFechaCultivo() {
        return fechaCultivo;
    }

    public void setFechaCultivo(LocalDate fechaCultivo) {
        this.fechaCultivo = fechaCultivo;
    }

    public String getTiempoVida() {
        return tiempoVida;
    }

    public void setTiempoVida(String tiempoVida) {
        this.tiempoVida = tiempoVida;
    }

    public String getOlor() {
        return olor;
    }

    public void setOlor(String olor) {
        this.olor = olor;
    }
}
