package co.edu.unbosque.LivingCorpServices.model.dto;

public class ServiceProviderDTO {

    private int providerId;
    private String providerEmail;
    private String serviceDescription;
    private String serviceType;
    private String servicePrice;


    public ServiceProviderDTO(int providerId, String providerEmail, String serviceDescription, String serviceType, String servicePrice) {
        this.providerId = providerId;
        this.providerEmail = providerEmail;
        this.serviceDescription = serviceDescription;
        this.serviceType = serviceType;
        this.servicePrice = servicePrice;
    }

    public ServiceProviderDTO() {
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

    public String getProviderEmail() {
        return providerEmail;
    }

    public void setProviderEmail(String providerEmail) {
        this.providerEmail = providerEmail;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(String servicePrice) {
        this.servicePrice = servicePrice;
    }
}
