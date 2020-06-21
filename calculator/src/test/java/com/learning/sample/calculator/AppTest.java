package com.learning.sample.calculator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    
    public void testApp1()
    {
    	int z = Calculator.add(2, 3);
    	assertEquals(5, z);
    }
    
    public void testApp2()
    {
    	int z = Calculator.add(7, 3);
    	assertEquals(10, z);
    }
    
    public void testApp3()
    {
    	int z = Calculator.subtract(5, 3);
    	assertEquals(2, z);
    }
    
    public void testJsonParser() {
    	Employee emp = new Employee(false, 100, "umesh", "engg", "tranquil");
    	String jsonStr = JsonParser.toString(emp, true);
    	assertEquals(jsonStr, "{\"id\":100,\"name\":\"umesh\",\"department\":\"engg\",\"address\":\"tranquil\",\"contract\":false}");
    }
    
}
