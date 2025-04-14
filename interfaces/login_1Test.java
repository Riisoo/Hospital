/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package interfaces;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class login_1Test {

    public login_1Test() {
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
     * Test positif de verifierConnexion (connexion valide).
     */
    @Test
    public void testVerifierConnexionValide() {
        System.out.println("verifierConnexion - valide");
        String nom = "Rime";
        String motDePasse = "123";
        login_1 instance = new login_1();
        boolean result = instance.verifierConnexion(nom, motDePasse);
        assertTrue("La connexion devrait réussir avec des identifiants valides", result);
    }

    /**
     * Test négatif de verifierConnexion (connexion invalide).
     */
    @Test
    public void testVerifierConnexionInvalide() {
        System.out.println("verifierConnexion - invalide");
        String nom = "Admin";
        String motDePasse = "456";
        login_1 instance = new login_1();
        boolean result = instance.verifierConnexion(nom, motDePasse);
        assertFalse("La connexion devrait échouer avec des identifiants invalides", result);
    }

    /**
     * Test du main (facultatif sauf si tu as une logique importante dedans).
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        login_1.main(args);
        // Pas d'assertion ici si le main ne fait rien de testable
    }
}
