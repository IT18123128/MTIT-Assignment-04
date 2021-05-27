package com.mtit.microservice.productservice.banksservice.repository;
import com.mtit.microservice.productservice.banksservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product ,String > {

}
