package co.edu.unbosque.LivingCorpServices.model.dto;

import java.util.Date;

public class ServiceRFQDTO {

    private int rfqId;
    private Date rfqDateTime;
    private String userName;
    private int propertyId;
    private ServiceProviderDTO serviceProvider;
    private String requestDescription;

    public ServiceRFQDTO(int rfqId, Date rfqDateTime, String userName, int propertyId, ServiceProviderDTO serviceProvider, String requestDescription) {
        this.rfqId = rfqId;
        this.rfqDateTime = rfqDateTime;
        this.userName = userName;
        this.propertyId = propertyId;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
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
