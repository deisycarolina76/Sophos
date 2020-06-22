package co.com.sophos.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PersonalData {
    public static final Target EMAIL=Target.the("field for input personal email")
            .locatedBy("//input[@id='delivery-email']");
    public static final Target ACCEPT_BUTTON=Target.the("button for accept email")
            .locatedBy("//button[@class='shipping-preference__submit']");
    public static final Target OPTION_SERVICE=Target.the("option service")
            .locatedBy("//*[text()='{0}']");
    public static final Target CHOISE_STORE = Target.the("choise de store").
            locatedBy("//input[@id='google-input']");
    public static final Target OPTION_STORE=Target.the("")
            .locatedBy("//select[@id='neighborhood']");
    public static final Target CONFIRM=Target.the("")
            .locatedBy("//button[@class='shipping-preference__submit modal-address__confirm']");
    public static final Target MESSAGE=Target.the("")
            .locatedBy("//div[@class='shipping-preference-success");

}