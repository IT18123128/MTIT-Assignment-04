package com.mtit.microservice.paymentservice.disputeservice.repository;

import com.mtit.microservice.paymentservice.disputeservice.model.Dispute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DisputeRepository extends JpaRepository<Dispute,String > {

    @Query(nativeQuery = true, value = "Select * from dispute d where d.customer_id = :customerId ")
    Dispute getDisputeByCustomer(@Param("customerId") String customerId);

}
