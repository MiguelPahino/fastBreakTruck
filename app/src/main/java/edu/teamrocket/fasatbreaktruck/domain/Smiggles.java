package edu.teamrocket.fasatbreaktruck.domain;

import edu.teamrocket.fasatbreaktruck.types.Cereales;

public class Smiggles extends Cereales {

    private final String NOMBRE = "Smiggles";
    private final Float PVP = 50f;

    public Smiggles(){};

    @Override
    public String nombre() {
        return this.NOMBRE;
    }

    @Override
    public Float pvp() {
        return this.PVP;
    }
    
}
