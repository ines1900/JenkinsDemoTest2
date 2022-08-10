package Page.Object;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import driver.Driver;



public class PageObject extends Driver {
	
	WebDriver driver;
	//PageObject homepage
    private By btn_close= By.xpath("//*[@id=\"pop\"]/div/section/button");
    private By btn_seconnecter=By.xpath("//*[@id=\"jm\"]/header/section/div[2]/div[1]/label");
    private By btn_compte= By.xpath("//*[@id=\"dpdw-login-box\"]/div/a[1]");
    //PageObject email
    private By txt_email=By.xpath("/html/body/div/div[4]/form/div[2]/div[2]/label/input");
	private By btn_Continue=By.xpath("/html/body/div/div[4]/form/div[2]/div[3]/div/button");
	//PageObject motpasse
	private By txt_password=By.xpath("//input[contains(@name,'password')]");
	private By btn_connexion=By.xpath("//*[@id=\"loginButton\"]/span[3]");
	private By btn_mdpoublie=By.xpath("//*[@id=\"passwordForm\"]/div[2]/div[4]/a/div/button/span[3]");
	
	//Home Page
	private By logo_jumia=By.xpath("//*[@id=\"jm\"]/header/section/div[1]/a");
		
	//PageObject Panier
	private By btn_panier=By.xpath("//*[@id=\"jm\"]/header/section/div[2]/a");
	
	//PageObject search
	private By bar_recherche=By.xpath("//*[@id=\"fi-q\"]");
	private By btn_rechercher=By.xpath("//*[@id=\"search\"]/button");
	
	//Filtrer par marque 
	private By bar_marque=By.xpath("//*[@id=\"jm\"]/main/div[2]/div[2]/div/article[2]/header/div/input");
	private By case_selectmarque=By.xpath("//*[@id=\"jm\"]/main/div[2]/div[2]/div/article[2]/div/a[70]");
	
	//Filtrer par prix
	private By case_prixmin=By.xpath("//*[@id=\"jm\"]/main/div[2]/div[2]/div/section/div[2]/div[1]/input");
	private By case_prixmax=By.xpath("//*[@id=\"jm\"]/main/div[2]/div[2]/div/section/div[2]/div[2]/input");
	private By btn_okBy=By.xpath("//*[@id=\"jm\"]/main/div[2]/div[2]/div/section/header/button");
	
	//Sélectionner un produit
	private By select_produit=By.xpath("//*[@id=\"jm\"]/main/div[2]/div[3]/section/div[1]/article[2]/a/div[1]/img[1]");
	
	//Ajouter au panier
	private By btn_jachete=By.xpath("//*[@id=\"add-to-cart\"]/button");
    private By btn_supprimer=By.xpath("//*[@id=\"jm\"]/main/div/div[1]/article/article/footer/button");
	
	//Deconnexion
	 private By btn_bonjour=By.xpath("//*[@id=\"jm\"]/header/section/div[2]/div[1]/label");
	 private By btn_deconnexion=By.xpath("//*[@id=\"dpdw-login-box\"]/div/form/button");
	
	public PageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void newsLetter_close() {
	 driver.findElement(btn_close).click();
	}

	public void clickOnSeConnecter() {
		 driver.findElement(btn_seconnecter).click();
		
	}

	public void clickOnVotreCompte() {
		driver.findElement(btn_compte).click();
		
	}
	public void enterEmail(String arg1) {
		driver.findElement(txt_email).sendKeys(arg1);
	}
	
	public void clickOnContinue() {
		driver.findElement(btn_Continue).click();
		
	}
	public void enterPassword(String password) {
		System.out.println(password+"/");
		driver.findElement(txt_password).sendKeys(password);
		
	}

	public void clickOnSeconnecter2() {
		driver.findElement(btn_connexion).click();
		
	}

	public void clickMdpoublie() {
		driver.findElement(btn_mdpoublie).click(); 
	}
	
	public void checkPanierIsDisplayed() {
		driver.findElement(btn_panier).isDisplayed();	
	}
	
	public void allerHomePage() {
		driver.findElement(logo_jumia).click();
	}
	
	//Recherche 
	public void chercherProduit(String product){
		driver.findElement(bar_recherche).sendKeys(product);
	}
	
	public void cher() {
		driver.findElement(btn_rechercher).click();
	}
	
	//Filtrage par marque
	public void filtrerMarque(String marque){
		driver.findElement(bar_marque).sendKeys(marque);	
	}
	
	public void selectMarque() {
	driver.findElement(case_selectmarque).click();
}
	
	//Filtrage par prix
	public void viderPrixMin(){
		driver.findElement(case_prixmin).sendKeys(Keys.DELETE);
		driver.findElement(case_prixmin).sendKeys(Keys.DELETE);
	}
	
	public void enterPrixMin(String min){
		driver.findElement(case_prixmin).sendKeys(min);		
	}
	
	public void viderPrixMax() {
		driver.findElement(case_prixmax).sendKeys(Keys.DELETE);
		driver.findElement(case_prixmax).sendKeys(Keys.DELETE);
		driver.findElement(case_prixmax).sendKeys(Keys.DELETE);
	}
	public void enterPrixMax(String max){	
		driver.findElement(case_prixmax).sendKeys(max);	
	}
	 public void clickOk() {
		 driver.findElement(btn_okBy).click();	
	}
	 
	 //Selectionner un produit
	 public void selectProduit() {
		 driver.findElement(select_produit).click();	
	}
	
   //Ajouter au panier
	 public void ajouterAuPanier() {
		 driver.findElement(btn_jachete).click();
	 }
	 public void checkSupprimerIsDisplayed() {
		 driver.findElement(btn_supprimer).isDisplayed();
	 }
	 public void clickPanier() {
		driver.findElement(btn_panier).click();
			
		}
	 
	 
	 //Déconnexion
	 public void clickBonjour() {
		driver.findElement(btn_bonjour).click();
	 }
	 
	 public void clickDeonnexion() {
		driver.findElement(btn_deconnexion).click();
	 }


	
}
