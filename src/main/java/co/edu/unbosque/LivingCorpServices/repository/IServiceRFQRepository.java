package co.edu.unbosque.LivingCorpServices.repository;

import co.edu.unbosque.LivingCorpServices.model.entity.ServiceRFQ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceRFQRepository extends JpaRepository<ServiceRFQ, Integer> {
}
