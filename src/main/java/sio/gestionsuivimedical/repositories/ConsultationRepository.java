package sio.gestionsuivimedical.repositories;

import sio.gestionsuivimedical.models.Consultation;
import sio.gestionsuivimedical.tools.DataSourceProvider;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

public class ConsultationRepository implements RepositoryInterface<Consultation,Integer>
{
    private Connection connection;

    public ConsultationRepository()
    {
        this.connection = DataSourceProvider.getCnx();
    }


    @Override
    public void create(Consultation obj) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO `consultation`(`idConsult`, `dateConsult`, `numPatient`, `numMedecin`) values (?,?,?,?)");
        preparedStatement.setInt(1,obj.getIdConsultation());
        preparedStatement.setInt(3,obj.getNumPatient());
        preparedStatement.setInt(4,obj.getNumMedecin());
        preparedStatement.executeUpdate();
        preparedStatement.close();

    }

    @Override
    public void update(Consultation obj) throws SQLException {

    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public Consultation get(Integer integer) {
        return null;
    }

    @Override
    public ArrayList<Consultation> getAll() throws SQLException {
        return null;
    }




}
