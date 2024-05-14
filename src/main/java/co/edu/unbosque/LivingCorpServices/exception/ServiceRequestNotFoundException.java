package co.edu.unbosque.LivingCorpServices.exception;

public class ServiceRequestNotFoundException extends RuntimeException{
    public ServiceRequestNotFoundException(String message){
        super(message);
    }
}
