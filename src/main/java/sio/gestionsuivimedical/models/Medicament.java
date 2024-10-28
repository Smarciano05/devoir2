package sio.gestionsuivimedical.models;

public class Medicament
{
    private int idMedicament;
    private String nomMedicament;
    private double prixMedicament;
    private int numVignette;
    private int quantite;

    public Medicament(String nomMedicament, double prixMedicament, int numVignette) {
        this.nomMedicament = nomMedicament;
        this.prixMedicament = prixMedicament;
        this.numVignette = numVignette;
    }

    public Medicament(int idMedicament, String nomMedicament, double prixMedicament, int quantite) {
        this.idMedicament = idMedicament;
        this.nomMedicament = nomMedicament;
        this.prixMedicament = prixMedicament;
        this.quantite = quantite;
    }

    public int getIdMedicament() {
        return idMedicament;
    }

    public void setIdMedicament(int idMedicament) {
        this.idMedicament = idMedicament;
    }

    public String getNomMedicament() {
        return nomMedicament;
    }

    public void setNomMedicament(String nomMedicament) {
        this.nomMedicament = nomMedicament;
    }

    public double getPrixMedicament() {
        return prixMedicament;
    }

    public void setPrixMedicament(double prixMedicament) {
        this.prixMedicament = prixMedicament;
    }

    public int getNumVignette() {
        return numVignette;
    }

    public void setNumVignette(int numVignette) {
        this.numVignette = numVignette;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
