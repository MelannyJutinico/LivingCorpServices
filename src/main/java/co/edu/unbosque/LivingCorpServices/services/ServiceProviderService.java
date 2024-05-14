package co.edu.unbosque.LivingCorpServices.services;

import co.edu.unbosque.LivingCorpServices.exception.ServiceProviderNotFound;
import co.edu.unbosque.LivingCorpServices.model.dto.ServiceProviderDTO;
import co.edu.unbosque.LivingCorpServices.model.entity.ServiceProvider;
import co.edu.unbosque.LivingCorpServices.repository.IServiceProviderRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceProviderService {

    private final IServiceProviderRepository serviceProviderRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ServiceProviderService(IServiceProviderRepository serviceProviderRepository, ModelMapper modelMapper) {
        this.serviceProviderRepository = serviceProviderRepository;
        this.modelMapper = modelMapper;
    }

    public List<ServiceProviderDTO> getAllServiceProviders() {
        return serviceProviderRepository
                .findAll()
                .stream()
                .map(serviceProvider -> modelMapper.map(serviceProvider, ServiceProviderDTO.class))
                .collect(Collectors.toList());
    }

    public List<ServiceProviderDTO> getServiceProvidersByServiceType(String serviceType) {
        return serviceProviderRepository
                .findByServiceType(serviceType)
                .stream()
                .map(serviceProvider -> modelMapper.map(serviceProvider, ServiceProviderDTO.class))
                .collect(Collectors.toList());
    }

    public ServiceProviderDTO getServiceProviderById(int id) {
        return serviceProviderRepository
                .findById(id)
                .map(serviceProvider -> modelMapper.map(serviceProvider, ServiceProviderDTO.class))
                .orElseThrow(() -> new ServiceProviderNotFound("Proveedor con el id "+id+" no encontrado."));
    }

    public ServiceProviderDTO saveServiceProvider(ServiceProviderDTO serviceProviderDTO) {
        ServiceProvider serviceProvider = modelMapper.map(serviceProviderDTO, ServiceProvider.class);
        return modelMapper.map(serviceProviderRepository.save(serviceProvider), ServiceProviderDTO.class);
    }

    public void deleteServiceProvider(int serviceProviderId){
        serviceProviderRepository.deleteById(serviceProviderId);
    }





}
