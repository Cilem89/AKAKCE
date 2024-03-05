package UserStorys;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US05_SiparisListesiKontrolu extends Basedriver {

    @Test
    public void test(){
        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);

        WebElement girisyap= driver.findElement(By.xpath("//a[@href='/akakcem/giris/']"));
        girisyap.click();
        MyFunc.Bekle(2);

        WebElement eposta= driver.findElement(By.xpath("//input[@name='life']"));
        eposta.sendKeys("test@example.com");
        MyFunc.Bekle(2);

        WebElement sifre= driver.findElement(By.xpath("//input[@type='password']"));
        sifre.sendKeys("Password123");
        MyFunc.Bekle(2);

        WebElement girisyapbtn= driver.findElement(By.xpath("//input[@id='lfb']"));
        girisyapbtn.click();
        MyFunc.Bekle(2);


        WebElement hesabim= driver.findElement(By.xpath("//a[@href='/akakcem/']"));
        hesabim.click();
        MyFunc.Bekle(2);


        WebElement siparislerim= driver.findElement(By.xpath("//a[@href='/akakcem/siparislerim/']"));
        siparislerim.click();


        BekleKapat();

    }









}
