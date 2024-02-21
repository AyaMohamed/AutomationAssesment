package Keywords;

import Objects.SubscriptionPageObjects;
import Utilities.ExcelReaderClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class Keywords {

    private WebDriver driver;
    private SubscriptionPageObjects locators;
    private ExcelReaderClass excelReader;
    private static final String EXCEL_FILE_PATH = "src/main/resources/Keywords.CSV";

    public Keywords(WebDriver driver) {
        this.driver = driver;
        this.locators = new SubscriptionPageObjects();
        this.excelReader = new ExcelReaderClass(EXCEL_FILE_PATH);
    }

    private void clickOnCountryBtn() {
        driver.findElement(locators.countryBtn).click();
    }

    private void goToCountry(String country) {
        //driver.findElement(locators.countrySelect).click();
        clickOnCountryBtn();
        switch (country) {
            case "BH":
                driver.findElement(locators.bahrainCountryLink).click();
                break;
            case "KW":
                driver.findElement(locators.kuwaitCountryLink).click();
                break;
            case "SA":
                driver.findElement(locators.saudiCountryLink).click();
                break;
        }
    }

    public void performActions(String country) {
        goToCountry(country);
        List<String[]> lines = excelReader.readKeywords();
        for (String[] keywords : lines) {
            for (String keyword : keywords) {
                String action = keyword;
                switch (country) {
                    case "BH":
                        performActionsForCountry(action, "BHD");
                        break;
                    case "KW":
                        performActionsForCountry(keyword, "KWD");
                        break;
                    case "SA":
                        performActionsForCountry(keyword, "SAR");
                        break;
                    default:
                        break;
                }
            }
        }
    }

    private void performActionsForCountry(String action, String currency) {

        switch (action) {
            case "validateLitePlanType":
                validateLitePlanType();
                break;
            case "validateClassicPlanType":
                validateClassicPlanType();
                break;
            case "validatePremiumPlanType":
                validatePremiumPlanType();
                break;
            case "validateLitePlanCurrency":
                validateLitePlanCurrency(currency);
                break;
            case "validateClassicPlanCurrency":
                validateClassicPlanCurrency(currency);
                break;
            case "validatePremiumPlanCurrency":
                validatePremiumPlanCurrency(currency);
                break;
            case "validateLitePlanPrice":
                validateLitePlanPrice(currency);
                break;
            case "validateClassicPlanPrice":
                validateClassicPlanPrice(currency);
                break;
            case "validatePremiumPlanPrice":
                validatePremiumPlanPrice(currency);
                break;
            default:
                break;
        }
    }

    public void validateLitePlanType() {
        String actualPlanType = getLitePlanType();
        String expectedPlanType = "LITE";

        if (!actualPlanType.equals(expectedPlanType)) {
            throw new AssertionError("Lite plan type validation failed. Expected: " + expectedPlanType + ", Actual: " + actualPlanType);
        } else
            System.out.println("Lite Plan type validation is passed successfully");
    }

    public void validateClassicPlanType() {
        String actualPlanType = getClassicPlanType();
        String expectedPlanType = "CLASSIC";

        if (!actualPlanType.equals(expectedPlanType)) {
            throw new AssertionError("Classic plan type validation failed. Expected: " + expectedPlanType + ", Actual: " + actualPlanType);
        } else
            System.out.println("Classic Plan type validation is passed successfully");
    }

    public void validatePremiumPlanType() {
        String actualPlanType = getPremiumPlanType();
        String expectedPlanType = "PREMIUM";

        if (!actualPlanType.equals(expectedPlanType)) {
            throw new AssertionError("PREMIUM plan type validation failed. Expected: " + expectedPlanType + ", Actual: " + actualPlanType);
        } else
            System.out.println("Premium Plan type validation is passed successfully");
    }


    private void validateLitePlanCurrency(String expectedCurrency) {
        String actualCurrency = getLitePlanCurrency();
        if (!actualCurrency.contains(expectedCurrency)) {
            throw new AssertionError("Lite Plan currency validation failed. Expected: " + expectedCurrency + ", Actual: " + actualCurrency);
        } else
            System.out.println("Lite Plan currency validation is passed successfully");
    }

    private void validateClassicPlanCurrency(String expectedCurrency) {
        String actualCurrency = getClassicPlanCurrency();
        if (!actualCurrency.contains(expectedCurrency)) {
            throw new AssertionError("Classic Plan currency validation failed. Expected: " + expectedCurrency + ", Actual: " + actualCurrency);
        } else
            System.out.println("Classic Plan currency validation is passed successfully");
    }

    private void validatePremiumPlanCurrency(String expectedCurrency) {
        String actualCurrency = getPremiumPlanCurrency();
        if (!actualCurrency.contains(expectedCurrency)) {
            throw new AssertionError("Premium Plan currency validation failed. Expected: " + expectedCurrency + ", Actual: " + actualCurrency);
        } else
            System.out.println("Premium Plan currency validation is passed successfully");
    }

    private void validateLitePlanPrice(String currency) {
        String actualPrice = getLitePlanPrice();
        String expectedPrice = "";
        switch (currency) {
            case "SAR":
                expectedPrice = "15";
                break;
            case "KWD":
                expectedPrice="1.2";
                break;
            case "BHD":
                expectedPrice="2";
                break;
        }
        if (!actualPrice.equals(expectedPrice)) {
            throw new AssertionError("Lite Plan price validation failed. Expected: " + expectedPrice + ", Actual: " + actualPrice);
        } else
            System.out.println("Lite Plan Price validation is passed successfully");
    }


    private void validateClassicPlanPrice(String currency) {
        String actualPrice = getClassicPlanPrice();
        String expectedPrice = "";
        switch (currency) {
            case "SAR":
                expectedPrice = "25";
                break;
            case "KWD":
                expectedPrice="2.5";
                break;
            case "BHD":
                expectedPrice="3";
                break;
        }
        if (!actualPrice.equals(expectedPrice)) {
            throw new AssertionError("Classic Plan price validation failed. Expected: " + expectedPrice + ", Actual: " + actualPrice);
        } else
            System.out.println("Classic Plan price validation is passed successfully");
    }

    private void validatePremiumPlanPrice(String currency) {

        String actualPrice = gePremiumPlanPrice();
        String expectedPrice = "";
        switch (currency) {
            case "SAR":
                expectedPrice = "60";
                break;
            case "KWD":
                expectedPrice="4.8";
                break;
            case "BHD":
                expectedPrice="6";
                break;
        }
        if (!actualPrice.equals(expectedPrice)) {
            throw new AssertionError("Premium Plan price validation failed. Expected: " + expectedPrice + ", Actual: " + actualPrice);
        } else
            System.out.println("Premium Plan Price validation is passed successfully");
    }

    public String getLitePlanType() {
        String planType = "";
        planType = driver.findElement(locators.litePlanType).getText();
        return planType;
    }

    public String getClassicPlanType() {
        String planType = "";
        planType = driver.findElement(locators.classicPlanType).getText();
        return planType;
    }

    public String getPremiumPlanType() {
        String planType = "";
        planType = driver.findElement(locators.premiumPlanType).getText();
        return planType;
    }

    private String getLitePlanCurrency() {
        return driver.findElement(locators.currencyLite).getText();
    }

    private String getClassicPlanCurrency() {
        return driver.findElement(locators.currencyClassic).getText();
    }

    private String getPremiumPlanCurrency() {
        return driver.findElement(locators.currencyPremium).getText();
    }

    private String getLitePlanPrice() {
        return driver.findElement(locators.priceLite).getText();
    }

    private String getClassicPlanPrice() {
        return driver.findElement(locators.priceClassic).getText();
    }

    private String gePremiumPlanPrice() {
        return driver.findElement(locators.pricePremium).getText();
    }
}
