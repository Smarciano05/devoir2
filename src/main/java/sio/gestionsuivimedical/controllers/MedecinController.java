package sio.gestionsuivimedical.controllers;

import sio.gestionsuivimedical.services.MedecinService;

import java.sql.SQLException;
import java.util.ArrayList;

public class MedecinController
{
    private MedecinService medecinService;

    public MedecinController() {
        this.medecinService = new MedecinService();
    }
    public ArrayList<String> getAllNomsMedecin() throws SQLException {
        return  medecinService.getAllNomsMedecin();
    }
}
