package edu.teamrocket.fasatbreaktruck.types;

import edu.teamrocket.fasatbreaktruck.behaviour.Item;
import edu.teamrocket.fasatbreaktruck.behaviour.Packing;
import edu.teamrocket.fasatbreaktruck.domain.Caja;

public abstract class Cereales implements Item {

    public Cereales(){};

    @Override
    public Packing empaquetado() {
        return new Caja();
    }
    
    
}
