/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit9_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Agustín Erkiletlian Battista
 */
public class AlumnoTest {
    
    public AlumnoTest() {
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
     * Test of validaNif method, of class Alumno.
     */
    @Test
    public void testValidaNif() {
        System.out.println("validaNif");
        String nif = "4ASD28231";
        String nif2 = "3454234W";
        String nif3 = "48668338X";
        Alumno instance = new Alumno();
        boolean expResult = false;
        boolean expResult2 = true;
        boolean result = instance.validaNif(nif);
        boolean result2 = instance.validaNif(nif2);
        boolean result3 = instance.validaNif(nif3);
        assertEquals(expResult, result);
        assertEquals(expResult, result2);
        assertEquals(expResult, result3);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculaTasaMatricula method, of class Alumno.
     */
    @Test
    public void testCalculaTasaMatricula() {
        System.out.println("calculaTasaMatricula");
        
        Alumno instance = new Alumno();
        
        int edad = 10;
        boolean familiaNumerosa = false;
        boolean repetidor = true;
        float expResult = 2000.0F;
        float result = instance.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertEquals(expResult, result, 0.0);
        
        int edad2 = 15;
        boolean familiaNumerosa2 = true;
        boolean repetidor2 = false;
        float expResult2 = 250.0F;
        float result2 = instance.calculaTasaMatricula(edad2, familiaNumerosa2, repetidor2);
        assertEquals(expResult2, result2, 0.0);
        
        int edad3 = 20;
        boolean familiaNumerosa3 = false;
        boolean repetidor3 = false;
        float expResult3 = 500.0F;
        float result3 = instance.calculaTasaMatricula(edad3, familiaNumerosa3, repetidor3);
        assertEquals(expResult3, result3, 0.0);
        
        int edad4 = 55;
        boolean familiaNumerosa4 = false;
        boolean repetidor4 = false;
        float expResult4 = 250.0F;
        float result4 = instance.calculaTasaMatricula(edad4, familiaNumerosa4, repetidor4);
        assertEquals(expResult4, result4, 0.0);
        
        int edad5 = 70;
        boolean familiaNumerosa5 = true;
        boolean repetidor5 = false;
        float expResult5 = 150.0F;
        float result5 = instance.calculaTasaMatricula(edad5, familiaNumerosa5, repetidor5);
        assertEquals(expResult5, result5, 0.0);
    }
    
    public static void main(String[] args)
    {
        AlumnoTest pruebas = new AlumnoTest();
        
        pruebas.testValidaNif();
        pruebas.testCalculaTasaMatricula();
    }
    
}
