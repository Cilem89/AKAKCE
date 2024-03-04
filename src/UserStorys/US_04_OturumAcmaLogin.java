package UserStorys;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_04_OturumAcmaLogin extends Basedriver {
    @Test
    public void OturumAcmaLogin(){
        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);


        WebElement girisYap= driver.findElement(By.xpath("//a[text()='Giriş Yap']"));
        girisYap.click();

        WebElement emailin=driver.findElement(By.xpath("//input[@id='life']"));
        emailin.sendKeys("test@example.com");

        WebElement passwordin=driver.findElement(By.xpath("//input[@id='lifp']"));
        passwordin.sendKeys("Password123");

        WebElement loginbutton=driver.findElement(By.xpath("//input[@id='lfb']"));
        loginbutton.click();

        BekleKapat();

    }
}
