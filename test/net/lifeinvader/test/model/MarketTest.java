/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lifeinvader.test.model;

import net.lifeinvader.app.model.Market;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;



/**
 *
 * @author christophe
 */
public class MarketTest {
    
    static Market market;
    
    @BeforeClass
    public static void setUpClass() {
        market = new Market("US", "US", 128, 10);
    }
    
    @AfterClass
    public static void tearDownClass() {
        market = null;
    }
    
    @Before
    public void setUp() {
      
    }
    
    @After
    public void tearDown() {
      
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testMarket(){
        assertEquals("Market{name=US, code=US, popNoWeb=128, popWeb=10}", market.toString());
    }

}
