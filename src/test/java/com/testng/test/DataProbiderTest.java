package com.testng.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProbiderTest {
	
    @DataProvider (name = "userName")
	public String [][] getData(){
		return new String [] [] 
				 {{"alammmohammed79@gmail.com"},
			       {"SAYEDawan2008@"}};
	}
    
    
    @Test (dataProvider = "userName")
    public void myData(String value) {
    	System.out.println(value);
    }
    
	 

}
