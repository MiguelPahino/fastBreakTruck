package edu.teamrocket.fasatbreaktruck.domain;

import edu.teamrocket.fasatbreaktruck.types.Juguete;

public class Plumbus extends Juguete{

    private final String NOMBRE = "Plumbus";
    private final Float PVP = 100f;

    public Plumbus(){}

    public String nombre(){
        return this.NOMBRE;
    }

    public Float pvp(){
        return this.PVP;
    }

}