package com.Fabricas;

import com.Componentes.*;
import com.Vehiculos.Vehiculo;

public interface FabricaDeVehiculos{
    Rueda crearRueda();
    Motor crearMotor();
    Manubrio crearManubrio();
    Volante crearVolante();
    CanioDeEscape crearCanioDeEscape();
    Cadena crearCadena();
    Puerta crearPuerta();
    Capot crearCapot();
    Chasis crearChasis();
    Cuadro crearCuadro();
    Asiento crearAsiento();

    Vehiculo crearVehiculo();
}
