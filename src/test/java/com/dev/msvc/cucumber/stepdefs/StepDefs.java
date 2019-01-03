package com.dev.msvc.cucumber.stepdefs;

import com.dev.msvc.MicroservicesApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MicroservicesApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
