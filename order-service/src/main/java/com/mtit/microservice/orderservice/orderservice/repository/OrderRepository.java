package com.mtit.microservice.orderservice.orderservice.repository;

import com.mtit.microservice.orderservice.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

    @Query(nativeQuery = true, value = "Select * from order_tab d where d.cus_id = :cusId ")
    Order getOrdereByCustomer(@Param("cusId") String cusId);

}
