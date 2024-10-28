package sio.gestionsuivimedical.repositories;

import sio.gestionsuivimedical.tools.DataSourceProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PatientRepository
{
    private Connection connection;

    public PatientRepository()
    {
        this.connection = DataSourceProvider.getCnx();
    }

    public ArrayList<String>getAllNomsPatient() throws SQLException {
        ArrayList<String>noms = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT patient.nomPatient FROM `patient`");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next())
        {
            noms.add(resultSet.getString("nomPatient"));
        }
        preparedStatement.close();
        resultSet.close();
        return noms;
    }

}
