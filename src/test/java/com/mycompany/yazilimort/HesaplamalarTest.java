/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.yazilimort;

import javax.xml.transform.Source;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sametbuyurman
 */
public class HesaplamalarTest {
    
    @Test
    public void testFaktoriyelRec(){
        int sonuc=Hesaplamalar.faktoriyelRec(5);
        assertEquals(120, sonuc);
    }
    @Test
    public void testfaktoriyelLoop(){
        int sonuc=Hesaplamalar.faktoriyelLoop(5);
        assertEquals(120, sonuc);
        
    }
    public void testFaktoriyel(){
        int sonuc1=Hesaplamalar.faktoriyelLoop(120);
        int sonuc2=Hesaplamalar.faktoriyelRec(120);
        assertEguals(sonuc1, sonuc2);
    }
    public void testtoplama(){
        int sonuc=Hesaplamalar.topla(5, 2);
        assertEguals(7,sonuc);
    }
    public void testcikarma(){
        int sonuc=Hesaplamalar.cikart(5, 2);
        assertEguals(3,sonuc);
    }
    public void testcarpma(){
        int sonuc=Hesaplamalar.topla(5, 2);
        assertEguals(10,sonuc);
    }
    
    
    public HesaplamalarTest() {
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

    private void assertEguals(int i, int sonuc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
    
    
}
