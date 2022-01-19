/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author w312
 */
public class facultyTest {
    
    public facultyTest() {
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
    public void testRoll() {
        
         faculty fac=new faculty();
       int id=fac.id();
      
      
       assertEquals("1",id);
       assertEquals("2",id);
       assertEquals("3",id);
       assertEquals("4",id);
       
      assertEquals("5",id);
       assertEquals("6",id);
       assertEquals("7",id);
       assertEquals("8",id);
       assertEquals("9",id);
       assertEquals("10",id);
       assertEquals("11",id);
       assertEquals("12",id);
       
       assertEquals("13",id);
       assertEquals("14",id);
       assertEquals("15",id);
       assertEquals("16",id);
       assertEquals("17",id);
       assertEquals("18",id);
       assertEquals("19",id);
       assertEquals("20",id);
    }

    /**
     * Test of name method, of class student.
     */
    @Test
    public void testName() {
    faculty fac=new faculty();
     
     String name=fac.name();
     assertEquals("",name);
     
    }

    @Test
    public void testDept() {
      faculty fac=new faculty();
       String dept=fac.dept();
      
     assertEquals("BCSE",dept);
       assertEquals("BSCS",dept);
         assertEquals("BBAH",dept);
           assertEquals("BCA",dept);
    }
    @Test
    public void testMain() {
       
    }
    
}
