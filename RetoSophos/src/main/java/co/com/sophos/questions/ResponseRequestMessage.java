package co.com.sophos.questions;

import co.com.sophos.userinterfaces.RestApiConsoleMenuGorest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ResponseRequestMessage implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(RestApiConsoleMenuGorest.REQUEST_RESPONSE).viewedBy(actor).asString();
    }
    public static ResponseRequestMessage contain(){
        return new ResponseRequestMessage();
    }
}