package co.edu.unbosque.LivingCorpServices.services;

import co.edu.unbosque.LivingCorpServices.model.dto.ServiceRequestDTO;
import co.edu.unbosque.LivingCorpServices.repository.IServiceRequestRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceRequestService {

    private final IServiceRequestRepository serviceRequestRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ServiceRequestService(IServiceRequestRepository serviceRequestRepository, ModelMapper modelMapper) {
        this.serviceRequestRepository = serviceRequestRepository;
        this.modelMapper = modelMapper;
    }

    public List<ServiceRequestDTO> getAllServiceRequests() {
        return serviceRequestRepository
                .findAll()
                .stream()
                .map(serviceRequest -> modelMapper.map(serviceRequest, ServiceRequestDTO.class))
                .collect(Collectors.toList());
    }


}
