package Projet;
import hôpital.Patient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
public class PatientDAO {
    public static boolean ajouterPatient(Patient patient) throws Exception {
        Connection con = Connexion.getCon();
        String sql = "INSERT INTO patient (idP, NomP, Tel, Age, Sexe, Adresse, GroupeSanguin) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, patient.getIdP());
        pst.setString(2, patient.getNomP());
        pst.setString(3, patient.getTel());
        pst.setString(4, patient.getAge());
        pst.setString(5, patient.getSexe());
        pst.setString(6, patient.getAdresse());
        pst.setString(7, patient.getGroupeSanguin());
        System.out.println("Paramètre 7 : " + patient.getGroupeSanguin());
        int rowsInserted = pst.executeUpdate();
        pst.close();
        con.close();
        return rowsInserted > 0;
    }
    public static ResultSet chercherParId(String idP) throws Exception {
        Connection con = Connexion.getCon();
        String sql = "SELECT * FROM patient WHERE idP = ?";
        PreparedStatement pst = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        pst.setString(1, idP);
        return pst.executeQuery(); 
    }
    public boolean updatePatient(String idP, String nomP,String tel, String age, String sexe, String adresse, String groupeSanguin) {
        // Connexion à la base de données
        try (Connection con = Connexion.getCon()) {
            String query = "UPDATE patient SET NomP=?,Tel=?, Age=?, Sexe=?, Adresse=?, GroupeSanguin=? WHERE idP=?";
            try (PreparedStatement ps = con.prepareStatement(query)) {
                ps.setString(1, nomP);
                ps.setString(2, tel);
                ps.setString(3, age);
                ps.setString(4, sexe);
                ps.setString(5, adresse);
                ps.setString(6, groupeSanguin);
                ps.setString(7, idP);
                
                int rowsAffected = ps.executeUpdate();
                return rowsAffected > 0;  
            }
        } catch (Exception e) {
            System.err.println("Erreur lors de la mise à jour du patient : " + e.getMessage());
            return false;
        }
    }
      public static ResultSet getPatientsWithReports() throws Exception {
        Connection con = Connexion.getCon();
        Statement st = con.createStatement();
        return st.executeQuery("SELECT * FROM patient p INNER JOIN patientreport pr ON p.idP = pr.PatientID");
    }

    
    public static TableModel getPatientsWithReportsTableModel() throws Exception {
        ResultSet rs = getPatientsWithReports();
        return DbUtils.resultSetToTableModel(rs);
    }
}