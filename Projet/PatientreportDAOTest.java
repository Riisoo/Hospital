/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Projet;

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
public class PatientreportDAOTest {
    
    public PatientreportDAOTest() {
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

  
   @Test
    public void testSavePatientReportValidData() {
        System.out.println("savePatientReport avec des donnees valides");
        String patientID = "10";
        String symptome = "Fièvre";
        String diagnostic = "Grippe";
        String medicaments = "Paracétamol";
        String serviceReq = "YES";
        String typeSer = "URgence";
        boolean expResult = false;
        boolean result = PatientreportDAO.savePatientReport(patientID, symptome, diagnostic, medicaments, serviceReq, typeSer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
