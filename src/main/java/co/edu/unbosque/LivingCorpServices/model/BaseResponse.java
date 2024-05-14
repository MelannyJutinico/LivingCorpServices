package co.edu.unbosque.LivingCorpServices.model;

import org.modelmapper.spi.ErrorMessage;

public class BaseResponse {

    private String message;
    private int code;
    private ErrorMessage errorMessage;

    public BaseResponse(String message, int code, ErrorMessage errorMessage) {
        this.message = message;
        this.code = code;
        this.errorMessage = errorMessage;
    }

    public BaseResponse(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ErrorMessage getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }
}
