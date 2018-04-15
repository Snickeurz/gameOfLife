/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicol
 */
public class GameoflifeTest {
    
    public GameoflifeTest() {
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
     * Test of getNbCol method, of class Gameoflife.
     */
    @Test
    public void testGetNbCol() {
        System.out.println("getNbCol");
        Gameoflife instance = new Gameoflife();
        int expResult = 0;
        int result = instance.getNbCol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNbCol method, of class Gameoflife.
     */
    @Test
    public void testSetNbCol() {
        System.out.println("setNbCol");
        int nbCol = 0;
        Gameoflife instance = new Gameoflife();
        instance.setNbCol(nbCol);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNbLigne method, of class Gameoflife.
     */
    @Test
    public void testGetNbLigne() {
        System.out.println("getNbLigne");
        Gameoflife instance = new Gameoflife();
        int expResult = 0;
        int result = instance.getNbLigne();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNbLigne method, of class Gameoflife.
     */
    @Test
    public void testSetNbLigne() {  
        System.out.println("setNbLigne");
        int nbLigne = 0;
        Gameoflife instance = new Gameoflife();
        instance.setNbLigne(nbLigne);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class Gameoflife.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        Gameoflife instance = new Gameoflife();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterate method, of class Gameoflife.
     */
    @Test
    public void testIterate() {
        System.out.println("iterate");
        Gameoflife instance = new Gameoflife();
        instance.iterate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNbVoisinVivant method, of class Gameoflife.
     */
    @Test
    public void testGetNbVoisinVivant() {
        System.out.println("getNbVoisinVivant");
        System.out.println("IsCelleVivant");
        File f = new File("test/simple.txt");
        Gameoflife result;
        try {
            result = Gameoflife.fromFile(f);
            assertEquals(2, result.getNbVoisinVivant(0, 0));
            assertEquals(3, result.getNbVoisinVivant(0, 1));
            assertEquals(2, result.getNbVoisinVivant(1, 2));
            
            assertEquals(1, result.getNbVoisinVivant(1, 0));
            assertEquals(2, result.getNbVoisinVivant(1, 2));
            assertEquals(1, result.getNbVoisinVivant(1, 3));
            
            assertEquals(2, result.getNbVoisinVivant(1, 1));
            assertEquals(3, result.getNbVoisinVivant(1, 1));
            assertEquals(2, result.getNbVoisinVivant(1, 1));            
            
        } catch (Exception e) {
        }
    }

    /**
     * Test of calculerNouvelEtat method, of class Gameoflife.
     */
    @Test
    public void testCalculerNouvelEtat() {
        System.out.println("calculerNouvelEtat");
        int etatCourant = 0;
        int nbVoisin = 0;
        Gameoflife instance = new Gameoflife();
        int expResult = 0;
        int result = instance.calculerNouvelEtat(etatCourant, nbVoisin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVivant method, of class Gameoflife.
     */
    @Test
    public void testSetVivant() {
        System.out.println("setVivant");
        int ligne = 0;
        int col = 0;
        Gameoflife instance = new Gameoflife();
        instance.setVivant(ligne, col);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCellVivant method, of class Gameoflife.
     */
    @Test
    public void testIsCellVivant() {
        System.out.println("isCellVivant");
        int ligne = 0;
        int col = 0;
        Gameoflife instance = new Gameoflife();
        int expResult = 0;
        int result = instance.isCellVivant(ligne, col);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of paint method, of class Gameoflife.
     */
    @Test
    public void testPaint() {
        System.out.println("paint");
        Graphics g = null;
        Gameoflife instance = new Gameoflife();
        instance.paint(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of redraw method, of class Gameoflife.
     */
    @Test
    public void testRedraw() {
        System.out.println("redraw");
        Gameoflife instance = new Gameoflife();
        instance.redraw();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fromFile method, of class Gameoflife.
     */
    @Test
    public void testFromFile() throws Exception {
        System.out.println("fromFile");
        File f = new File("test/ship.txt");        
        Gameoflife result = Gameoflife.fromFile(f);
        assertEquals(20, result.getNbLigne());
        assertEquals(20, result.getNbCol());
        assertEquals(0, result.isCellVivant(0, 0));
        // TODO review the generated test code and remove the default call to fail.        
    }

    
    
    
}
