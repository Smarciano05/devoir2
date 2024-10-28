package sio.gestionsuivimedical.repositories;

import sio.gestionsuivimedical.models.Prescrire;
import sio.gestionsuivimedical.tools.DataSourceProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class PrescrireRepository implements RepositoryInterface<Prescrire,Integer>
{
    private Connection connection;

    public PrescrireRepository()
    {
        this.connection = DataSourceProvider.getCnx();
    }

    @Override
    public void create(Prescrire obj) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO prescrire( `numConsult`, `numMedoc`, `quantite`) values (?,?,?)");
        preparedStatement.setInt(1,obj.getNumConsult());
        preparedStatement.setInt(2,obj.getNumMedoc());
        preparedStatement.setInt(3,obj.getQuantite());
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    @Override
    public void update(Prescrire obj) throws SQLException {

    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public Prescrire get(Integer integer) {
        return null;
    }

    @Override
    public ArrayList<Prescrire> getAll() throws SQLException {
        return null;
    }
}
