package co.edu.unbosque.LivingCorpServices.model.dto;

import java.util.Date;

public class ServiceRequestDTO {

    private int requestId;
    private Date requestDateTime;
    private WebUserDTO user;
    private PropertyDTO property;
    private ServiceProviderDTO serviceProvider;
    private String requestDescription;
    private Date serviceDateTime;

    public ServiceRequestDTO(int requestId, Date requestDateTime, WebUserDTO user, PropertyDTO property, ServiceProviderDTO serviceProvider, String requestDescription, Date serviceDateTime) {
        this.requestId = requestId;
        this.requestDateTime = requestDateTime;
        this.user = user;
        this.property = property;
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

    public Date getServiceDateTime() {
        return serviceDateTime;
    }

    public void setServiceDateTime(Date serviceDateTime) {
        this.serviceDateTime = serviceDateTime;
    }
}
