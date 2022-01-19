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
public class studentTest {
    
    public studentTest() {
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
     * Test of fall method, of class student.
     */
    @Test
    public void testFall() {
       student stu=new student();
       int fa=stu.fall();
      
       assertEquals("13",fa);
       assertEquals("14",fa);
       assertEquals("15",fa);
       assertEquals("16",fa);
       assertEquals("17",fa);
       assertEquals("18",fa);
       assertEquals("19",fa);
       assertEquals("20",fa);
    }

    /**
     * Test of roll method, of class student.
     */
    @Test
    public void testRoll() {
         student stu=new student();
       int roll=stu.roll();
       
       assertEquals("1",roll);
       assertEquals("2",roll);
       assertEquals("3",roll);
       assertEquals("4",roll);
       
      assertEquals("5",roll);
       assertEquals("6",roll);
       assertEquals("7",roll);
       assertEquals("8",roll);
       assertEquals("9",roll);
       assertEquals("10",roll);
       assertEquals("11",roll);
       assertEquals("12",roll);
       
       
    }

    /**
     * Test of name method, of class student.
     */
    @Test
    public void testName() {
     student stu=new student();
     String name=stu.name();
     assertEquals("",name);
     
    }

    @Test
    public void testDept() {
      student stu=new student();
     String dept=stu.name();
     assertEquals("",dept);
     
    }

    /**
     * Test of main method, of class student.
     */
    @Test
    public void testMain() {
        student stu=new student();
        
       
    }
    
}
