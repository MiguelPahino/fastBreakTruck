package edu.teamrocket.fasatbreaktruck.domain;

import edu.teamrocket.fasatbreaktruck.types.Cereales;

public class Eyeholes extends Cereales {

    private final String NOMBRE = "Eye holes";
    private final Float PVP = 25f;

    public Eyeholes(){}

    @Override
    public String nombre() {
        return this.NOMBRE;
    }

    @Override
    public Float pvp() {
        return this.PVP;
    }
    
}
