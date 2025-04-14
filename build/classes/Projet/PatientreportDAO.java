package Projet;
import java.sql.Connection;
import java.sql.Statement;
public class PatientreportDAO {
    public static boolean savePatientReport(String patientID, String symptome, String diagnostic, String medicaments, String serviceReq, String typeSer) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String query = "INSERT INTO patientreport VALUES ('" + patientID + "','" + symptome + "','" + diagnostic + "','" + medicaments + "','" + serviceReq + "', '" + typeSer + "')";
            st.executeUpdate(query);
            return true;
        } catch (Exception e) {
            e.printStackTrace();  // Log the error
            return false;
        }
    }
}

