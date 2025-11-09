package homework_16.exeption;

public class NotEnoughMoneyException extends RuntimeException {
    private String errorCode;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public NotEnoughMoneyException(String errorCode) {
        this.errorCode = errorCode;
    }
}
