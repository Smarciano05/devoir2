package sio.gestionsuivimedical.models;

import java.time.LocalDate;

public class Consultation
{
    private int idConsultation;
    private LocalDate dateConsultation;
    private int numPatient;
    private int numMedecin;

    public Consultation(LocalDate dateConsultation, int numPatient, int numMedecin) {
        this.dateConsultation = dateConsultation;
        this.numPatient = numPatient;
        this.numMedecin = numMedecin;
    }

    public int getIdConsultation() {
        return idConsultation;
    }

    public void setIdConsultation(int idConsultation) {
        this.idConsultation = idConsultation;
    }

    public LocalDate getDateConsultation() {
        return dateConsultation;
    }

    public void setDateConsultation(LocalDate dateConsultation) {
        this.dateConsultation = dateConsultation;
    }

    public int getNumPatient() {
        return numPatient;
    }

    public void setNumPatient(int numPatient) {
        this.numPatient = numPatient;
    }

    public int getNumMedecin() {
        return numMedecin;
    }

    public void setNumMedecin(int numMedecin) {
        this.numMedecin = numMedecin;
    }
}
