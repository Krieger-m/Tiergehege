package com.krieger.demo;

import static java.lang.Thread.sleep;

public class TierImGehege extends Tier{

    public TierImGehege(String art, String name, int alter, double groesse, double gewicht, String nahrung) {
        super(art, name, alter, groesse, gewicht, nahrung);
    }

    @Override
    public void essen(String nahrung) {
        System.out.println();
        System.out.println(this.art + " " + this.name + " frisst " + this.nahrung + " und trinkt Wasser.");
    }

    @Override
    public void schlafenGehen() throws InterruptedException {
        System.out.println();
        System.out.print(this.art+" "+this.name+" legt sich hin und schläft. （︶o︶）");
        String z=" ...zZz...zZz...";

        for (int i=0;i<z.length();i++){
            System.out.print(z.toCharArray()[i]);
            sleep(200);
        }
    }
}
