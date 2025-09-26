package com.Vehiculos.Moto;

import com.Componentes.*;
import com.Fabricas.FabricaDeVehiculos;

public class FabricaDeMotos implements FabricaDeVehiculos {
    public Rueda crearRueda() { return new RuedaMoto();}
    public Motor crearMotor() {return new MotorMoto();}
    public Manubrio crearManubrio() {return new ManubrioMoto();}
    public Cuadro crearCuadro() {return new CuadroMoto();}
    public CanioDeEscape crearCanioDeEscape() {return new CanioDeEscapeMoto();}
    public Cadena crearCadena() {return new CadenaMoto();}
    public Asiento crearAsiento() {return new AsientoMoto();}
    // nulos porque la moto no lleva eso
    public Capot crearCapot() {return null;}
    public Chasis crearChasis() {return null;}
    public Volante crearVolante() {return null;}
    public Puerta crearPuerta() {return null;}

    public Motocicleta crearVehiculo(){
        return new Motocicleta(this);
    }
}
