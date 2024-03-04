package UserStorys;

import Utility.Basedriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class US07_HesapSilme extends Basedriver {

    @Test
    public void HesapSilme() {
        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);

        WebElement girisYap = driver.findElement(By.xpath("//a[text()='Giriş Yap']"));
        girisYap.click();

        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='life']"));
        inputEmail.sendKeys("test@example.com");
        wait.until(ExpectedConditions.visibilityOf(inputEmail));

        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='lifp']"));
        inputPassword.sendKeys("Password123");
        wait.until(ExpectedConditions.visibilityOf(inputPassword));


        WebElement loginButton = driver.findElement(By.xpath("//input[@id='lfb']"));
        loginButton.click();

        Actions actionDriver = new Actions(driver);

        WebElement hesabimProfil = driver.findElement(By.xpath("//a[@title='Hesabım']"));
        actionDriver.moveToElement(hesabimProfil).build().perform();


        WebElement hesabimButton = driver.findElement(By.xpath("//a[text()='Hesabım']"));
        actionDriver.moveToElement(hesabimButton).click().build().perform();
        MyFunc.Bekle(5);

        WebElement hesabimiSil1 = driver.findElement(By.xpath("//a[text()='Hesabımı Sil']"));
        actionDriver.moveToElement(hesabimiSil1).click().build().perform();

        WebElement sifreGir = driver.findElement(By.xpath("//input[@type='password']"));
        sifreGir.sendKeys("Password123");
        wait.until(ExpectedConditions.visibilityOf(sifreGir));


        WebElement hesabimiSil2 = driver.findElement(By.xpath("//input[@value='Hesabımı sil']"));
        hesabimiSil2.click();

        BekleKapat();
    }
}
