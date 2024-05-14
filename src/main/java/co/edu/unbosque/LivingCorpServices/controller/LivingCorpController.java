package co.edu.unbosque.LivingCorpServices.controller;

import co.edu.unbosque.LivingCorpServices.exception.ServiceProviderNotFound;
import co.edu.unbosque.LivingCorpServices.model.dto.ServiceProviderDTO;
import co.edu.unbosque.LivingCorpServices.services.ServiceProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class LivingCorpController implements ILivingCorpAPI{

    private final ServiceProviderService serviceProviderService;

    @Autowired
    public LivingCorpController(ServiceProviderService serviceProviderService) {
        this.serviceProviderService = serviceProviderService;
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
    public ResponseEntity<Void> deleteServiceProvidersById(int providerId) {
        serviceProviderService.deleteServiceProvider(providerId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


}
