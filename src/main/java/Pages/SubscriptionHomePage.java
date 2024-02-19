package Pages;

import Objects.SubscriptionPageObjects;
import org.openqa.selenium.WebDriver;

public class SubscriptionHomePage {

    private WebDriver driver;

    SubscriptionPageObjects objects=new SubscriptionPageObjects();

    public SubscriptionHomePage()
    {

    }

    public void clickOnCountryBtn()
    {
        driver.findElement(objects.getCountryBtn()).click();
    }

    public BahrainSubscriptionPage goToBahrainSubscription()
    {
        driver.findElement(objects.getBahrainCountryLink()).click();
        return new BahrainSubscriptionPage(driver);
    }

    public KuwaitSubscriptionPage goToKuwaitSubscription()
    {
        driver.findElement(objects.getBahrainCountryLink()).click();
        return new KuwaitSubscriptionPage(driver);
    }

    public SaudiSubscriptionPage goToSaudiSubscription()
    {
        driver.findElement(objects.getBahrainCountryLink()).click();
        return new SaudiSubscriptionPage(driver);
    }


}
