package sio.gestionsuivimedical.models;

public class DatasGraph
{
    private int nb;
    private String nomMedecin;

    public DatasGraph(int nb, String nomMedecin) {
        this.nb = nb;
        this.nomMedecin = nomMedecin;
    }

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public String getNomMedecin() {
        return nomMedecin;
    }

    public void setNomMedecin(String nomMedecin) {
        this.nomMedecin = nomMedecin;
    }
}
