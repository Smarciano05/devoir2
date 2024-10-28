package sio.gestionsuivimedical.services;

import sio.gestionsuivimedical.repositories.PatientRepository;

import java.sql.SQLException;
import java.util.ArrayList;

public class PatientService
{
    private PatientRepository patientRepository;

    public PatientService() {
        this.patientRepository = new PatientRepository() ;
    }

    public ArrayList<String> getAllNomsPatient() throws SQLException {
        return patientRepository.getAllNomsPatient();
    }
}
