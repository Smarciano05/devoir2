package sio.gestionsuivimedical.services;

import sio.gestionsuivimedical.models.Prescrire;
import sio.gestionsuivimedical.repositories.ConsultationRepository;
import sio.gestionsuivimedical.repositories.PrescrireRepository;

import java.sql.SQLException;

public class PrescrireService
{
    private PrescrireRepository prescrireRepository;
    private ConsultationRepository consultationRepository;

    public PrescrireService() {
        this.prescrireRepository = new PrescrireRepository() ;
        this.consultationRepository = new ConsultationRepository() ;
    }
    public void create(Prescrire obj) throws SQLException {
        prescrireRepository.create(obj);
    }

}
