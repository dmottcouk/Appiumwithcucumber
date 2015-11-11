package uk.co.dmott.myappiumjunit.PageObject;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Keys;


public class ControlPage {
	
	
	//Common Selenium @FindBy annotations are effective 
		//against browser apps and web views. They can be used against native 
		//content. But it is useful to know that By.css, By.link, By.partialLinkText
		//are invalid at this case.
		@FindBy(className = "android.widget.TextView")
		public List<WebElement> textVieWs;
		
		@FindBy(className = "android.widget.SeekBar")
		public List<WebElement> seekBars;
		
		
		@FindBy(className = "android.widget.Spinner")
		public List<WebElement> spinners;


		public void setEditBPMto(AndroidDriver driver, String bpm) {
			// TODO Auto-generated method stub
			WebElement bpmEditText = driver.findElement(By.xpath("//android.widget.EditText"));
			//bpmEditText.sendKeys(Keys.RETURN);
			
			bpmEditText.sendKeys(bpm);
			bpmEditText.sendKeys(Keys.RETURN);
			try {
				Thread.sleep(1000);
			}catch (Exception ex)
			{
				
			}
			//bpmEditText.sendKeys(Keys.RETURN);

			bpmEditText.sendKeys(bpm);
			
			driver.pressKeyCode(66);
			
			
			
			
			
			System.out.println("Presskeycode done");
			
		}


		public int getSliderBPM(AndroidDriver driver) {
			// TODO Auto-generated method stub
			//return 0;
			//WebElement bpmSlider = driver.findElement(By.xpath("//android.widget.SeekBar"));	
			
			WebElement bpmSlider = driver.findElement(By.id("uk.co.dmott.metronew:id/speedBar"));
			int xAxisStartPoint = bpmSlider.getLocation().getX();
			int xAxisEndPoint = xAxisStartPoint + bpmSlider.getSize().getWidth();
			int bmpsliderWidth = bpmSlider.getSize().getWidth();
			int yAxis = bpmSlider.getLocation().getY();
			
			TouchAction act = new TouchAction(driver);
			//act.press(xAxisStartPoint,yAxis).moveTo(xAxisStartPoint+ bmpsliderWidth/2,yAxis);
			
			
			File screenshot=driver.getScreenshotAs(OutputType.FILE);
			
			File homeRoot = new File(System.getProperty("user.home"));
			
	        
			//System.out.println("created classpathRoot" );
			
//			
			//File appDir = new File(classpathRoot, "/apps/MetroNew");
			
			File screenshotDir = new File(homeRoot, "workspaceeclipse/myappiumwithcucumber/screenshots");			
			String screenShotName=screenshotDir.getAbsolutePath() + File.separator+"controlscreen.png";
			try {
				FileUtils.copyFile(screenshot, new File(screenShotName));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//dont know how to get a progress value from seekbar so just use the edittext value at the moment
			
			
			WebElement bpmEditText = driver.findElement(By.xpath("//android.widget.EditText"));
			int pseudoSliderVal = Integer.parseInt(bpmEditText.getText().toString());
			
			
			return pseudoSliderVal;
			
		}


		public void setSliderBPMTo(AndroidDriver driver, String sliderPos) {

			WebElement bpmSlider = driver.findElement(By.id("uk.co.dmott.metronew:id/speedBar"));
			int xAxisStartPoint = bpmSlider.getLocation().getX();
			int xAxisEndPoint = xAxisStartPoint + bpmSlider.getSize().getWidth();
			int bmpsliderWidth = bpmSlider.getSize().getWidth();
			int yAxis = bpmSlider.getLocation().getY();
			
			TouchAction act = new TouchAction(driver);
			
			float percentageOfSlider = (float)Integer.parseInt(sliderPos) / (float)200.00;
			
			int moveTox = xAxisStartPoint+ (int)(bmpsliderWidth *percentageOfSlider);
			
			
			act.press(xAxisStartPoint,yAxis).moveTo(moveTox ,yAxis).perform();			
			
			System.out.println("set the slider to requested BPM" );
			
			
			
			
			File screenshot=driver.getScreenshotAs(OutputType.FILE);
			
			File homeRoot = new File(System.getProperty("user.home"));
			
	        
			//System.out.println("created classpathRoot" );
			
//			
			//File appDir = new File(classpathRoot, "/apps/MetroNew");
			
			File screenshotDir = new File(homeRoot, "workspaceeclipse/myappiumwithcucumber/screenshots");			
			String screenShotName=screenshotDir.getAbsolutePath() + File.separator+"controlscreenslidersetbpm.png";
			try {
				FileUtils.copyFile(screenshot, new File(screenShotName));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
			
			
		}


		public String getEditBPM(AndroidDriver driver) {
			
			WebElement bpmEditText = driver.findElement(By.xpath("//android.widget.EditText"));
			//int editVal = Integer.parseInt(bpmEditText.getText().toString());
			return(bpmEditText.getText().toString());
			
			//return editVal;
		}


		public void resetSlider(AndroidDriver driver) {
			// TODO Auto-generated method stub
			WebElement bpmSlider = driver.findElement(By.id("uk.co.dmott.metronew:id/speedBar"));
			int xAxisStartPoint = bpmSlider.getLocation().getX();

			int yAxis = bpmSlider.getLocation().getY();
			
			TouchAction act = new TouchAction(driver);
			

			

			
			
			act.press(xAxisStartPoint,yAxis).perform();	
			System.out.println("Reset the slider");
			
			
			
			
			
			
			
		}	
	
	
	
	
	
	
	
	

}
