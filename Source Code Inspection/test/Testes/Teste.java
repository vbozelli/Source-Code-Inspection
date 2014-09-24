/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import br.calebe.ticketmachine.core.PapelMoeda;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author 31266568
 */
public class Teste {
    
    public Teste() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @BeforeClass
    public static void setUpClass() throws Exception {
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void teste1()
    {
        PapelMoeda papelMoeda = new PapelMoeda(5, 2);
        assertEquals(2, papelMoeda.getQuantidade());
    }
    
    @Test
    public void testeInicial()
    {
        PapelMoeda papelMoeda = new PapelMoeda(5, 2);
        assertEquals(5, papelMoeda.getValor());
    }
}