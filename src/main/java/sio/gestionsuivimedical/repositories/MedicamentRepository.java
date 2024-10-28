package sio.gestionsuivimedical.repositories;

import sio.gestionsuivimedical.models.Medicament;
import sio.gestionsuivimedical.tools.DataSourceProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MedicamentRepository implements RepositoryInterface<Medicament,Integer>
{
    private Connection connection;

    public MedicamentRepository()
    {
        this.connection = DataSourceProvider.getCnx();
    }

    @Override
    public void create(Medicament obj) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO `medicament`( `nomMedoc`, `prixMedoc`, `numVignette`) values (?,?,?)");
        preparedStatement.setString(1,obj.getNomMedicament());
        preparedStatement.setDouble(2,obj.getPrixMedicament());
        preparedStatement.setInt(3,obj.getNumVignette());
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    @Override
    public void update(Medicament obj) throws SQLException {

    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public Medicament get(Integer integer) {
        return null;
    }

    @Override
    public ArrayList<Medicament> getAll() throws SQLException {
        return null;
    }


    public ArrayList<Medicament> getAllBy() throws SQLException {
        ArrayList<Medicament>medicaments = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT DISTINCT idMedoc,nomMedoc,prixMedoc,prescrire.quantite FROM medicament INNER JOIN prescrire on medicament.idMedoc = prescrire.numMedoc  ");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            Medicament medicament = new Medicament(resultSet.getInt("idMedoc"),resultSet.getString("nomMedoc"),resultSet.getDouble("prixMedoc"),resultSet.getInt("quantite"));
            medicaments.add(medicament);

        }
        return medicaments;
    }

}
