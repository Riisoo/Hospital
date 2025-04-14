/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Projet;

import java.sql.Connection;
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
public class ConnexionTest {
    
    public ConnexionTest() {
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
     * Test of getCon method, of class Connexion.
     */
  @Test
public void testGetCon() {
    System.out.println("getCon");

    Connection result = Connexion.getCon();

    // Vérifie que la connexion n'est pas null
    assertNotNull("La connexion à la base de données ne doit pas être null", result);

    // Fermer la connexion proprement si elle a réussi
    try {
        if (result != null && !result.isClosed()) {
            result.close();
        }
    } catch (Exception e) {
        fail("Erreur lors de la fermeture de la connexion : " + e.getMessage());
    }
}

    
}
