package com.canal.automation.bouletCorp.aleatoire.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.canal.automation.bouletCorp.utils.BasePage;

public class AleatoirePage extends BasePage {

	public AleatoirePage() {

		PageFactory.initElements(driver, this);
	}
	
    /*FindBy*/
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Aléatoire')]")
	public static WebElement aleatoire;

	@FindBy(how = How.XPATH, using = "//*[@title='Facebook']")
	public static WebElement facebook;

	@FindBy(how = How.XPATH, using = "//*[@title='Twitter']")
	public static WebElement twitter;

	@FindBy(how = How.XPATH, using = "//*[@href ='https://www.tumblr.com/share']")
	public static WebElement tumblr;

	/* Methods */
	public void clickAleatoire() {
		
		aleatoire.click();
	}

	public String getPageTile() {
		
		String tilePage = driver.getTitle();
		return tilePage;

	}

}
