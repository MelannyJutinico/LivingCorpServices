package co.edu.unbosque.LivingCorpServices.exception;

import co.edu.unbosque.LivingCorpServices.model.BaseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ServiceProviderNotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<BaseResponse> handleServiceProviderNotFound(ServiceProviderNotFound ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND.value())
                .body(new BaseResponse(ex.getMessage(), HttpStatus.NOT_FOUND.value()));
    }

    @ExceptionHandler(ServiceRequestNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleServiceRequestNotFoundException(ServiceRequestNotFoundException ex) {
        return ex.getMessage();
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }
}
