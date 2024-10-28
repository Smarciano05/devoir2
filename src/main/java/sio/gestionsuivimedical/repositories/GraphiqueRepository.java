package sio.gestionsuivimedical.repositories;

import sio.gestionsuivimedical.tools.DataSourceProvider;
import java.sql.Connection;

public class GraphiqueRepository
{
    private Connection connection;

    public GraphiqueRepository()
    {
        this.connection = DataSourceProvider.getCnx();
    }

}
