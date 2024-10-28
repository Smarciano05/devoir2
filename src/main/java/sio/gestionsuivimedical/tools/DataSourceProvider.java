package sio.gestionsuivimedical.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;

public class DataSourceProvider
{
    private static Connection cnx;

    public DataSourceProvider() throws ClassNotFoundException, SQLException {
        String pilote = "com.mysql.cj.jdbc.Driver";
        Class.forName(pilote);
        cnx = DriverManager.getConnection("jdbc:mysql://localhost/suiviMedical?serverTimezone="
                + TimeZone.getDefault().getID(), "root", "");
    }
    public static Connection getCnx() {
        return cnx;
    }
}