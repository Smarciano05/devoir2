package sio.gestionsuivimedical.services;

import sio.gestionsuivimedical.models.Consultation;
import sio.gestionsuivimedical.repositories.ConsultationRepository;

import java.sql.SQLException;

public class ConsultationService
{
    private ConsultationRepository consultationRepository;

    public ConsultationService() {
        this.consultationRepository = new ConsultationRepository() ;
    }

    public void create(Consultation obj) throws SQLException {
        consultationRepository.create(obj);
    }
}
