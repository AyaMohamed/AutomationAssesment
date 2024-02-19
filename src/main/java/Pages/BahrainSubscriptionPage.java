package Pages;

import Objects.SubscriptionPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BahrainSubscriptionPage {

    SubscriptionPageObjects objects = new SubscriptionPageObjects();
    WebDriver driver;

    public BahrainSubscriptionPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<String> getPlanTypeInBahrain() {
        List<String> planType = new ArrayList<>();
        List<WebElement> planTypeList = driver.findElements(objects.getPlanNamesList());
        for (WebElement current : planTypeList
        ) {
            planType.add(current.getText());
        }
        return planType;
    }


}
