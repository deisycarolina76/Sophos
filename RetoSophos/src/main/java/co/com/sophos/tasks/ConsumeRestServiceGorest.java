package co.com.sophos.tasks;

import co.com.sophos.models.CredentialsRestService;
import co.com.sophos.userinterfaces.PrincipalPageGorest;
import co.com.sophos.userinterfaces.RestApiConsoleMenuGorest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class ConsumeRestServiceGorest implements Task {
    private CredentialsRestService credentialsRestService;

    public ConsumeRestServiceGorest(CredentialsRestService credentialsRestService) {
        this.credentialsRestService = credentialsRestService;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PrincipalPageGorest.REST_CONSOLE.of("Rest Console")),
                SelectFromOptions.byVisibleText(credentialsRestService.getRequestmethod()).
                        from(RestApiConsoleMenuGorest.REQUEST_METHOD),
                Enter.theValue(credentialsRestService.getFirstname()).
                        into(RestApiConsoleMenuGorest.FIRST_DATA),
                Enter.theValue(credentialsRestService.getFirstvalue()).
                        into(RestApiConsoleMenuGorest.FIRST_VALUE),
                Click.on(RestApiConsoleMenuGorest.ADD_DATA),
                Enter.theValue(credentialsRestService.getLastname()).
                        into(RestApiConsoleMenuGorest.SECOND_DATA),
                Enter.theValue(credentialsRestService.getLastvalue()).
                        into(RestApiConsoleMenuGorest.SECOND_VALUE),
                Click.on(RestApiConsoleMenuGorest.ADD_DATA),
                Enter.theValue(credentialsRestService.getGender()).
                        into(RestApiConsoleMenuGorest.THIRD_DATA),
                Enter.theValue(credentialsRestService.getGendervalue()).
                        into(RestApiConsoleMenuGorest.THIRD_VALUE),
                Click.on(RestApiConsoleMenuGorest.ADD_DATA),
                Enter.theValue(credentialsRestService.getEmail()).
                        into(RestApiConsoleMenuGorest.FOUR_DATA),
                Enter.theValue(credentialsRestService.getEmailvalue()).
                        into(RestApiConsoleMenuGorest.FOUR_VALUE),
                Click.on(RestApiConsoleMenuGorest.SEND_BUTTON));
    }
    public static ConsumeRestServiceGorest in(CredentialsRestService credentialsRestService){
        return Tasks.instrumented(ConsumeRestServiceGorest.class, credentialsRestService);
    }
}