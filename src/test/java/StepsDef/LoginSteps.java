package StepsDef;


import org.openqa.selenium.By;
import Page.Object.PageObject;
import driver.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends Driver {     
	PageObject login;
    PageObject email;
    PageObject motpasse;
    PageObject panier;
    PageObject chercher;
    PageObject filtrer;
    PageObject okprix;
    PageObject selectionner;
    PageObject ajoutpanier;
	           
//Connexion           
               @Given("browser is open")
               public void browser_is_open() {
            	   intialization(); 	  
   			}     	   

               @And("user is on login page")
               public void user_is_on_login_page() throws InterruptedException {
            	//driver.navigate().to("https://www.jumia.com.tn/");
   			    Thread.sleep(2000);	
   			    PageObject login=new PageObject(driver);
   			    login.newsLetter_close();			    				    
   			    login.clickOnSeConnecter();
   			    login.clickOnVotreCompte();      	          	   
             }

              @When("^user enter his email(.*)$")
              public void user_enter_his_email_ghadaa_ghram_gmail_com(String arg1) throws InterruptedException {
            	PageObject email=new PageObject(driver);
  				email.enterEmail(arg1);
  				Thread.sleep(2000);			
  			    email.clickOnContinue();   
             }

             @And("^user enters his password(.*)$")
             public void user_enters_his_password_Gh11046090(String password) throws InterruptedException {
            	PageObject motpasse=new PageObject(driver);
   				//motpasse.enterPassword(password);
   				System.out.println(password);
   				Thread.sleep(7000);	
   				String d=driver.findElement(By.xpath("//input[contains(@name,'password')]")).getText();
   				System.out.print(d);
   			    motpasse.clickOnSeconnecter2(); 
   			    //motpasse.clickMdpoublie(); 
}

             @Then("user is on home page")
             public void user_is_on_home_page() throws InterruptedException {
            	  
            	 PageObject panier=new PageObject(driver);
            	 //panier.checkPanierIsDisplayed();
            	 panier.allerHomePage();
                 Thread.sleep(2000);
         		// driver.findElement(By.id("logout")).isDisplayed();
         		
         		//Thread.sleep(2000);
         		//driver.close();
         		//driver.quit();
             }
  
//Rechercher, filter séléctionner     
             
             @Given("^user is looking for a product(.*)$")
             public void user_is_looking_for_a_product_ecran_solaire(String product) throws InterruptedException {
            	 PageObject chercher=new PageObject(driver);
            	 chercher.chercherProduit(product);
            	 Thread.sleep(2000);
            	 chercher.cher();
            	 Thread.sleep(2000);         	                 
             }

             /*@And("^user filters his search by brand(.*)$")
             public void user_filters_his_search_by_brand_SVR(String marque) throws InterruptedException {
            	  PageObject filtrer=new PageObject(driver);
            	  filtrer.filtrerMarque(marque);
            	  filtrer.selectMarque();
             }*/
             
             @And("^user enter lower price limit(.*)$")
             public void user_enter_lower_price_limit_liminf(String min) throws InterruptedException {
            	 PageObject prixmin=new PageObject(driver);
            	 prixmin.viderPrixMin();
            	 Thread.sleep(2000);
            	 prixmin.enterPrixMin(min);
             }

             @And("^user enter upper price limit(.*)$")
             public void user_enter_upper_price_limit_limsup(String max) throws InterruptedException {
            	 PageObject prixmax=new PageObject(driver);
            	 prixmax.viderPrixMax();
            	 Thread.sleep(2000);
            	 prixmax.enterPrixMax(max);
             }
             
             @And("user enter click ok")
             public void user_enter_click_ok() {
            	 PageObject okprix=new PageObject(driver); 
                 okprix.clickOk();
             }

             @When("user select the product")
             public void user_select_the_product() throws InterruptedException {
            	 PageObject selectionner=new PageObject(driver);
            	 selectionner.selectProduit();
            	 Thread.sleep(2000);
             }

             @And("user add the product to the cart")
             public void user_add_the_product_to_the_cart() throws InterruptedException {
            	 PageObject ajoutpanier=new PageObject(driver);
            	 ajoutpanier.ajouterAuPanier();
            	 ajoutpanier.clickPanier();
            	 Thread.sleep(2000);
            	
             }

             @Then("the product is on the cart")
             public void the_product_is_on_the_cart() {
            	 PageObject supprimer=new PageObject(driver);
                 supprimer.checkSupprimerIsDisplayed();
             }

             @And("user sign out")
             public void user_sign_out() throws InterruptedException {
            	 PageObject deconnexion=new PageObject(driver);	 
            	 deconnexion.clickBonjour();
                 deconnexion.clickDeonnexion();  
                 Thread.sleep(2000);
                 driver.close();
                
             }
             
}




/*public void browser_is_open() {
	System.out.println("Inside Step - browser is open");		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);			
	    System.setProperty("webdriver.edge.driver", projectPath+"/src/test/resources/drivers/msedgedriver.exe");
				   
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();	  
	}*/