package com.krieger.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class Tiergehege {

    public static boolean futterBereit = false;

    public static void starteFuetterung(List<Tier> tiere ){

        System.out.println();
        for(int i=0;i<tiere.size();i++){
            if (i==(tiere.size()-1)) {
                System.out.print(tiere.get(i).nahrung + " ");
            } else{
                System.out.print(tiere.get(i).nahrung + " und ");

            }
        }
        System.out.println("sind jetzt auf dem Futterplatz, die Fütterung kann beginnen.");
        futterBereit=true;
    }

    public static void starteNachtruhe(List<Tier> tiere ){

        System.out.println();
        System.out.print("Es ist 22 Uhr, das Licht wird ausgeschaltet. \nDer Schlafplatz von ");
       // for (Tier tier : tiere){
        for(int i=0;i<tiere.size();i++){
            if (i==(tiere.size()-1)) {
                System.out.print(tiere.get(i).art + " " + tiere.get(i).name + " ");
            } else{
                System.out.print(tiere.get(i).art + " " + tiere.get(i).name + " und ");
            }
        } System.out.println("ist vorbereitet. ");
    }

    public static int menu(Scanner scanner){
        System.out.println("\n");
        System.out.print("********************************\n" +
                "*           Tiergehege         *\n" +
                "********************************\n\n" +
                "\tOptionen:\n" +
                "\t\t(1) - Starte Fütterung\n" +
                "\t\t(2) - Starte Nachtruhe\n" +
                "\t\t(3) - Tier hinzufügen\n" +
                "\t\t(4) - Tiere anzeigen\n\n" +
                "\t\t(0) - Ende... \n" +
                "********************************\n"+
                "Eingabe: ");
            int temp= scanner.nextInt();
        System.out.println("--------------------------------\n");
        return temp;
    }

    public static void hinzufuegen(List<Tier> tiere, Scanner scanner){
        String art = "Unbekannt";
        String name = "Unbekannt";
        int alter = 0;
        double groesse = 0;
        double gewicht = 0;
        String nahrung = "Unbekannt";
        String ernaehrung = "Unbekannt";

        System.out.println();
        scanner.nextLine();
        System.out.print("\t- Tierart: ");
        art = scanner.next();
        System.out.print("\t- Name: ");
        name = scanner.next();
        System.out.print("\t- alter: ");
        alter = scanner.nextInt();
        System.out.print("\t- Größe: ");
        groesse = scanner.nextDouble();
        System.out.print("\t- Gewicht: ");
        gewicht = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("\t- Nahrung: ");
        nahrung = scanner.nextLine();

        System.out.println();
        tiere.add(
                new TierImGehege(art,name,alter,groesse,gewicht,nahrung)
        );
    }

    public static void zeigeTiere(List<Tier> tiere){
        int i=1;
        for (Tier tier : tiere){
            System.out.println("\t- "+i+" -\nTierart: \t"+tier.art+"\nName: \t\t"+tier.name+"\nAlter: \t\t"+tier.alter+
                    "\nGröße: \t\t"+tier.groesse+"\nGewicht: \t"+tier.gewicht+"\nNahrung: \t" +tier.nahrung);
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        List<Tier> tiere = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int input;
        boolean on=true;

        tiere.add(
                new TierImGehege("Kangoroo", "Bob", 12, 162, 77, "frisches Heu")
        );
        tiere.add(
                new TierImGehege("Koala", "Percy", 6, 68, 34, "Eukalyptus-Blätter")
        );
        

        while (on) {
            input = menu(scanner);

            switch (input){
                case 1 : starteFuetterung(tiere);
                    for (Tier tier : tiere){
                        tier.essen(tier.nahrung);
                    } break;
                case 2 : starteNachtruhe(tiere);
                    for (Tier tier : tiere){
                        tier.schlafenGehen();
                    } break;
                case 3 :
                    hinzufuegen(tiere,scanner);
                    //System.out.println("\n... Noch nicht implementiert ┌( ಠ_ಠ)┘...\n");
                    break;
                case 4 :
                    zeigeTiere(tiere); break;
                case 0 : on = false; break;
                default:
                    System.out.println("\n... Ungültige Eingabe, bitte erneut versuchen...\n"); break;
            }
        }
    }
}
