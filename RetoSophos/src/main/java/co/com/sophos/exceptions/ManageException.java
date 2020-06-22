package co.com.sophos.exceptions;

public class ManageException extends AssertionError{

    public ManageException (Throwable tw,String message)
    {
        super(message,tw);
    }
}
