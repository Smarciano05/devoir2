package sio.gestionsuivimedical.services;

import sio.gestionsuivimedical.repositories.GraphiqueRepository;

public class GraphiqueService
{
    private GraphiqueRepository graphiqueRepository;

    public GraphiqueService() {
        this.graphiqueRepository = new GraphiqueRepository() ;
    }
}
