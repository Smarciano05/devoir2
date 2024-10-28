package sio.gestionsuivimedical.models;

public class Vignette
{
    private int idVignette;
    private String nomVignette;
    private int tauxRemboursement;

    public Vignette(int idVignette, String nomVignette, int tauxRemboursement) {
        this.idVignette = idVignette;
        this.nomVignette = nomVignette;
        this.tauxRemboursement = tauxRemboursement;
    }

    public Vignette(String nomVignette, int tauxRemboursement) {
        this.nomVignette = nomVignette;
        this.tauxRemboursement = tauxRemboursement;
    }

    public int getIdVignette() {
        return idVignette;
    }

    public void setIdVignette(int idVignette) {
        this.idVignette = idVignette;
    }

    public String getNomVignette() {
        return nomVignette;
    }

    public void setNomVignette(String nomVignette) {
        this.nomVignette = nomVignette;
    }

    public int getTauxRemboursement() {
        return tauxRemboursement;
    }

    public void setTauxRemboursement(int tauxRemboursement) {
        this.tauxRemboursement = tauxRemboursement;
    }
}
