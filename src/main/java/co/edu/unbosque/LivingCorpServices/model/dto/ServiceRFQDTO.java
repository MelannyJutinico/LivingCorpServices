package co.edu.unbosque.LivingCorpServices.model.dto;

import java.util.Date;

public class ServiceRFQDTO {

    private int rfqId;
    private Date rfqDateTime;
    private WebUserDTO user;
    private PropertyDTO property;
    private ServiceProviderDTO serviceProvider;
    private String requestDescription;

    public ServiceRFQDTO(int rfqId, Date rfqDateTime, WebUserDTO user, PropertyDTO property, ServiceProviderDTO serviceProvider, String requestDescription) {
        this.rfqId = rfqId;
        this.rfqDateTime = rfqDateTime;
        this.user = user;
        this.property = property;
        this.serviceProvider = serviceProvider;
        this.requestDescription = requestDescription;
    }

    public ServiceRFQDTO() {
    }

    public int getRfqId() {
        return rfqId;
    }

    public void setRfqId(int rfqId) {
        this.rfqId = rfqId;
    }

    public Date getRfqDateTime() {
        return rfqDateTime;
    }

    public void setRfqDateTime(Date rfqDateTime) {
        this.rfqDateTime = rfqDateTime;
    }

    public WebUserDTO getUser() {
        return user;
    }

    public void setUser(WebUserDTO user) {
        this.user = user;
    }

    public PropertyDTO getProperty() {
        return property;
    }

    public void setProperty(PropertyDTO property) {
        this.property = property;
    }

    public ServiceProviderDTO getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProviderDTO serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public void setRequestDescription(String requestDescription) {
        this.requestDescription = requestDescription;
    }
}
