package edu.teamrocket.fasatbreaktruck.domain;

import java.util.ArrayList;
import java.util.List;
import edu.teamrocket.fasatbreaktruck.behaviour.Item;

public class Desayuno {
    private Float total = 0f;
    private List<Item> items = new ArrayList<>();

    public Desayuno(){};

    public void addItem(Item item){
        this.items.add(item);
    }

    public List<Item> getItems(){
        return this.items;
    }

    public void mostrarItems(){
        items.stream().forEach(x-> System.out.print(x));
    }

    public Float getCoste(){
        getItems().stream().forEach(x-> this.total += x.pvp());
        return this.total;
    }
}
