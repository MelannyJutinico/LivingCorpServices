package co.edu.unbosque.LivingCorpServices.repository;

import co.edu.unbosque.LivingCorpServices.model.entity.ServiceProvider;
import co.edu.unbosque.LivingCorpServices.model.entity.ServiceRFQ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IServiceRFQRepository extends JpaRepository<ServiceRFQ, Integer> {

    List<ServiceRFQ> findByUserName(String userName);
    List<ServiceRFQ> findByServiceProvider(ServiceProvider serviceProvider);

}
