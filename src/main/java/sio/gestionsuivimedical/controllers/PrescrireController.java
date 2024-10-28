package sio.gestionsuivimedical.controllers;

import sio.gestionsuivimedical.models.Prescrire;
import sio.gestionsuivimedical.services.PrescrireService;

import java.sql.SQLException;

public class PrescrireController
{
    private PrescrireService prescrireService;

    public PrescrireController() {
        this.prescrireService = new PrescrireService();
    }

    public void create(Prescrire obj) throws SQLException {
        prescrireService.create(obj);
    }
}
