package co.edu.unbosque.LivingCorpServices.controller;

import co.edu.unbosque.LivingCorpServices.exception.ServiceProviderNotFound;
import co.edu.unbosque.LivingCorpServices.model.dto.ServiceProviderDTO;
import co.edu.unbosque.LivingCorpServices.model.dto.ServiceRFQDTO;
import co.edu.unbosque.LivingCorpServices.model.dto.ServiceRequestDTO;
import co.edu.unbosque.LivingCorpServices.model.dto.WebUserDTO;
import co.edu.unbosque.LivingCorpServices.services.ServiceProviderService;
import co.edu.unbosque.LivingCorpServices.services.ServiceRFQService;
import co.edu.unbosque.LivingCorpServices.services.ServiceRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class LivingCorpController implements ILivingCorpAPI{

    private final ServiceProviderService serviceProviderService;
    private final ServiceRequestService serviceRequestService;
    private final ServiceRFQService serviceRFQService;

    @Autowired
    public LivingCorpController(ServiceProviderService serviceProviderService, ServiceRequestService serviceRequestService, ServiceRFQService serviceRFQService) {
        this.serviceProviderService = serviceProviderService;
        this.serviceRequestService = serviceRequestService;
        this.serviceRFQService = serviceRFQService;
    }

    @Override
    public ResponseEntity<List<ServiceProviderDTO>> getAllProviders() {
        return ResponseEntity.ok(serviceProviderService.getAllServiceProviders());
    }

    @Override
    public ResponseEntity<List<ServiceProviderDTO>> getServiceProvidersByServiceType(String serviceType) {
        return ResponseEntity.ok(serviceProviderService.getServiceProvidersByServiceType(serviceType));
    }

    @Override
    public ResponseEntity<ServiceProviderDTO> createProvider(ServiceProviderDTO serviceProviderDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceProviderService.saveServiceProvider(serviceProviderDTO));
    }

    @Override
    public ResponseEntity<ServiceProviderDTO> getServiceProvidersById(int providerId) {
        ServiceProviderDTO serviceProviderDTO = serviceProviderService.getServiceProviderById(providerId);
            return ResponseEntity
                    .status(HttpStatus.OK.value())
                    .body(serviceProviderDTO);
    }

    @Override
    public ResponseEntity<List<ServiceRequestDTO>> getAllRequests() {
        return ResponseEntity.ok(serviceRequestService.getAllServiceRequests());
    }

    @Override
    public ResponseEntity<ServiceRequestDTO> getRequestsById(int requestId) {
        ServiceRequestDTO serviceRequestDTO = serviceRequestService.getServiceRequestsByServiceId(requestId);
        return ResponseEntity
                .status(HttpStatus.OK.value())
                .body(serviceRequestDTO);
    }

    @Override
    public ResponseEntity<List<ServiceRequestDTO>> getServiceRequestsByUser(String userName) {
        List<ServiceRequestDTO> serviceRequests = serviceRequestService.getServiceRequestsByUserName(userName);
        return ResponseEntity.ok(serviceRequests);
    }


    @Override
    public ResponseEntity<ServiceRequestDTO> createServiceRequest(ServiceRequestDTO serviceRequestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceRequestService.saveServiceRequest(serviceRequestDTO));
    }


    @Override
    public ResponseEntity<List<ServiceRFQDTO>> getAllRFQ() {
        return ResponseEntity.ok(serviceRFQService.getAllServicesRFQ());
    }

    @Override
    public ResponseEntity<ServiceRFQDTO> getServiceRFQById(int rfqId) {
        ServiceRFQDTO serviceRFQDTO = serviceRFQService.getServiceRFQById(rfqId);
        return ResponseEntity
                .status(HttpStatus.OK.value())
                .body(serviceRFQDTO);
    }

    @Override
    public ResponseEntity<List<ServiceRFQDTO>> getServiceRFQByUser(String  userName) {
        List<ServiceRFQDTO> serviceRFQRequests = serviceRFQService.getServiceRFQByUser(userName);
        return ResponseEntity.ok(serviceRFQRequests);
    }



    @Override
    public ResponseEntity<ServiceRFQDTO> createServiceRFQ(ServiceRFQDTO serviceRFQ) {
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceRFQService.saveServiceRFQ(serviceRFQ));
    }

}
