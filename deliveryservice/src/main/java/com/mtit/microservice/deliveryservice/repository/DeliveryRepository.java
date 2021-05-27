package com.mtit.microservice.deliveryservice.repository;
import com.mtit.microservice.deliveryservice.model.DeliveryResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<DeliveryResponse,String >  {
}
