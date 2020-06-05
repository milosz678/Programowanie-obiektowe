package pl.indykiewicz.firstapp;

import java.util.ArrayList;

public class Firma {

    ArrayList<Pracownik> workers;

    public Firma(){
        workers = new ArrayList<Pracownik>();
    }

    public Firma(Pracownik pracownik){
        workers = new ArrayList<Pracownik>();
        workers.add(pracownik);
    }

    public void displayData(){
       for(Pracownik worker : workers){
           System.out.println("==============================");
           System.out.println("Imię pracownika: " + worker.name +"\nNazwisko pracownika: " + worker.surname +
                "\nWiek pracownika: " + worker.age);
           System.out.println("==============================");
       }
    }

}
