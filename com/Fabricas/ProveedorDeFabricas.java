package com.Fabricas;

import com.Vehiculos.Moto.FabricaDeMotos;


public class ProveedorDeFabricas{
    public static FabricaDeVehiculos getFabrica(String tipoDeVehiculo){
        switch (tipoDeVehiculo) {
            case "motocicleta": return new FabricaDeMotos();
            case "auto": //return new FabricaDeAutos(); <-- todavía no existe
            case "bicicleta": //return new FabricaDeBicicletas(); <-- todavía no existe
            default: throw new IllegalArgumentException("Tipo no válido");
        }
    }
}