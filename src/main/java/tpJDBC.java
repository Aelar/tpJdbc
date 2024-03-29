import java.sql.*;
public class tpJDBC {
    // Chaine de connexion
    static final String CONNECT_URL = "jdbc:mysql://localhost:3306/gestionPedaBD";
    static final String LOGIN = "monUser";
    static final String PASSWORD = "monPassword";
    // La requete de test
    static final String req = "SELECT NUM_ET, NOM_ET, PRENOM_ET " +
            "FROM ETUDIANT " +
            "WHERE VILLE_ET = 'AIX-EN-PROVENCE'";
    public static void main(String[] args) throws SQLException {
// Objet materialisant la connexion a la base de donnees
        Connection conn = null;
        try {
// Connexion a la base
            System.out.println("Connexion a " + CONNECT_URL);
            conn = ConnexionUnique.getInstance().getConnection();
            System.out.println("Connecte\n");
// Creation d'une instruction SQL
            Statement stmt = conn.createStatement();
// Execution de la requete
            System.out.println("Execution de la requete : " + req );
            ResultSet rset = stmt.executeQuery(req);
// Affichage du resultat
            while (rset.next()){
                System.out.print(rset.getInt("NUM_ET") + " ");
                System.out.print(rset.getString("NOM_ET") + " ");
                System.out.println(rset.getString("PRENOM_ET"));
            }
// Fermeture de l'instruction (liberation des ressources)
            stmt.close();
            System.out.println("\nOk.\n");
        } catch (SQLException e) {
            e.printStackTrace();// Arggg!!!
            System.out.println(e.getMessage() + "\n");
        } finally {
            if (conn != null) {
// Deconnexion de la base de donnees
                conn.close();
            }
        }
    }
}