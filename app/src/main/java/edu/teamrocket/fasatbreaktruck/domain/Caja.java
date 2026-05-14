package edu.teamrocket.fasatbreaktruck.domain;

import edu.teamrocket.fasatbreaktruck.behaviour.Packing;

public class Caja implements Packing {
    public Caja(){};

    @Override
    public String envoltorio() {
        return "Envoltorio de caja";
    }
}
