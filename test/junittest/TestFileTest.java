/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mizanul
 */
public class TestFileTest {
    
    public TestFileTest() {
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
     * Test of add method, of class TestFile.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String num1 = "3";
        String num2 = "3";
        TestFile instance = new TestFile();
        int expResult = 6;
        int result = instance.add(num1, num2);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testAdd2() {
        System.out.println("add");
        String num1 = "3";
        String num2 = "2";
        TestFile instance = new TestFile();
        int expResult = 5;
        int result = instance.add(num1, num2);
        assertEquals(expResult, result);
        
    }
    
    @Test(expected=NumberFormatException.class)
    public void testAdd3() {
        System.out.println("add");
        String num1 = "cqu";
        String num2 = "2";
        TestFile instance = new TestFile();
        //int expResult = 0;
        int result = instance.add(num1, num2);
        //assertEquals(expResult, result);
        
    }
    
}
