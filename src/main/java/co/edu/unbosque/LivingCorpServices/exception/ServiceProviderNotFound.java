package co.edu.unbosque.LivingCorpServices.exception;

public class ServiceProviderNotFound extends RuntimeException{
    public ServiceProviderNotFound(String message) {
        super(message);
    }
}
