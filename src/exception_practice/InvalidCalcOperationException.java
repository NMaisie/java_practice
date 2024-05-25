package exception_practice;

public class InvalidCalcOperationException extends Exception { //  InvalidCalcOperationException that is a subclass of Exception
char invalidOperation;
public InvalidCalcOperationException() {
    super("Invalid Operation: ");
}
public InvalidCalcOperationException(char invalidOperation){
    this(); // calls the default constructor
    this.invalidOperation = invalidOperation;

}

    public char getInvalidOperation() {
        return invalidOperation;
    }

    public void setInvalidOperation(char invalidOperation) {
        this.invalidOperation = invalidOperation;

}
    public String getMessage(){
    return super.getMessage()+invalidOperation+" was chosen";
    }
}
