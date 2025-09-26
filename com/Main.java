package com;

import com.Fabricas.FabricaDeVehiculos;
import com.Fabricas.ProveedorDeFabricas;
import com.Vehiculos.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Piezas de Vehículos - Abstract Factory");

        FabricaDeVehiculos fabrica = ProveedorDeFabricas.getFabrica("motocicleta");

        Vehiculo vehiculo = fabrica.crearVehiculo();
        vehiculo.mostrarInfo();

    }
}