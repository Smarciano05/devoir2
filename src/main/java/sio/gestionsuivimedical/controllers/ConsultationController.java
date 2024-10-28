package sio.gestionsuivimedical.controllers;

import sio.gestionsuivimedical.models.Consultation;
import sio.gestionsuivimedical.services.ConsultationService;

import java.sql.SQLException;

public class ConsultationController
{
    private ConsultationService consultationService;

    public ConsultationController() {
        this.consultationService = new ConsultationService();
    }

    public void create(Consultation obj) throws SQLException {
        consultationService.create(obj);
    }
}
