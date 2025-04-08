package com.krieger.demo;

import static java.lang.Thread.sleep;

public class Koala extends Tier implements Sozialisiert{

    private String classname = this.getClass().getSimpleName();

    public Koala(){}

    @Override
    public void essen(String nahrung) {
        System.out.println();
        System.out.println(this.classname+ " " + this.name + " frisst " + this.nahrung + "und trinkt Wasser.");
    }

    @Override
    public void schlafenGehen() throws InterruptedException {

        System.out.println();
        System.out.print(this.classname+" "+this.name+" klettert in den Baum und schläft. ");
        String z="...zZz...zZz...";
        for (int i=0;i<z.length();i++){
            System.out.print(z.toCharArray()[i]);
            sleep(200);
        }
    }
}
