package UserStorys;

import Utility.Basedriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US02_HesapDogrulamaKontrolu extends Basedriver {
    @Test
    public void HesapDogrulamaKontrol() {


        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);

        WebElement girisYap = driver.findElement(By.cssSelector("[href='/akakcem/giris/']"));
        girisYap.click();

        WebElement inputEmail = driver.findElement(By.cssSelector("[id='life']"));
        inputEmail.sendKeys("test@example.com");

        WebElement inputPassword = driver.findElement(By.cssSelector("[id='lifp']"));
        inputPassword.sendKeys("Password123");

        WebElement btnGirisYap = driver.findElement(By.cssSelector("[id='lfb']"));
        btnGirisYap.click();

        WebElement kullaniciAdi = driver.findElement(By.cssSelector("div[id='HM_v8']>:nth-child(1)>a"));

        Assert.assertTrue(kullaniciAdi.isDisplayed(), "Kullanıcı Adı görüntülenemedi");


        BekleKapat();
    }
}