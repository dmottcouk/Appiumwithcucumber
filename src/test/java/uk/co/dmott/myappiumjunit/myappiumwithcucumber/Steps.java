package uk.co.dmott.myappiumjunit.myappiumwithcucumber;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import junit.framework.Assert;
import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import uk.co.dmott.myappiumjunit.PageObject.ControlPage;
//import com.cucumber.PageObject.Page2Page;/

import uk.co.dmott.myappiumjunit.PageObject.ControlPage;
//import uk.co.dmott.myappiumjunit.myappium.pageobjects.MetroNewControlPage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class Steps {

	private static AndroidDriver driver;
	
	ControlPage myControlPage;
	
	@Before
	public void setUp() throws Exception {
		
		String sysprop = System.getProperty("user.dir");
		
		String sysprop1 = System.getProperty("user.home");
		
		
		File classpathRoot = new File(System.getProperty("user.dir"));
		
		File homeRoot = new File(System.getProperty("user.home"));
		
        
		//System.out.println("created classpathRoot" );
		
//		
		//File appDir = new File(classpathRoot, "/apps/MetroNew");
		
		File appDir = new File(homeRoot, "workspaceeclipse/myappiumwithcucumber/apps/MetroNew");
		
		System.out.println("created appDir" );
		
		
		
        File app = new File(appDir, "MetroNew.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setCapability("deviceName","Android Emulator");
        capabilities.setCapability("deviceName","Android");
        capabilities.setCapability("platformVersion", "4.4");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "uk.co.dmott.metronew");
        capabilities.setCapability("appActivity", ".MainActivity");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        
		myControlPage = new ControlPage();
        
      //This time out is set because test can be run on slow Android SDK emulator
      	PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), 
      				myControlPage);
		
		System.out.println("created driver" );		
		

		
		
	}

	@After
	public void tearDown() throws Exception {
		
		driver.quit();
	}
	
	@Given("^I am on the Control page$")
	public void i_am_on_the_Control_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Default is on the control page");
	}

	@When("^I enter \"(.*?)\" into the BPM field$")
	public void i_enter_into_the_BPM_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		//System.out.println("i_enter_into_the_BPM_field");
		myControlPage.setEditBPMto(driver,arg1);
		
	}

	@When("^I enter the Return key$")
	public void i_enter_the_Return_key() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("I enter the Return key");
	}

	@Then("^The Slider will be set to value \"(.*?)\"$")
	public void the_Slider_will_be_set_to_value(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		//System.out.println("The Seekbar will be set to value");
		Integer sliderVal = myControlPage.getSliderBPM(driver);
		
		
		Assert.assertEquals(true, sliderVal.equals(Integer.parseInt(arg1)));
		myControlPage.resetSlider(driver);
	}	
	@When("^I set the slider bpm value to \"(.*?)\"$")
	public void i_set_the_slider_bpm_value_to(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		myControlPage.setSliderBPMTo(driver,arg1);
	}

	@SuppressWarnings("deprecation")
	@Then("^The BPM field will be set to value \"(.*?)\"$")
	public void the_BPM_field_will_be_set_to_value(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String editTextBPMVal = myControlPage.getEditBPM(driver);
		
		double minAccepted = (double)Integer.parseInt(arg1) * 0.20;
		double maxAccepted = (double)Integer.parseInt(arg1) * 1.8;
		
		
		Assert.assertTrue(((double)Integer.parseInt(editTextBPMVal) < maxAccepted) && ((double)Integer.parseInt(editTextBPMVal) > minAccepted));
		myControlPage.resetSlider(driver);
	}
	
	
	
	
	
	
	
	
	
	
}
