package sio.gestionsuivimedical.controllers;

import sio.gestionsuivimedical.services.GraphiqueService;

public class GraphiqueController
{
    private GraphiqueService graphiqueService;

    public GraphiqueController() {
        this.graphiqueService = new GraphiqueService();
    }

}
