package sio.gestionsuivimedical.controllers;

import sio.gestionsuivimedical.models.Medicament;
import sio.gestionsuivimedical.services.MedicamentService;

import java.sql.SQLException;
import java.util.ArrayList;

public class MedicamentController
{
    private MedicamentService medicamentService;

    public MedicamentController() {
        this.medicamentService = new MedicamentService();
    }

    public void create(Medicament obj) throws SQLException {
        medicamentService.create(obj);
    }
    public ArrayList<Medicament> getAllBy() throws SQLException {
        return medicamentService.getAll();
    }
    public int getIdByNumMedoc(int numMedoc) throws SQLException{
        return medicamentService.getIdByNumMedoc(numMedoc);
    }
}
