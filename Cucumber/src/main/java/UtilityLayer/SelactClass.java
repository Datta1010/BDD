package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Com.BaseLayer.Baseclass11;

public class SelactClass extends Baseclass11{

	public static Select sel;

	public static void SelectDropDounvalue(WebElement wb, String visbleText) {

		sel = new Select(wb);
		sel.selectByVisibleText(visbleText);
	}

	public static void caputeDroupDounSelectValue(WebElement dpvalue) {
		sel = new Select(dpvalue);

		WebElement wb = sel.getFirstSelectedOption();
		wb.getText();
	}

}
