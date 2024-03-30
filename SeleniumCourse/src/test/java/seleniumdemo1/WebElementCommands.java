package seleniumdemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	public void webelementcommand()
	{
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommands webelementcommands=new WebElementCommands();
		webelementcommands.initializeBrowser();
		webelementcommands.webelementcommand();
		webelementcommands.browserQuit();

	}

}
