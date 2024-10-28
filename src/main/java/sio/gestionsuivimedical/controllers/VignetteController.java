package sio.gestionsuivimedical.controllers;

import sio.gestionsuivimedical.models.Vignette;
import sio.gestionsuivimedical.services.VignetteService;

import java.sql.SQLException;
import java.util.ArrayList;

public class VignetteController
{
    private VignetteService vignetteService;

    public VignetteController() {
        this.vignetteService = new VignetteService();
    }

    public void create(Vignette obj) throws SQLException {
        vignetteService.create(obj);
    }
    public int getIdByNomVignette(String nomVignette) throws SQLException{
        return  vignetteService.getIdByNomVignette(nomVignette);
    }
    public ArrayList<String> getAllNoms() throws SQLException {
        return vignetteService.getAllNoms();
    }

}
