package co.com.sophos.questions;

import co.com.sophos.userinterfaces.PersonalData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class SuccessfullBuy implements Question<Boolean> {

    public Boolean answeredBy(Actor actor) {
        return Text.of(PersonalData.MESSAGE).viewedBy(actor).asBoolean();
    }
    public static SuccessfullBuy inTheWeb(){
        return new SuccessfullBuy();
    }
}