package Component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class LeftMenu {
    WebDriver driver;
    public LeftMenu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public List<WebElement> span_Value(){
    List<WebElement> spans = driver.findElements(By.tagName("span"));return spans;}
    By comboboxbrasil = By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[5]");
    public WebElement ComboboxBrasil() {return driver.findElement(comboboxbrasil);}
    By bra501 = By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[5]/ul/li[1]");
    public WebElement BRA501() {return driver.findElement(bra501);}
}