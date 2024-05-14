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
    @ManyToOne
    @JoinColumn(name = "USER_NAME" , referencedColumnName = "USER_NAME")
    private WebUser user;
    @ManyToOne
    @JoinColumn(name = "PROPERTY_ID" , referencedColumnName = "PROPERTY_ID")
    private Property property;
    @ManyToOne
    @JoinColumn(name = "SVC_PROVIDER_ID")
    private ServiceProvider serviceProvider;
    @Column(name = "REQUEST_DESCRIPTION")
    private String requestDescription;

    public ServiceRFQ(int rfqId, Date rfqDateTime, WebUser user, Property property, ServiceProvider serviceProvider, String requestDescription) {
        this.rfqId = rfqId;
        this.rfqDateTime = rfqDateTime;
        this.user = user;
        this.property = property;
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

    public WebUser getUser() {
        return user;
    }

    public void setUser(WebUser user) {
        this.user = user;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
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
