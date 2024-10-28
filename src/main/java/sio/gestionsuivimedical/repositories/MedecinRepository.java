package sio.gestionsuivimedical.repositories;

import sio.gestionsuivimedical.tools.DataSourceProvider;

import java.sql.*;
import java.util.ArrayList;

public class MedecinRepository
{
    private Connection connection;

    public MedecinRepository()
    {
        this.connection = DataSourceProvider.getCnx();
    }

    public ArrayList<String>getAllNomsMedecin() throws SQLException {
        ArrayList<String>noms = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT medecin.nomMedecin FROM `medecin`");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next())
        {
            noms.add(resultSet.getString("nomMedecin"));
        }
        preparedStatement.close();
        resultSet.close();
        return noms;

    }
}
