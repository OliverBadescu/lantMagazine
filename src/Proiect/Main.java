package Proiect;

import Proiect.locatii.KFC;
import Proiect.locatii.Orase;
import Proiect.locatii.Restaurant;
import Proiect.locatii.Tara;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        KFC kfc = new KFC("12-19", 10, "TEsst");
        KFC kfc1 = new KFC("10-23", 9, "meniu");
        KFC kfc2 = new KFC("9-23", 15, "test");
        KFC kfc3 = new KFC("7-7", 29, "pui");


        ArrayList<Restaurant> kfcList = new ArrayList<>();
        kfcList.add(kfc);
        kfcList.add(kfc1);

        ArrayList<Restaurant> kfclist2 = new ArrayList<>();
        kfclist2.add(kfc2);
        kfclist2.add(kfc3);

        Orase oras = new Orase("Sibiu", kfcList);

        Orase oras1 = new Orase("Bucuresti", kfclist2);

        ArrayList<Orase> orasList = new ArrayList<>();
        orasList.add(oras);
        orasList.add(oras1);

        Tara tara = new Tara("Romania", orasList);

        oras.afisareMeniu();


    }
}