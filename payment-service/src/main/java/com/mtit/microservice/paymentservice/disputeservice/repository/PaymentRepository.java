package com.mtit.microservice.paymentservice.disputeservice.repository;

import com.mtit.microservice.paymentservice.disputeservice.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PaymentRepository extends JpaRepository<Payment,String > {

    @Query(nativeQuery = true, value = "Select * from payment p where p.product_id = :productId ")
    Payment findByProductId(@Param("productId") String productId);


    @Query(nativeQuery = true, value = "Select * from payment p where p.bank_code = :bankCode ")
    Payment getPaymentForBank(@Param("bankCode") String bankCode);

}
