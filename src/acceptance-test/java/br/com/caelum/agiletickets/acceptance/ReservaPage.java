package br.com.caelum.agiletickets.acceptance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReservaPage {

	
	private static final String BASE_URL = "http://localhost:8080";
	private final WebDriver driver;

	public ReservaPage(WebDriver driver) {
		this.driver = driver;
	}

	public void abrePagina() {
		driver.get(BASE_URL + "/sessao/40");
	}

	public void compraUmIngresso(Integer quantidade) throws InterruptedException {
		WebElement form = driver.findElement(By.id("addForm"));
		form.findElement(By.id("qtde")).sendKeys(quantidade.toString());
		form.wait(100000000);
		form.submit();
	}
	
	
}
