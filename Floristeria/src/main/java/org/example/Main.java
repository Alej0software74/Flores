package org.example;

import org.example.ayudas.Proveedor;
import org.example.ayudas.Repartidor;
import org.example.modelos.Cliente;
import org.example.modelos.Flor;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente clienteUno = new Cliente();
        Cliente clienteDos = new Cliente(1L,"jorge","salazar",30,1.78f,"01/03-1997","M","123456","desconocida","10");

        Flor florUno = new Flor();
        Flor florDos = new Flor(1D,50,"rosa","alta calidad","1000000","rojo","se cultivo en el cesde", LocalDate.now(),"una semana","rico");

        Proveedor proveedorUno = new Proveedor();
        Proveedor proveedorDos = new Proveedor(1L,"lucho",10,5,"celulares",LocalDate.now(),2,"123456","itm","10");

        Repartidor repartidorUno = new Repartidor();
        Repartidor repartidorDos = new Repartidor(1L,"juanjo","villa",21,1.79F,LocalDate.now(),"Masculino","123456","desconocida","rico");

        // Supongamos que tienes los métodos get en cada clase

// Imprimir atributos de Cliente
        System.out.println("Cliente Uno: " + clienteUno.getId() + ", " + clienteUno.getNombre() + ", " + clienteUno.getApellido() + ", " + clienteUno.getEdad() + ", " + clienteUno.getEstatura() + ", " + clienteUno.getFechaNacimiento() + ", " + clienteUno.getGenero() + ", " + clienteUno.getTel() + ", " + clienteUno.getDireccion() + ", " + clienteUno.getEstrato());
        System.out.println("Cliente Dos: " + clienteDos.getId() + ", " + clienteDos.getNombre() + ", " + clienteDos.getApellido() + ", " + clienteDos.getEdad() + ", " + clienteDos.getEstatura() + ", " + clienteDos.getFechaNacimiento() + ", " + clienteDos.getGenero() + ", " + clienteDos.getTel() + ", " + clienteDos.getDireccion() + ", " + clienteDos.getEstrato());

// Imprimir atributos de Flor
        System.out.println("Flor Uno: " + florUno.getId() + ", " + florUno.getNumPetalos() + ", " + florUno.getTipoFlor() + ", " + florUno.getCalidad() + ", " + florUno.getPrecio() + ", " + florUno.getColor() + ", " + florUno.getColor() + ", " + florUno.getFechaCultivo() + ", " + florUno.getTiempoVida() + ", " + florUno.getOlor());
        System.out.println("Flor Dos: " + florDos.getId() + ", " + florDos.getNumPetalos() + ", " + florDos.getTipoFlor() + ", " + florDos.getCalidad() + ", " + florDos.getPrecio() + ", " + florDos.getColor() + ", " + florDos.getColor() + ", " + florDos.getFechaCultivo() + ", " + florDos.getTiempoVida() + ", " + florDos.getOlor());

// Imprimir atributos de Proveedor
        System.out.println("Proveedor Uno: " + proveedorUno.getId() + ", " + proveedorUno.getNombre() + ", " + proveedorUno.getNumClientes() + ", " + proveedorUno.getNumPedidos() + ", " + proveedorUno.getNombreProducto() + ", " + proveedorUno.getFechaEntrega() + ", " + proveedorUno.getCantidadPedidos() + ", " + proveedorUno.getTel() + ", " + proveedorUno.getDireccion() + ", " + proveedorUno.getEstrato());
        System.out.println("Proveedor Dos: " + proveedorDos.getId() + ", " + proveedorDos.getNombre() + ", " + proveedorDos.getNumClientes() + ", " + proveedorDos.getNumPedidos() + ", " + proveedorDos.getNombreProducto() + ", " + proveedorDos.getFechaEntrega() + ", " + proveedorDos.getCantidadPedidos() + ", " + proveedorDos.getTel() + ", " + proveedorDos.getDireccion() + ", " + proveedorDos.getEstrato());

// Imprimir atributos de Repartidor
        System.out.println("Repartidor Uno: " + repartidorUno.getId() + ", " + repartidorUno.getNombre() + ", " + repartidorUno.getApellido() + ", " + repartidorUno.getEdad() + ", " + repartidorUno.getEstatura() + ", " + repartidorUno.getFechaNacimiento() + ", " + repartidorUno.getGenero() + ", " + repartidorUno.getTel() + ", " + repartidorUno.getDireccion() + ", " + repartidorUno.getEstrato());
        System.out.println("Repartidor Dos: " + repartidorDos.getId() + ", " + repartidorDos.getNombre() + ", " + repartidorDos.getApellido() + ", " + repartidorDos.getEdad() + ", " + repartidorDos.getEstatura() + ", " + repartidorDos.getFechaNacimiento() + ", " + repartidorDos.getGenero() + ", " + repartidorDos.getTel() + ", " + repartidorDos.getDireccion() + ", " + repartidorDos.getEstrato());

    }
} // objeto de cade clase cosntructor basio y uno lleno
// mostrar los atributos de cadse objeto

