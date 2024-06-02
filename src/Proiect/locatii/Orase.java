package Proiect.locatii;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Orase {

    private String nume;
    private ArrayList<Restaurant> list;

    public Orase(String nume, ArrayList<Restaurant> list) {
        this.nume = nume;
        this.list = list;
    }

    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public ArrayList<Restaurant> getList() {
        return list;
    }
    public void setList(ArrayList<Restaurant> list) {
        this.list = list;
    }

    public void adaugare(KFC kfc){
        list.add(kfc);
    }

    public void stergere(KFC kfc){list.remove(kfc);}

    public void afisare(){
        for(int i =0 ; i < list.size();i++){
            list.get(i).meniu();
            System.out.println("\n");
            list.get(i).nrAngajati();
            System.out.println("\n");
            list.get(i).orar();
            System.out.println("\n");
        }
    }

    public void afisareMeniu(){
        for(int i =0 ; i < list.size();i++){
            list.get(i).meniu();
            System.out.println("\n");
        }
    }

    public void afisareNrAngajati(){
        for(int i =0 ; i < list.size();i++){
            list.get(i).nrAngajati();
            System.out.println("\n");
        }

    }

    public void afisareOrar(){
        for(int i =0 ; i < list.size();i++){
            list.get(i).orar();
            System.out.println("\n");
        }
    }

    public void modificareNume(String nume){
        this.nume = nume;
    }

}
