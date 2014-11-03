import java.sql.*;

public final class ConnexionUnique {
    private
    static Connection connection;
    static ConnexionUnique instance;
    static final String CONNECT_URL = "jdbc:mysql://localhost:3306/gestionPedaBD";
    static final String LOGIN = "monUser";
    static final String PASSWORD = "monPassword";
    ConnexionUnique ()
    {
        try {
            connection= DriverManager.getConnection(CONNECT_URL,LOGIN,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public
    static Connection getConnection()
    {
        return connection;
    }
    static ConnexionUnique getInstance()
    {

        if(instance == null)
            instance = new ConnexionUnique();
        return instance;
    }

}