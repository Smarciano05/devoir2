package sio.gestionsuivimedical.services;

import sio.gestionsuivimedical.models.Medicament;
import sio.gestionsuivimedical.repositories.MedicamentRepository;
import sio.gestionsuivimedical.repositories.VignetteRepository;

import java.sql.SQLException;
import java.util.ArrayList;

public class MedicamentService
{
    private MedicamentRepository medicamentRepository;

    private VignetteRepository vignetteRepository;

    public MedicamentService() {
        this.medicamentRepository = new MedicamentRepository() ;
        this.vignetteRepository = new VignetteRepository() ;
    }

    public void create(Medicament obj) throws SQLException {
        medicamentRepository.create(obj);
    }
    public ArrayList<Medicament> getAll() throws SQLException {
       return medicamentRepository.getAllBy();
    }
    public int getIdByNumMedoc(int numMedoc) throws SQLException{
        return medicamentRepository.getIdByNumMedoc(numMedoc);
    }
}
