package org.example.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitionImpl {
     WebDriver driver;
   @Given("I landed on Ecommerce Page")
    public void I_landed_on_Ecommerce_Page(){
       WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

   }

@Given("^Logged in with the username (.+) and password (.+)$")
    public void Logged_in_with_the_username_and_password(String username, String password){
    driver.get("https://rahulshettyacademy.com/client");
  System.out.println(username);
    System.out.println(password);
    }

    @When("^I add product (.+) to Cart$")
    public void I_add_product_to_Cart(String productName){
        System.out.println(productName);
    }
    @And("^Checkout (.+) and submit the order$")
    public void Checkout_and_submit_the_order(String productName){
        System.out.println(productName);
    }

    @Then("{String} message is displayed on confirmation Page")
    public void message_is_displayed_on_confirmation_Page(String message){
        System.out.println(message);
    }


}
