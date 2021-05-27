package com.mtit.microservice.productservice.banksservice.repository;

import com.mtit.microservice.productservice.banksservice.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank,String > {
}
