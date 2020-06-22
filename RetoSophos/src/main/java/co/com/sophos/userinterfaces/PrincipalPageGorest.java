package co.com.sophos.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PrincipalPageGorest {
    public static final Target REST_CONSOLE = Target.the("User can choice {0} of principal Page").
            locatedBy("//*[text()= '{0}']");
}
