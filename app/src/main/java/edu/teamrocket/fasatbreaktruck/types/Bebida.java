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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("Item: ");
        builder.append(this.nombre());
        builder.append(", Empaquetado: ");
        builder.append(this.empaquetado());
        builder.append(", Precio: ");
        builder.append(this.pvp());
        builder.append("\n");

        return builder.toString();

    }

}
