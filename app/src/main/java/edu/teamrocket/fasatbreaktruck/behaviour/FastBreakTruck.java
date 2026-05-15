package edu.teamrocket.fasatbreaktruck.behaviour;

import edu.teamrocket.fasatbreaktruck.domain.Desayuno;
import edu.teamrocket.fasatbreaktruck.domain.Eyeholes;
import edu.teamrocket.fasatbreaktruck.domain.FleebJuice;
import edu.teamrocket.fasatbreaktruck.domain.Plumbus;
import edu.teamrocket.fasatbreaktruck.domain.Smiggles;
import edu.teamrocket.fasatbreaktruck.domain.TurbulentJuice;


public class FastBreakTruck{

    public FastBreakTruck(){}

    public static Desayuno prepararEyeHoles(){
        Desayuno desayuno = new Desayuno();

        desayuno.addItem(new Eyeholes());
        desayuno.addItem(new TurbulentJuice());

        return desayuno;
    }

    public static Desayuno prepararSmiggles(){
        Desayuno desayuno = new Desayuno();

        desayuno.addItem(new Smiggles());
        desayuno.addItem(new FleebJuice());

        return desayuno;
    }

    public static void incluirJuguete(Desayuno desayuno){
        desayuno.addItem(new Plumbus());
    }
}