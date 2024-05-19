package co.edu.unbosque.LivingCorpServices.model.dto;

import java.util.Date;

public class ServiceRequestDTO {

    private int requestId;
    private Date requestDateTime;
    private String userName;
    private int propertyId;
    private ServiceProviderDTO serviceProvider;
    private String requestDescription;
    private Date serviceDateTime;

    public ServiceRequestDTO(int requestId, Date requestDateTime, String userName, int propertyId, ServiceProviderDTO serviceProvider, String requestDescription, Date serviceDateTime) {
        this.requestId = requestId;
        this.requestDateTime = requestDateTime;
        this.userName = userName;
        this.propertyId = propertyId;
        this.serviceProvider = serviceProvider;
        this.requestDescription = requestDescription;
        this.serviceDateTime = serviceDateTime;
    }

    public ServiceRequestDTO() {
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public Date getRequestDateTime() {
        return requestDateTime;
    }

    public void setRequestDateTime(Date requestDateTime) {
        this.requestDateTime = requestDateTime;
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

    public Date getServiceDateTime() {
        return serviceDateTime;
    }

    public void setServiceDateTime(Date serviceDateTime) {
        this.serviceDateTime = serviceDateTime;
    }
}
