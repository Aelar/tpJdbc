import java.sql.*;
import java.util.ArrayList;
public class testEntite {
    // Chaine de connexion
    static final String CONNECT_URL = "jdbc:mysql://localhost:3306/gestionPedaBD";
    static final String LOGIN = "monUser";
    static final String PASSWORD = "monPassword";
    // La requete de test
    static final String req = "SELECT * " +
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

            ArrayList <Etudiants> listEtu = new ArrayList <Etudiants>();


// Affichage du resultat
            while (rset.next()){
                //System.out.print(rset.getInt("NUM_ET") + " ");
                //System.out.print(rset.getString("NOM_ET") + " ");
                //System.out.println(rset.getString("PRENOM_ET"));

                Etudiants et = new Etudiants();

                et.setNumEt(rset.getInt("NUM_ET"));
                et.setNomEt((rset.getString("NOM_ET")));
                et.setPrenomEt(rset.getString("PRENOM_ET"));
                et.setAnnee(rset.getInt("ANNEE"));
                et.setCpEt(rset.getString("CP_ET"));
                et.setVilleEt(rset.getString("VILLE_ET"));
                et.setGroupe(rset.getInt("GROUPE"));



                listEtu.add(et);

            }

            for (Etudiants et : listEtu){
                System.out.println(et);
            }

            ArrayList <Prof> listP = new ArrayList <Prof>();

             String req2 = "SELECT * " +
                    "FROM PROF ";
            System.out.println("Execution de la requete : " + req2 );
            rset = stmt.executeQuery(req2);

            Prof P = new Prof();
            String spe;
            Module trol = new Module();

            while (rset.next())
            {
                spe= rset.getString("MAT_SPEC");
                trol.setCode(spe);
                P.setSpecialite(trol);

                System.out.println(P.getSpecialite());
                System.out.println(rset.getString("NOM_PROF"));
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