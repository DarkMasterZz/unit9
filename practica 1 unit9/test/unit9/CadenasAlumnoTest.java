/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit9;

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
public class CadenasAlumnoTest {
    
    public CadenasAlumnoTest() {
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
     * Test of sonIguales method, of class CadenasAlumno.
     */
    @Test
    public void testSonIguales() {
        System.out.println("sonIguales");
        String cadena1 = "entornos";
        String cadena2 = "ento";
        boolean expResult = cadena1.equals(cadena2);
        boolean result = CadenasAlumno.sonIguales(cadena1, cadena2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esMayor method, of class CadenasAlumno.
     */
    @Test
    public void testEsMayor() {
        System.out.println("esMayor");
        String cadena1 = "mesa";
        String cadena2 = "silla";
        boolean expResult = cadena1.compareTo(cadena2)>0;
        boolean result = CadenasAlumno.esMayor(cadena1, cadena2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esMenor method, of class CadenasAlumno.
     */
    @Test
    public void testEsMenor() {
        System.out.println("esMenor");
        String cadena1 = "mesa";
        String cadena2 = "silla";
        boolean expResult = cadena1.compareTo(cadena2)<0;
        boolean result = CadenasAlumno.esMenor(cadena1, cadena2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comparaIgnorandoMayusculas method, of class CadenasAlumno.
     */
    @Test
    public void testComparaIgnorandoMayusculas() {
        System.out.println("comparaIgnorandoMayusculas");
        String cadena1 = "juan";
        String cadena2 = "JUAN";
        boolean expResult = cadena1.equalsIgnoreCase(cadena2);
        boolean result = CadenasAlumno.comparaIgnorandoMayusculas(cadena1, cadena2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reemplazaTodos method, of class CadenasAlumno.
     */
    @Test
    public void testReemplazaTodos() {
        System.out.println("reemplazaTodos");
        String cadena = "rojo verde rojo amarillo verde";
        String regla = "verde";
        String cambio = "azul";
        String expResult = cadena.replaceAll(regla, cambio);
        String result = CadenasAlumno.reemplazaTodos(cadena, regla, cambio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reemplazaPrimero method, of class CadenasAlumno.
     */
    @Test
    public void testReemplazaPrimero() {
        System.out.println("reemplazaPrimero");
        String cadena = "rojo verde rojo amarillo verde";
        String regla = "verde";
        String cambio = "azul";
        String expResult = cadena.replaceAll(regla, cambio);
        String result = CadenasAlumno.reemplazaPrimero(cadena, regla, cambio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of muestraSplitLimite method, of class CadenasAlumno.
     */
    @Test
    public void testMuestraSplitLimite() {
        System.out.println("muestraSplitLimite");
        String cadena = "";
        String regla = "";
        int limite = 0;
        CadenasAlumno.muestraSplitLimite(cadena, regla, limite);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of muestraSplit method, of class CadenasAlumno.
     */
    @Test
    public void testMuestraSplit() {
        System.out.println("muestraSplit");
        String cadena = "";
        String regla = "";
        CadenasAlumno.muestraSplit(cadena, regla);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quitaEspacios method, of class CadenasAlumno.
     */
    @Test
    public void testQuitaEspacios() {
        System.out.println("quitaEspacios");
        String cadena = "";
        String expResult = "";
        String result = CadenasAlumno.quitaEspacios(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertirMayusculas method, of class CadenasAlumno.
     */
    @Test
    public void testConvertirMayusculas() {
        System.out.println("convertirMayusculas");
        String cadena = "";
        String expResult = "";
        String result = CadenasAlumno.convertirMayusculas(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertirMinusculas method, of class CadenasAlumno.
     */
    @Test
    public void testConvertirMinusculas() {
        System.out.println("convertirMinusculas");
        String cadena = "";
        String expResult = "";
        String result = CadenasAlumno.convertirMinusculas(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of longitudCadena method, of class CadenasAlumno.
     */
    @Test
    public void testLongitudCadena() {
        System.out.println("longitudCadena");
        String cadena = "";
        long expResult = 0L;
        long result = CadenasAlumno.longitudCadena(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of empiezaCon method, of class CadenasAlumno.
     */
    @Test
    public void testEmpiezaCon() {
        System.out.println("empiezaCon");
        String cadena = "";
        String prefijo = "";
        boolean expResult = false;
        boolean result = CadenasAlumno.empiezaCon(cadena, prefijo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of acabaEn method, of class CadenasAlumno.
     */
    @Test
    public void testAcabaEn() {
        System.out.println("acabaEn");
        String cadena = "";
        String sufijo = "";
        boolean expResult = false;
        boolean result = CadenasAlumno.acabaEn(cadena, sufijo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of posicionPrimeraCadena method, of class CadenasAlumno.
     */
    @Test
    public void testPosicionPrimeraCadena() {
        System.out.println("posicionPrimeraCadena");
        String cadena = "";
        String buscar = "";
        long expResult = 0L;
        long result = CadenasAlumno.posicionPrimeraCadena(cadena, buscar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of apareceEn method, of class CadenasAlumno.
     */
    @Test
    public void testApareceEn() {
        System.out.println("apareceEn");
        String cadena = "";
        String buscar = "";
        int[] expResult = null;
        int[] result = CadenasAlumno.apareceEn(cadena, buscar);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extraerSubstring method, of class CadenasAlumno.
     */
    @Test
    public void testExtraerSubstring_String_int() {
        System.out.println("extraerSubstring");
        String cadena = "";
        int posicionInicio = 0;
        String expResult = "";
        String result = CadenasAlumno.extraerSubstring(cadena, posicionInicio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extraerSubstring method, of class CadenasAlumno.
     */
    @Test
    public void testExtraerSubstring_3args() {
        System.out.println("extraerSubstring");
        String cadena = "";
        int posicionInicio = 0;
        int posicionFinal = 0;
        String expResult = "";
        String result = CadenasAlumno.extraerSubstring(cadena, posicionInicio, posicionFinal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of concatenaCadenas method, of class CadenasAlumno.
     */
    @Test
    public void testConcatenaCadenas() {
        System.out.println("concatenaCadenas");
        String cadena1 = "";
        String cadena2 = "";
        String expResult = "";
        String result = CadenasAlumno.concatenaCadenas(cadena1, cadena2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sonLetras method, of class CadenasAlumno.
     */
    @Test
    public void testSonLetras() {
        System.out.println("sonLetras");
        String cadena = "";
        boolean expResult = false;
        boolean result = CadenasAlumno.sonLetras(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sonLetras2 method, of class CadenasAlumno.
     */
    @Test
    public void testSonLetras2() {
        System.out.println("sonLetras2");
        String cadena = "";
        boolean expResult = false;
        boolean result = CadenasAlumno.sonLetras2(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class CadenasAlumno.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CadenasAlumno.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
