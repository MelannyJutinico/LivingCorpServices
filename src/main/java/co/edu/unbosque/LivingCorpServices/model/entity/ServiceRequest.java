package co.edu.unbosque.LivingCorpServices.model.entity;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "SERVICE_REQUESTS")
public class ServiceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RQST_ID")
    private int requestId;
    @Column(name = "RQST_DATETIME")
    private Date requestDateTime;
    @Column(name="USER_NAME")
    private String userName;
    @Column(name="PROPERTY_ID")
    private int propertyId;
    @ManyToOne
    @JoinColumn(name = "SVC_PROVIDER_ID", referencedColumnName = "PROVIDER_ID")
    private ServiceProvider serviceProvider;
    @Column(name = "REQUEST_DESCRIPTION")
    private String requestDescription;
    @Column(name = "SVC_DATETIME")
    private Date serviceDateTime;

    public ServiceRequest(int requestId, Date requestDateTime, String userName, int propertyId, ServiceProvider serviceProvider, String requestDescription, Date serviceDateTime) {
        this.requestId = requestId;
        this.requestDateTime = requestDateTime;
        this.userName = userName;
        this.propertyId = propertyId;
        this.serviceProvider = serviceProvider;
        this.requestDescription = requestDescription;
        this.serviceDateTime = serviceDateTime;
    }

    public ServiceRequest() {
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

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
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
