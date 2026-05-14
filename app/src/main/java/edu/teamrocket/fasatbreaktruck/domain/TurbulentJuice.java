package edu.teamrocket.fasatbreaktruck.domain;

import edu.teamrocket.fasatbreaktruck.types.Bebida;

public class TurbulentJuice extends Bebida{

    private final String NOMBRE = new String();
    private final Float PVP = 0f;

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

