package com.automation.steps;

import com.automation.test.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

public class Hooks extends BaseTest {


    @Before
    public void setUp() throws IOException {
          super.setUp();
    }

    @After
    public void tearDown() {

        super.cleanUp();
    }
}
