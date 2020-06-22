package co.com.sophos.tasks;

import co.com.sophos.models.Data;
import co.com.sophos.userinterfaces.PersonalData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static co.com.sophos.utils.Constant.Constant.*;

public class FinishBuy implements Task {
    Data data;

    public FinishBuy(Data data) {
        this.data = data;
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.getEmail()).into(PersonalData.EMAIL),
                Click.on(PersonalData.ACCEPT_BUTTON),
                Click.on(PersonalData.OPTION_SERVICE.of(SERVICE)),
                Enter.theValue(ADRESS).into(PersonalData.CHOISE_STORE).thenHit(Keys.ENTER),
                SelectFromOptions.byVisibleText(COUNTRY).from(PersonalData.OPTION_STORE),
                Click.on(PersonalData.CONFIRM)
        );
    }

    public static FinishBuy inTheWeb(Data data){
        return Tasks.instrumented(FinishBuy.class,data);
    }
}