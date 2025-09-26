package com.Vehiculos.Moto;

import com.Componentes.*;
import com.Fabricas.FabricaDeVehiculos;
import com.Vehiculos.Vehiculo;

public class Motocicleta implements Vehiculo{
    private Rueda rueda;
    private Motor motor;
    private Manubrio manubrio;
    private Cuadro cuadro;
    private CanioDeEscape canioDeEscape;
    private Cadena cadena;
    private Asiento asiento;

    public Motocicleta(FabricaDeVehiculos fabrica) {
        this.rueda = fabrica.crearRueda();
        this.motor = fabrica.crearMotor();
        this.manubrio = fabrica.crearManubrio();
        this.cuadro = fabrica.crearCuadro();
        this.canioDeEscape = fabrica.crearCanioDeEscape();
        this.cadena = fabrica.crearCadena();
        this.asiento = fabrica.crearAsiento();
    }


    public void mostrarInfo() {
        System.out.println("Motocicleta:");
        System.out.println("Rueda: " + rueda);
        System.out.println("Motor: " + motor);
        System.out.println("Manubrio: " + manubrio);
        System.out.println("Cuadro: " + cuadro);
        System.out.println("Canio de escape: " + canioDeEscape);
        System.out.println("Cadena: " + cadena);
        System.out.println("Asiento: " + asiento);
    }

}
