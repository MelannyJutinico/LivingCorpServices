package co.edu.unbosque.LivingCorpServices.repository;

import co.edu.unbosque.LivingCorpServices.model.entity.ServiceProvider;
import co.edu.unbosque.LivingCorpServices.model.entity.ServiceRequest;
import co.edu.unbosque.LivingCorpServices.model.entity.WebUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IServiceRequestRepository extends JpaRepository<ServiceRequest, Integer> {

    List<ServiceRequest> findByUser(WebUser user);
    List<ServiceRequest> findByServiceProvider(ServiceProvider provider);

}
