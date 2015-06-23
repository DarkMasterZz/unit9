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
    }

    /**
     * Test of esMayor method, of class CadenasAlumno.
     */
    @Test
    public void testEsMayor() {
        System.out.println("esMayor");
        String cadena1 = "mesa";
        String cadena2 = "silla";
        boolean expResult = cadena1.compareTo(cadena2)<0;
        boolean result = CadenasAlumno.esMayor(cadena1, cadena2);
        assertEquals(expResult, result);
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
        String expResult = cadena.replaceFirst(regla, cambio);
        String result = CadenasAlumno.reemplazaPrimero(cadena, regla, cambio);
        assertEquals(expResult, result);
    }

    /**
     * Test of muestraSplitLimite method, of class CadenasAlumno.
     *
    @Test
    public void testMuestraSplitLimite() {
        System.out.println("muestraSplitLimite");
        String cadena = "perro gato caballo tigre cocodrilo serpiente";
        String regla = " ";
        int limite = 3;
        CadenasAlumno.muestraSplitLimite(cadena, regla, limite);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of muestraSplit method, of class CadenasAlumno.
     *
    @Test
    public void testMuestraSplit() {
        System.out.println("muestraSplit");
        String cadena = "perro gato caballo tigre cocodrilo serpiente";
        String regla = " ";
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
        String cadena = "    juan    ";
        String expResult = cadena.trim();
        String result = CadenasAlumno.quitaEspacios(cadena);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertirMayusculas method, of class CadenasAlumno.
     */
    @Test
    public void testConvertirMayusculas() {
        System.out.println("convertirMayusculas");
        String cadena = "juan";
        String expResult = cadena.toUpperCase();
        String result = CadenasAlumno.convertirMayusculas(cadena);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertirMinusculas method, of class CadenasAlumno.
     */
    @Test
    public void testConvertirMinusculas() {
        System.out.println("convertirMinusculas");
        String cadena = "JUAN";
        String expResult = cadena.toLowerCase();
        String result = CadenasAlumno.convertirMinusculas(cadena);
        assertEquals(expResult, result);
    }

    /**
     * Test of longitudCadena method, of class CadenasAlumno.
     */
    @Test
    public void testLongitudCadena() {
        System.out.println("longitudCadena");
        String cadena = "juan";
        long expResult = cadena.length();
        long result = CadenasAlumno.longitudCadena(cadena);
        assertEquals(expResult, result);
    }

    /**
     * Test of empiezaCon method, of class CadenasAlumno.
     */
    @Test
    public void testEmpiezaCon() {
        System.out.println("empiezaCon");
        String cadena = "tengo un pastor aleman";
        String prefijo = "tengo";
        boolean expResult = cadena.startsWith(prefijo);
        boolean result = CadenasAlumno.empiezaCon(cadena, prefijo);
        assertEquals(expResult, result);
    }

    /**
     * Test of acabaEn method, of class CadenasAlumno.
     */
    @Test
    public void testAcabaEn() {
        System.out.println("acabaEn");
        String cadena = "tengo un pastor aleman";
        String sufijo = "aleman";
        boolean expResult = cadena.endsWith(sufijo);
        boolean result = CadenasAlumno.acabaEn(cadena, sufijo);
        assertEquals(expResult, result);
    }

    /**
     * Test of posicionPrimeraCadena method, of class CadenasAlumno.
     */
    @Test
    public void testPosicionPrimeraCadena() {
        System.out.println("posicionPrimeraCadena");
        String cadena = "tengo un pastor aleman";
        String buscar = "pastor";
        long expResult = cadena.indexOf(buscar);
        long result = CadenasAlumno.posicionPrimeraCadena(cadena, buscar);
        assertEquals(expResult, result);
    }

    /**
     * Test of apareceEn method, of class CadenasAlumno.
     *
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
        String cadena = "tengo un pastor aleman";
        int posicionInicio = 5;
        String expResult = cadena.substring(posicionInicio);
        String result = CadenasAlumno.extraerSubstring(cadena, posicionInicio);
        assertEquals(expResult, result);
    }

    /**
     * Test of extraerSubstring method, of class CadenasAlumno.
     */
    @Test
    public void testExtraerSubstring_3args() {
        System.out.println("extraerSubstring");
        String cadena = "tengo un pastor aleman";
        int posicionInicio = 5;
        int posicionFinal = 10;
        String expResult = cadena.substring(posicionInicio, posicionFinal);
        String result = CadenasAlumno.extraerSubstring(cadena, posicionInicio, posicionFinal);
        assertEquals(expResult, result);
    }

    /**
     * Test of concatenaCadenas method, of class CadenasAlumno.
     */
    @Test
    public void testConcatenaCadenas() {
        System.out.println("concatenaCadenas");
        String cadena1 = "rojo";
        String cadena2 = "verde";
        String expResult = cadena1.concat(cadena2);
        String result = CadenasAlumno.concatenaCadenas(cadena1, cadena2);
        assertEquals(expResult, result);
    }

    /**
     * Test of sonLetras method, of class CadenasAlumno.
     *
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
     *
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
     *
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CadenasAlumno.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    
    public static void main(String[] args)
    {
        CadenasAlumnoTest pruebas = new CadenasAlumnoTest();
        
        pruebas.testSonIguales();
        pruebas.testEsMayor();
        pruebas.testEsMenor();
        pruebas.testComparaIgnorandoMayusculas();
        pruebas.testReemplazaTodos();
        pruebas.testReemplazaPrimero();
        pruebas.testQuitaEspacios();
        pruebas.testConvertirMayusculas();
        pruebas.testConvertirMinusculas();
        pruebas.testLongitudCadena();
        pruebas.testEmpiezaCon();
        pruebas.testAcabaEn();
        pruebas.testPosicionPrimeraCadena();
        pruebas.testExtraerSubstring_String_int();
        pruebas.testExtraerSubstring_3args();
        pruebas.testConcatenaCadenas();
    }
}
