package com.krieger.demo;

import static java.lang.Thread.sleep;

abstract class Tier implements Sozialisiert{
    String art;
    String name;
    int alter;
    double groesse;
    double gewicht;
    String nahrung;

    public Tier(){}

    public Tier(String art, String name, int alter, double groesse, double gewicht, String nahrung){
        this.art=art;
        this.name = name;
        this.alter = alter;
        this.groesse=groesse;
        this.gewicht = gewicht;
        this.nahrung= nahrung;


    }

    public abstract void essen(String nahrung);

    public abstract void schlafenGehen() throws InterruptedException;

}


