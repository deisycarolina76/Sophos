package co.com.sophos.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PrincipalProductMenu {

     public static final Target CANCEL_MESSAGE=Target.the("the notification")
             .locatedBy("//button[@id=\"onesignal-popover-cancel-button\"]");
     public static final Target PRODUCT= Target.the("Choose the food product")
            .locatedBy("//*[text()='{0}']");
     public static final Target ADD=Target.the("product")
             .locatedBy("(//button[@class='product-add-to-cart product-add-to-cart--product-view btn red add-to-cart'])[2]");
}