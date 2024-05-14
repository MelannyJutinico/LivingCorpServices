package co.edu.unbosque.LivingCorpServices.services;

import co.edu.unbosque.LivingCorpServices.repository.IServiceRFQRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceRFQService {

    private final IServiceRFQRepository serviceRFQRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ServiceRFQService(IServiceRFQRepository serviceRFQRepository, ModelMapper modelMapper) {
        this.serviceRFQRepository = serviceRFQRepository;
        this.modelMapper = modelMapper;
    }
}
