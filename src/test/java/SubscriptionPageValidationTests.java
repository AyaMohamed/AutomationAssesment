import org.testng.annotations.Test;

public class SubscriptionPageValidationTests extends BaseTests {

    @Test
    public void testBahrainActions() {
        keywords.performActions("BH");
    }

    @Test
    public void testKuwaitActions() {
        keywords.performActions("KW");
    }

    @Test
    public void testSaudiArabiaActions() {
        keywords.performActions("SA");
    }

}
