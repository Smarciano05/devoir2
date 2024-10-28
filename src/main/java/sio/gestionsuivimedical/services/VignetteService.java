package sio.gestionsuivimedical.services;

import sio.gestionsuivimedical.models.Vignette;
import sio.gestionsuivimedical.repositories.VignetteRepository;

import java.sql.SQLException;
import java.util.ArrayList;

public class VignetteService {
    private VignetteRepository vignetteRepository;

    public VignetteService() {
        this.vignetteRepository = new VignetteRepository();
    }

    public void create(Vignette obj) throws SQLException {
        vignetteRepository.create(obj);
    }

    public int getIdByNomVignette(String nomVignette) throws SQLException {
       return vignetteRepository.getIdByNomVignette(nomVignette);
    }
    public ArrayList<String> getAllNoms() throws SQLException {
        return vignetteRepository.getAllNoms();
    }
}
