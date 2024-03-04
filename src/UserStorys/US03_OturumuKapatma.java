package UserStorys;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US03_OturumuKapatma extends Basedriver {
    @Test
    public void OturumuKapatma(){

        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);
        WebElement giris= driver.findElement(By.xpath("(//a[@href='/akakcem/giris/'])[1]"));
        giris.click();

        WebElement eposta=driver.findElement(By.xpath("//input[@id='life']"));
        eposta.sendKeys("test@example.com");
        wait.until(ExpectedConditions.visibilityOf(eposta));

        WebElement sifre=driver.findElement(By.xpath("//input[@id='lifp']"));
        sifre.sendKeys("Password123");
        wait.until(ExpectedConditions.visibilityOf(sifre));

        WebElement girisYap=driver.findElement(By.xpath("//input[@id='lfb']"));
        girisYap.click();
        wait.until(ExpectedConditions.visibilityOf(girisYap));

        WebElement hesabim= driver.findElement(By.xpath("//a[@id='H_a_v8']"));
        hesabim.click();
        wait.until(ExpectedConditions.visibilityOf(hesabim));

        WebElement cikis=driver.findElement(By.xpath("//a[@href='#Çık']"));
        cikis.click();
        wait.until(ExpectedConditions.visibilityOf(cikis));







        BekleKapat();
    }
}
