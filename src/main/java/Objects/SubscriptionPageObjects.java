package Objects;

import org.openqa.selenium.By;

public class SubscriptionPageObjects {


    private By countryBtn= By.xpath("//a[@id='country-btn']");
    private By countrySelect=By.id("country-selct");
    private By bahrainCountryLink=By.id("bh");
    private By kuwaitCountryLink=By.id("kw");
    private By saudiCountryLink =By.id("sa");

    private By litePlanType=By.id("name-lite");
    private By currencyAndPriceLite=By.id("currency-lite");
    //get price & currency using getText method
    //split the text to get currency & price separated

    private By classicPlanType=By.id("name-classic");
    private By currencyAndPriceClassic=By.id("currency-classic");

    private By premiumPlanType=By.id("name-premium");
    private By currencyAndPricePremium=By.id("currency-premium");

    public By getPlanNamesList() {
        return planNamesList;
    }

    private By planNamesList=By.xpath("(//div[@class='plan-names'])[1]");

    public By getCountryBtn() {
        return countryBtn;
    }

    public By getCountrySelect() {
        return countrySelect;
    }

    public By getBahrainCountryLink() {
        return bahrainCountryLink;
    }

    public By getKuwaitCountryLink() {
        return kuwaitCountryLink;
    }

    public By getSaudiCountryLink() {
        return saudiCountryLink;
    }

    public By getLitePlanType() {
        return litePlanType;
    }

    public By getCurrencyAndPriceLite() {
        return currencyAndPriceLite;
    }

    public By getClassicPlanType() {
        return classicPlanType;
    }

    public By getCurrencyAndPriceClassic() {
        return currencyAndPriceClassic;
    }

    public By getPremiumPlanType() {
        return premiumPlanType;
    }

    public By getCurrencyAndPricePremium() {
        return currencyAndPricePremium;
    }
}
