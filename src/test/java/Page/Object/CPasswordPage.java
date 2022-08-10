package Page.Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CPasswordPage {
	protected WebDriver driver;
	private By txt_password=By.xpath("/html/body/div/div[4]/form/div[2]/div[3]/label/input");
	private By btn_connexion=By.xpath("/html/body/div/div[4]/form/div[2]/div[4]/div/button/span[3]");

	
	public CPasswordPage(WebDriver driver) {
			this.driver = driver;
	}

	public By getTxt_password() {
		return txt_password;
	}


	public By getBtn_connxion() {
		return btn_connexion;
	}

	

	public void enterPassword(String arg2) {
		driver.findElement(txt_password).sendKeys("Gh11046090");
		
	}

	public void clickOnSeconnecter2() {
		driver.findElement(btn_connexion).click();
		
	}	
	
}
