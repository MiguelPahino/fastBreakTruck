package edu.teamrocket.fasatbreaktruck.domain;

import edu.teamrocket.fasatbreaktruck.types.Bebida;

public class TurbulentJuice extends Bebida{

    private final String NOMBRE = "Turbulent juuuuice";
    private final Float PVP = 30f;

    public TurbulentJuice(){
    }
    
    @Override
    public String nombre() {
        return this.NOMBRE;
    }

    @Override
    public Float pvp() {
        return this.PVP;
    }
}

