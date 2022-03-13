package Com.StepDefination;

import static org.junit.Assert.assertEquals;

import Com.BaseLayer.Baseclass11;
import Com.PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class loginpageTest extends Baseclass11{

	
	
	public static LoginPage loginpage ;
	
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		Baseclass11.inc();
		
		loginpage = new LoginPage();
		boolean atuleresult = loginpage.cheakUsernameDisplayed();
		assertEquals(true, atuleresult);
		boolean atualresult = loginpage.cheakUsernameEnabled();
		assertEquals(true, atualresult);
		loginpage.inputDataInUsername("Admin");
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
		loginpage = new LoginPage();
		boolean atuleresult = loginpage.cheakPassDisplayed();
		assertEquals(true, atuleresult);
		boolean atualresult = loginpage.cheakpassEnabled();
		assertEquals(true, atualresult);
		loginpage.enterPasword("admin123");
		loginpage.enterLoginButton();
		

	}

	@Then("user is on homepage")
	public void user_is_on_homepage() {
		
	System.out.println("user is on home page");
	
	


		
		
	}

}
