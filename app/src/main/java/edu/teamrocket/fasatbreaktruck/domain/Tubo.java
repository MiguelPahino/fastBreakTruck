package edu.teamrocket.fasatbreaktruck.domain;

import edu.teamrocket.fasatbreaktruck.behaviour.Packing;

public class Tubo implements Packing{

    public Tubo(){};

    @Override
    public String envoltorio() {
        return "Envoltorio de tubo";
    }
}
