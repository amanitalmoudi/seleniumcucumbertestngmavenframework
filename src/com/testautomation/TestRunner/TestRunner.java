package com.testautomation.TestRunner;

import cucumber.api.CucumberOptions;  
import cucumber.api.testng.CucumberFeatureWrapper;  
import cucumber.api.testng.PickleEventWrapper;  
import cucumber.api.testng.TestNGCucumberRunner;  
import org.testng.annotations.AfterClass;  
import org.testng.annotations.BeforeClass;  
import org.testng.annotations.DataProvider;  
import org.testng.annotations.Test;

@CucumberOptions (
        features = "./features/"
        ,glue = {"com.testautomation.StepDef"}
        ,tags = {"@Youtube"}
        ,monochrome = true)
public class TestRunner {
    private TestNGCucumberRunner testNGCucumberRunner;
    
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {    	
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(dataProvider = "features")    
    public void feature(PickleEventWrapper pickleEvent, CucumberFeatureWrapper cucumberFeature) throws Throwable {  
        testNGCucumberRunner.runScenario(pickleEvent.getPickleEvent()); 
    }
    
    @DataProvider  
    public Object[][] features() {  
          return testNGCucumberRunner.provideScenarios();  
    }  
    
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {    	
        testNGCucumberRunner.finish();        
    }
}