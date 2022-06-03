package com.canal.automation.bouletCorp.aleatoire.stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import com.canal.automation.bouletCorp.aleatoire.pageObjects.AleatoirePage;
import com.canal.automation.bouletCorp.utils.Assertions;
import com.canal.automation.bouletCorp.utils.CommonUtils;
import com.canal.automation.bouletCorp.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AleatoireStepDefinition {

	AleatoirePage aleatoirePage;
	CommonUtils commonUtils;
	Assertions assertions;
	public String page;

	public AleatoireStepDefinition() {

		this.aleatoirePage = new AleatoirePage();
		this.commonUtils = new CommonUtils();
		this.assertions = new Assertions();
	}

	@Given("Je me connecte à l'application bouletcorp")
	public void jeMeConnecteÀLApplicationBouletcorp() throws IOException {

		commonUtils.getUrl("home.url");
		page = aleatoirePage.getPageTile();
	}

	@When("Je clique sur le bouton Aleatoire")
	public void jeCliqueSurLeBoutonAleatoire() {
		
		aleatoirePage.clickAleatoire();

	}

	@Then("Je vérifie la page a changé")
	public void jeVérifieLaPageAChangé() {
		
		String titleAleatoire = Setup.driver.getTitle();
		Assert.assertNotSame(titleAleatoire, page);

	}

	@Then("Je vérifie les widgets facebook, twitter et tumblr sont bien affichés")
	public void jeVérifieLesWidgetsFacebookTwitterEtTumblrSontBienAffichés() {

		boolean facebook =assertions.isElementDisplayed(AleatoirePage.facebook);
		Assert.assertTrue(facebook);
		boolean twitter = assertions.isElementDisplayed(AleatoirePage.twitter);
		Assert.assertTrue(twitter);
		boolean tumblr = assertions.isElementDisplayed(AleatoirePage.tumblr);
		Assert.assertTrue(tumblr);

	}

}
