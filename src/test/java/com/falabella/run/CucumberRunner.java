package com.falabella.run;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features="classpath:features",
                tags="@buyWithWarranty"
        )

public class CucumberRunner {



}