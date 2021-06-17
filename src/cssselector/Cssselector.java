package cssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Cssselector {

   
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver,exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://prefeitura.pbh.gov.br/saude/licitacao/pregao-eletronico-151-2020");
        driver.findElement(By.cssSelector(".col-sm-6 lbl-licitacao")).getText();
        driver.findElement(By.cssSelector(".lbl-licitacao")).getText();
        driver.findElement(By.cssSelector(".col-sm-6 lbl-licitacao")).getText();

        
    }
        
    }
    
