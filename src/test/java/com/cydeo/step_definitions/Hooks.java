package com.cydeo.step_definitions;

import org.junit.After;
import org.junit.Before;

public class Hooks {

    @Before
    public void setup(){
        System.out.println("Before Scenario is running");
    }

    @After
    public void tearDown(){
        System.out.println("After Scenario running");
    }
}
