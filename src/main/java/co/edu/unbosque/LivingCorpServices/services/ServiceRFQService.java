package co.edu.unbosque.LivingCorpServices.services;

import co.edu.unbosque.LivingCorpServices.exception.ServiceRFQNotFoundException;
import co.edu.unbosque.LivingCorpServices.model.dto.ServiceProviderDTO;
import co.edu.unbosque.LivingCorpServices.model.dto.ServiceRFQDTO;
import co.edu.unbosque.LivingCorpServices.model.dto.WebUserDTO;
import co.edu.unbosque.LivingCorpServices.model.entity.ServiceProvider;
import co.edu.unbosque.LivingCorpServices.model.entity.ServiceRFQ;
import co.edu.unbosque.LivingCorpServices.model.entity.WebUser;
import co.edu.unbosque.LivingCorpServices.repository.IServiceRFQRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceRFQService {

    private final IServiceRFQRepository serviceRFQRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ServiceRFQService(IServiceRFQRepository serviceRFQRepository, ModelMapper modelMapper) {
        this.serviceRFQRepository = serviceRFQRepository;
        this.modelMapper = modelMapper;
    }

    public List<ServiceRFQDTO> getAllServicesRFQ() {
        return serviceRFQRepository
                .findAll()
                .stream()
                .map(servicesRFQ -> modelMapper.map(servicesRFQ, ServiceRFQDTO.class))
                .collect(Collectors.toList());
    }

    public ServiceRFQDTO getServiceRFQById(int rfqId) {
        return serviceRFQRepository
                .findById(rfqId)
                .map(servicesRFQ -> modelMapper.map(servicesRFQ, ServiceRFQDTO.class))
                .orElseThrow(() -> new ServiceRFQNotFoundException("Solicitud no encontrada"));
    }

    public List<ServiceRFQDTO> getServiceRFQByUser(WebUserDTO user) {
        WebUser webUser = modelMapper.map(user, WebUser.class);
        return serviceRFQRepository
                .findByUser(webUser)
                .stream()
                .map(servicesRFQ -> modelMapper.map(servicesRFQ, ServiceRFQDTO.class))
                .collect(Collectors.toList());
    }

    public List<ServiceRFQDTO> getServiceRFQByServiceProvider(ServiceProviderDTO serviceProviderDTO) {
        ServiceProvider provider = modelMapper.map(serviceProviderDTO, ServiceProvider.class);
        return serviceRFQRepository
                .findByServiceProvider(provider)
                .stream()
                .map(servicesRFQ -> modelMapper.map(servicesRFQ, ServiceRFQDTO.class))
                .collect(Collectors.toList());
    }

    public ServiceRFQDTO saveServiceRFQ(ServiceRFQDTO serviceRFQDTO) {
        ServiceRFQ serviceRequest = modelMapper.map(serviceRFQDTO, ServiceRFQ.class);
        return modelMapper.map(serviceRFQRepository.save(serviceRequest), ServiceRFQDTO.class);
    }


}
