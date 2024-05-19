package co.edu.unbosque.LivingCorpServices.services;

import co.edu.unbosque.LivingCorpServices.exception.ServiceRequestNotFoundException;
import co.edu.unbosque.LivingCorpServices.model.dto.ServiceProviderDTO;
import co.edu.unbosque.LivingCorpServices.model.dto.ServiceRequestDTO;
import co.edu.unbosque.LivingCorpServices.model.entity.ServiceProvider;
import co.edu.unbosque.LivingCorpServices.model.entity.ServiceRequest;
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

    public ServiceRequestDTO getServiceRequestsByServiceId(int serviceId) {
        return serviceRequestRepository
                .findById(serviceId)
                .map(serviceRequest -> modelMapper.map(serviceRequest, ServiceRequestDTO.class))
                .orElseThrow(() -> new ServiceRequestNotFoundException("Solicitud no encontrada"));
    }

   public List<ServiceRequestDTO> getServiceRequestsByUserName(String userName) {
        return serviceRequestRepository
                .findByUserName(userName)
                .stream()
                .map(serviceRequest -> modelMapper.map(serviceRequest, ServiceRequestDTO.class))
                .collect(Collectors.toList());
   }

    public List<ServiceRequestDTO> getServiceRequestsByServiceProvider(ServiceProviderDTO serviceProviderDTO) {
        ServiceProvider provider = modelMapper.map(serviceProviderDTO, ServiceProvider.class);
        return serviceRequestRepository
                .findByServiceProvider(provider)
                .stream()
                .map(serviceRequest -> modelMapper.map(serviceRequest, ServiceRequestDTO.class))
                .collect(Collectors.toList());
    }

    public ServiceRequestDTO saveServiceRequest(ServiceRequestDTO serviceRequestDTO) {
        ServiceRequest serviceRequest = modelMapper.map(serviceRequestDTO, ServiceRequest.class);
        return modelMapper.map(serviceRequestRepository.save(serviceRequest), ServiceRequestDTO.class);
    }


}
