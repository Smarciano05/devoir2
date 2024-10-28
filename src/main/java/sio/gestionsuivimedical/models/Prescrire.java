package sio.gestionsuivimedical.models;

public class Prescrire
{
    private int numConsult;
    private int numMedoc;
    private int quantite;

    public Prescrire(int numConsult, int numMedoc, int quantite) {
        this.numConsult = numConsult;
        this.numMedoc = numMedoc;
        this.quantite = quantite;
    }

    public int getNumConsult() {
        return numConsult;
    }

    public void setNumConsult(int numConsult) {
        this.numConsult = numConsult;
    }

    public int getNumMedoc() {
        return numMedoc;
    }

    public void setNumMedoc(int numMedoc) {
        this.numMedoc = numMedoc;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
