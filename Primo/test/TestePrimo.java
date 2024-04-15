/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rever
 */
public class TestePrimo
{
    
    public TestePrimo()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    @Test
    public void TestarPrimo()
    {
        modelo.Primo primo = new modelo.Primo(7);
        assertEquals("É primo", primo.getResposta());
        modelo.Primo primo1 = new modelo.Primo(47);
        assertEquals("É primo", primo1.getResposta());
    }
    
    public void TestarNaoPrimo()
    {
        modelo.Primo primo = new modelo.Primo(8);
        assertEquals("Não é primo", primo.getResposta());
        modelo.Primo primo1 = new modelo.Primo(2568);
        assertEquals("Não é primo", primo1.getResposta());
    }
}
