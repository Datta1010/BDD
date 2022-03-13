package Com.StepDefination;

import Com.BaseLayer.Baseclass11;
import Com.PageLayer.Homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class homepageTest extends Baseclass11 {
	
	  public static Homepage homepage;
	@Given("user click on Admin page")
	public void user_click_on_admin_page() {
		 homepage = new Homepage();
		 homepage.clickOnAdmin();

	}

	@When("user click leave page")
	public void user_click_leave_page() {
		 homepage = new Homepage();
		 homepage.clickOnLeave();

	}

	@When("user click Pim page")
	public void user_click_pim_page() {
		 homepage = new Homepage();
		 homepage.clickOnpim();

	}

}
