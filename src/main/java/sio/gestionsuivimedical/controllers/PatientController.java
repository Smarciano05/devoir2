package sio.gestionsuivimedical.controllers;

import sio.gestionsuivimedical.services.PatientService;

import java.sql.SQLException;
import java.util.ArrayList;

public class PatientController
{
    private PatientService patientService;

    public PatientController() {
        this.patientService = new PatientService();
    }

    public ArrayList<String> getAllNomsPatient() throws SQLException {
        return patientService.getAllNomsPatient();
    }
}
