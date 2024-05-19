package co.edu.unbosque.LivingCorpServices.model.entity;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "SERVICE_RFQ")
public class ServiceRFQ {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RFQ_ID")
    private int rfqId;
    @Column(name = "RFQ_DATETIME")
    private Date rfqDateTime;
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name="PROPERTY_ID")
    private int propertyId;
    @ManyToOne
    @JoinColumn(name = "SVC_PROVIDER_ID")
    private ServiceProvider serviceProvider;
    @Column(name = "REQUEST_DESCRIPTION")
    private String requestDescription;

    public ServiceRFQ(int rfqId, Date rfqDateTime, String userName, int propertyId, ServiceProvider serviceProvider, String requestDescription) {
        this.rfqId = rfqId;
        this.rfqDateTime = rfqDateTime;
        this.userName = userName;
        this.propertyId = propertyId;
        this.serviceProvider = serviceProvider;
        this.requestDescription = requestDescription;
    }

    public ServiceRFQ() {
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
}
