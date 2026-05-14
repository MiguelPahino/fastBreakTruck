package edu.teamrocket.fasatbreaktruck.types;

import edu.teamrocket.fasatbreaktruck.behaviour.Item;
import edu.teamrocket.fasatbreaktruck.behaviour.Packing;
import edu.teamrocket.fasatbreaktruck.domain.Tubo;

public abstract class Bebida implements Item {
    
    public Bebida(){};

    @Override
    public Packing empaquetado() {
        return new Tubo();   
    }

    

}
