package Proiect.locatii;

import java.util.ArrayList;

public class Tara{

    private String nume;
    private ArrayList<Orase> list;

    public Tara(String nume, ArrayList<Orase> list) {
        this.nume = nume;
        this.list = list;
    }

    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public ArrayList<Orase> getList() {
        return list;
    }
    public void setList(ArrayList<Orase> list) {
        this.list = list;
    }

    public void afisare(){
        for(int i = 0 ; i < list.size();i++){
            list.get(i).afisare();
        }
    }

    public void adaugare(Orase oras){
        list.add(oras);
    }
}
