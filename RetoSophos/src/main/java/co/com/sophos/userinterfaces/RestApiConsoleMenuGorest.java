package co.com.sophos.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RestApiConsoleMenuGorest {
    public static final Target REQUEST_METHOD = Target.the("option to choice a request method").
            locatedBy("//select[@ng-model='request.method']");
    public static final Target ADD_DATA = Target.the("button for add more data to send in body").
            locatedBy("//*[@ng-click='addData($event)']");
    public static final Target FIRST_DATA = Target.the("First credential of user to send in request").
            locatedBy("(//input[@ng-model='data.name'])[1]");
    public static final Target SECOND_DATA = Target.the("Second credential of user to send in request").
            locatedBy("(//input[@ng-model='data.name'])[2]");
    public static final Target THIRD_DATA = Target.the("Third credential of user to send in request").
            locatedBy("(//input[@ng-model='data.name'])[3]");
    public static final Target FOUR_DATA = Target.the("Four credential of user to send in request").
            locatedBy("(//input[@ng-model='data.name'])[4]");

    public static final Target FIRST_VALUE = Target.the("First value of user to send in request").
            locatedBy("(//input[@ng-model='data.value'])[1]");
    public static final Target SECOND_VALUE = Target.the("Second value of user to send in request").
            locatedBy("(//input[@ng-model='data.value'])[2]");
    public static final Target THIRD_VALUE = Target.the("Third value of user to send in request").
            locatedBy("(//input[@ng-model='data.value'])[3]");
    public static final Target FOUR_VALUE = Target.the("Four value of user to send in request").
            locatedBy("(//input[@ng-model='data.value'])[4]");

    public static final Target SEND_BUTTON = Target.the("button to send credentials").
            locatedBy("//*[@class = 'btn btn-success']");
    public static final Target REQUEST_RESPONSE = Target.the("Response of request send").
            locatedBy("//*[@class = 'pre-scrollable ng-binding']");
}
