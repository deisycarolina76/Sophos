package co.com.sophos.tasks;

import co.com.sophos.models.Data;
import co.com.sophos.userinterfaces.PrincipalProductMenu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class SelectProduct implements Task {

    Data product;

    public SelectProduct(Data product) {
        this.product = product;
    }

    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Click.on(PrincipalProductMenu.CANCEL_MESSAGE),
               Click.on(PrincipalProductMenu.PRODUCT.of(product.getProduct())),
               Click.on(PrincipalProductMenu.ADD));

       actor.attemptsTo(FinishBuy.inTheWeb(product));

    }
    public static SelectProduct inTheWeb(Data product){
        return Tasks.instrumented(SelectProduct.class,product);
    }
}