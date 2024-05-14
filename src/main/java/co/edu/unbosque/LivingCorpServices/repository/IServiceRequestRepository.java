package co.edu.unbosque.LivingCorpServices.repository;

import co.edu.unbosque.LivingCorpServices.model.entity.ServiceRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceRequestRepository extends JpaRepository<ServiceRequest, Integer> {

}
