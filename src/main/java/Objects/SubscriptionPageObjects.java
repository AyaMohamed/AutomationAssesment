package Objects;

import org.openqa.selenium.By;

public class SubscriptionPageObjects {


    public  By countryBtn= By.xpath("//a[@id='country-btn']");
    public  By countrySelect=By.id("country-selct");
    public  By bahrainCountryLink=By.id("bh");
    public  By kuwaitCountryLink=By.id("kw");
    public  By saudiCountryLink =By.id("sa");

    public  By litePlanType=By.id("name-lite");
    public  By currencyLite=By.xpath("//div[@id='currency-lite']/i");
    public  By priceLite=By.xpath("//div[@id='currency-lite']/b");
    public  By classicPlanType=By.id("name-classic");
    public  By currencyClassic=By.xpath("//div[@id='currency-classic']/i");
    public  By priceClassic=By.xpath("//div[@id='currency-classic']/b");
    public  By premiumPlanType=By.id("name-premium");
    public  By currencyPremium=By.xpath("//div[@id='currency-premium']/i");
    public  By pricePremium=By.xpath("//div[@id='currency-premium']/b");

}
