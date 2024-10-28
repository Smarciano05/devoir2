package sio.gestionsuivimedical.repositories;

import sio.gestionsuivimedical.models.Vignette;
import sio.gestionsuivimedical.tools.DataSourceProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VignetteRepository  implements RepositoryInterface <Vignette,Integer> {

    private Connection connection;

    public VignetteRepository()
    {
        this.connection = DataSourceProvider.getCnx();
    }


    @Override
    public void create(Vignette obj) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO `vignette`( `nomVignette`, `tauxRemb`) VALUES (?,?)");
        preparedStatement.setString(1,obj.getNomVignette());
        preparedStatement.setInt(2,obj.getTauxRemboursement());
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    @Override
    public void update(Vignette obj) throws SQLException {

    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public Vignette get(Integer integer) {
        return null;
    }

    @Override
    public ArrayList<Vignette> getAll() throws SQLException {
        return null;
    }
    public int getIdByNomVignette(String nomVignette) throws SQLException{
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT vignette.idVignette FROM vignette WHERE vignette.nomVignette = ?");
        preparedStatement.setString(1,nomVignette);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        int idVignette = resultSet.getInt("idVignette");
        return idVignette;
    }
    public ArrayList<String> getAllNoms() throws SQLException {
        ArrayList<String> noms = new ArrayList<>();

        PreparedStatement preparedStatement = connection.prepareStatement("select nomVignette from vignette");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next())
        {
            noms.add(resultSet.getString("nomVignette"));
        }
        preparedStatement.close();
        resultSet.close();
        return noms;
    }
}
