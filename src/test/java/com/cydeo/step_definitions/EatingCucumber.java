package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatingCucumber {

    @Given("Ayhan is hungry")
    public void ayhan_is_hungry() {
        System.out.println("It is from Given");
    }

    @When("he eats some cucumbers")
    public void he_eats_some_cucumbers() {
        System.out.println("It is from When");
    }

    @Then("he will be full")
    public void he_will_be_full() {
        System.out.println("It is from Then");
    }

    @Given("{string} is hungry")
    public void is_hungry(String name) {
        System.out.println("It is from string name param");
    }
    @When("he eats {int} cucumbers")
    public void he_eats_cucumbers(Integer count) {
        System.out.println("It is from int cucumber count-AYHAN");
    }

}
