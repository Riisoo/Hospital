/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Projet;

import hôpital.Patient;
import java.sql.ResultSet;
import javax.swing.table.TableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class PatientDAOTest {
    
    public PatientDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ajouterPatient method, of class PatientDAO.
     */
    @Test
    public void testAjouterPatient() throws Exception {
        System.out.println("ajouterPatient");
        Patient patient = new Patient(
            "11",            
            "Amal",         
            "0645986700",     
            "23",               
            "Femelle",           
            "Kenitra",       
            "O+"                
        );
        boolean result = PatientDAO.ajouterPatient(patient);
        assertTrue("Le patient devrait être ajouté avec succès", result);
    }

    /**
     * Test of chercherParId method, of class PatientDAO.
     */
    
     @Test
    public void testChercherParId() throws Exception {
        System.out.println("chercherParId");
        String idP = "5";
        ResultSet result = PatientDAO.chercherParId(idP);
        assertNotNull("Le ResultSet ne doit pas être null", result);
        if (result.next()) {
            String patientId = result.getString("idP"); 
            assertEquals("L'ID du patient ne correspond pas", idP, patientId);
        } else {
            fail("Aucun patient trouvé avec l'ID: " + idP);
        }
    }

    /**
     * Test of updatePatient method, of class PatientDAO.
     */
     @Test
    public void testUpdatePatient() {
        System.out.println("updatePatient");
        String idP = "11";
        String nomP = "Amal";
        String tel = "0645986700";
        String age = "23";
        String sexe = "Femelle";
        String adresse = "Kenitra";
        String groupeSanguin = "O+";

        PatientDAO instance = new PatientDAO();
        boolean expResult = false;
        boolean result = instance.updatePatient(idP, nomP, tel, age, sexe, adresse, groupeSanguin);
        assertEquals("La mise à jour du patient devrait réussir", expResult, result);
    }

    /**
     * Test of getPatientsWithReports method, of class PatientDAO.
     */
     @Test
    public void testGetPatientsWithReports() throws Exception {
        System.out.println("getPatientsWithReports");
        ResultSet rs = PatientDAO.getPatientsWithReports();
        assertNotNull("Le ResultSet ne doit pas être null", rs);
        boolean hasData = rs.next();
        assertTrue("Le ResultSet doit contenir au moins une ligne", hasData);
    }


    /**
     * Test of getPatientsWithReportsTableModel method, of class PatientDAO.
     */
    @Test
public void testGetPatientsWithReportsTableModel() throws Exception {
    System.out.println("getPatientsWithReportsTableModel");
    TableModel model = PatientDAO.getPatientsWithReportsTableModel();
    assertNotNull("Le TableModel ne doit pas être null", model);
    assertTrue("Le TableModel doit contenir au moins une ligne", model.getRowCount() > 0);
}


}
