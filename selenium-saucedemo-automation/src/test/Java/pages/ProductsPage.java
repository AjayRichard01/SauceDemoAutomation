package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    WebDriver driver;
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    By addToCart = By.id("add-to-cart-sauce-labs-backpack");
    By cartIcon = By.className("shopping_cart_badge");

    public void addBackpackToCart() {
        driver.findElement(addToCart).click();
    }

    public String getCartCount() {
        return driver.findElement(cartIcon).getText();
    }
}