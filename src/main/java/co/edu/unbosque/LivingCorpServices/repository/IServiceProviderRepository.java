package co.edu.unbosque.LivingCorpServices.repository;

import co.edu.unbosque.LivingCorpServices.model.entity.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IServiceProviderRepository extends JpaRepository<ServiceProvider, Integer> {

    List<ServiceProvider> findByServiceType(String serviceType);

}
