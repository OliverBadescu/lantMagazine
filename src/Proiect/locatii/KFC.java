package Proiect.locatii;

public class KFC extends Restaurant{

    private String orar;
    private int nrAngajati;
    private String meniu;

    public KFC(String orar, int nrAngajati, String meniu) {
        this.orar = orar;
        this.nrAngajati = nrAngajati;
        this.meniu = meniu;
    }


    @Override
    public void meniu(){
        System.out.println(this.meniu);
    }

    @Override
    public void nrAngajati(){
        System.out.println(this.nrAngajati);
    }

    @Override
    public void orar(){
        System.out.println(this.orar);
    }

    public void adaugaAngajat(){
        this.nrAngajati++;
    }

    public void adaugaLaMeniu(String txt){
        this.meniu += txt;
    }

    public void modificareOrar(String orar){
        this.orar = orar;
    }


}
