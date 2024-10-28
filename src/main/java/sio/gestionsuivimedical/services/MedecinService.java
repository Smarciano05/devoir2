package sio.gestionsuivimedical.services;

import sio.gestionsuivimedical.repositories.MedecinRepository;

import java.sql.SQLException;
import java.util.ArrayList;

public class MedecinService
{
    private MedecinRepository medecinRepository;

    public MedecinService() {
        this.medecinRepository = new MedecinRepository() ;
    }

    public ArrayList<String> getAllNomsMedecin() throws SQLException {
        return medecinRepository.getAllNomsMedecin();
    }
}
