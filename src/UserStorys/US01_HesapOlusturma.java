package UserStorys;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class US01_HesapOlusturma extends Basedriver {
    @Test
    public void HesapOlusturma() {
        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);

        WebElement hesapOlustur = driver.findElement(By.xpath("//a[@href='/akakcem/giris/?m=1&s=1']"));
        hesapOlustur.click();

        WebElement ad = driver.findElement(By.xpath("//input[@id='rnufn']"));
        ad.sendKeys("TestUser");
        wait.until(ExpectedConditions.visibilityOf(ad));

        WebElement soyAd = driver.findElement(By.xpath("//input[@id='rnufs']"));
        soyAd.sendKeys("Tester");
        wait.until(ExpectedConditions.visibilityOf(soyAd));

        WebElement eposta = driver.findElement(By.xpath("//input[@id='rnufe1']"));
        eposta.sendKeys("test@example.com");
        wait.until(ExpectedConditions.visibilityOf(eposta));

        WebElement epostatekrar = driver.findElement(By.xpath("//input[@id='rnufe2']"));
        epostatekrar.sendKeys("test@example.com");
        wait.until(ExpectedConditions.visibilityOf(epostatekrar));


        WebElement sifre = driver.findElement(By.xpath("//input[@id='rnufp1']"));
        sifre.sendKeys("Password123");
        wait.until(ExpectedConditions.visibilityOf(sifre));

        WebElement sifretekrar = driver.findElement(By.xpath("//input[@id='rnufp2']"));
        sifretekrar.sendKeys("Password123");
        wait.until(ExpectedConditions.visibilityOf(sifretekrar));


        WebElement cinsiyet = driver.findElement(By.xpath("//input[@id='rngf']"));
        cinsiyet.click();
        wait.until(ExpectedConditions.visibilityOf(cinsiyet));

        WebElement il = driver.findElement(By.xpath("//select[@id='locpr']"));
        wait.until(ExpectedConditions.visibilityOf(il));

        Select ddIl = new Select(il);
        ddIl.selectByVisibleText("Aydın");
        wait.until(ExpectedConditions.visibilityOf(il));


        WebElement ilce = driver.findElement(By.xpath("//select[@id='locds']"));
        Select ddilce = new Select(ilce);
        ddilce.selectByVisibleText("Kuşadası");
        wait.until(ExpectedConditions.visibilityOf(ilce));


        WebElement dogumGunu = driver.findElement(By.xpath("//select[@id='bd']"));
        Select ddGun = new Select(dogumGunu);
        ddGun.selectByVisibleText("1");
        wait.until(ExpectedConditions.visibilityOf(dogumGunu));


        WebElement ay = driver.findElement(By.xpath("//select[@id='bm']"));
        Select dday = new Select(ay);
        dday.selectByVisibleText("1");
        wait.until(ExpectedConditions.visibilityOf(ay));


        WebElement yil = driver.findElement(By.xpath("//select[@id='by']"));
        Select ddyil = new Select(yil);
        ddyil.selectByVisibleText("1990");
        wait.until(ExpectedConditions.visibilityOf(yil));


        WebElement checkBox = driver.findElement(By.xpath("//input[@id='rnufpca']"));
        checkBox.click();

        WebElement btnHesapac = driver.findElement(By.xpath("//input[@id='rfb']"));
        btnHesapac.click();

        BekleKapat();

    }
}
