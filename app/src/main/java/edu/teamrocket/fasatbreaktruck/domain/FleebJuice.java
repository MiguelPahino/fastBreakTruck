package edu.teamrocket.fasatbreaktruck.domain;

import edu.teamrocket.fasatbreaktruck.types.Bebida;

public class FleebJuice extends Bebida{

    private final String NOMBRE = new String();
    private final Float PVP = 0f;

    public FleebJuice(){
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
